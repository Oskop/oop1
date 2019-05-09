package ui;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.table.*;
import java.sql.*;
import util.*;

public class MainUI extends JFrame{

  public static Koneksi koneksi;
  public static TambahUI tambahUI;
  public static UbahUI ubahUI;

  private JTable table;
  private JButton btnTambah;
  private JButton btnUbah;
  private JButton btnHapus;
  private JPanel panelButton;
  private Container contenPane;
  private JScrollPane scrollPane;
  private DefaultTableModel tableModel;
  private Vector data;
  private Vector columnNames;

  public MainUI(){
    try {
      koneksi = new Koneksi();
    } catch(SQLException e) {
      JOptionPane.showMessageDialog(this, "Gagal Koneksi");
    }
    initUI();
    initData();
  }

  private void initData(){
    try {
      ResultSet result = koneksi.eksekusiSelect("SELECT * FROM profile");
      data = new Vector();
      while (result.next()) {
        Vector row = new Vector();
        row.add(result.getInt(1));
        row.add(result.getString(2));
        row.add(result.getString(3));
        data.add(row);
      }
      tableModel.setDataVector(data, columnNames);
    } catch(SQLException e) {
      JOptionPane.showMessageDialog(this, "query gagal di eksekusi");
    }
  }

  public void refreshTable(){
    initData();
  }

  private void initUI(){
    setTitle("Aplikasi Mahasiswa");

    tambahUI = new TambahUI(this);
    ubahUI = new UbahUI(this);

    contenPane = getContentPane();

    columnNames = new Vector();
    columnNames.add("ID");
    columnNames.add("NAMA");
    columnNames.add("ALAMAT");
    data = new Vector();
    tableModel = new DefaultTableModel(null, columnNames);
    table = new JTable(tableModel);
    table.setSelectionModel(new MySingleSelectionModel());
    scrollPane = new JScrollPane(table);
    contenPane.add(scrollPane, BorderLayout.CENTER);

    panelButton = new JPanel();
    panelButton.setLayout(new GridLayout(1, 3));
    btnTambah = new JButton("Tambah");
    btnUbah = new JButton("Ubah");
    btnHapus = new JButton("Hapus");
    panelButton.add(btnTambah);
    panelButton.add(btnUbah);
    panelButton.add(btnHapus);
    contenPane.add(panelButton, BorderLayout.SOUTH);

    pack();
    setVisible(true);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    btnTambah.addActionListener(new btnTambahClick());
    btnUbah.addActionListener(new btnUbahClick());
    btnHapus.addActionListener(new btnHapusClick());
  }

  // event

  private class btnTambahClick implements ActionListener {
    public void actionPerformed(ActionEvent evt){
      tambahUI.clearform();
      tambahUI.setVisible(true);
    }
  }

  private class btnUbahClick implements ActionListener {
    public void actionPerformed(ActionEvent evt){
      if (table.getSelectedRow()!=-1) {
        ubahUI.tampilkan(
          ""+table.getValueAt(table.getSelectedRow(),0),
          table.getValueAt(table.getSelectedRow(),1).toString(),
          (String) table.getValueAt(table.getSelectedRow(),2));
      }else {
        JOptionPane.showMessageDialog(null,
                      "Pilih data yang akan diubah");
      }
    }
  }

  private class btnHapusClick implements ActionListener {
    public void actionPerformed(ActionEvent evt){
      if (table.getSelectedRow()!=-1) {
        String id = table.getValueAt(table.getSelectedRow(), 0).toString();
        String query = "delete from profile "+
                        "where id=" + id;
        try {
          koneksi.eksekusiUpdate(query);
          JOptionPane.showMessageDialog(null, "Data dengan id = "+ id +" telah dihapus.");
          refreshTable();
        } catch(SQLException e) {
          JOptionPane.showMessageDialog(null, "Gagal menghapus data.");
        }
      }
    }
  }
}
