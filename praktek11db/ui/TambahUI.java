package ui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class TambahUI extends JFrame {

  private Container contenPane;
  private JPanel panelForm;
  private JPanel panelButton;
  private JLabel lblId;
  private JLabel lblNama;
  private JLabel lblAlamat;
  private JTextField txtId;
  private JTextField txtNama;
  private JTextField txtAlamat;
  private JButton btnSimpan;
  private JButton btnBatal;
  private MainUI parent;


  public TambahUI(MainUI parent){
    initUI();
    this.parent = parent;
  }

  private void initUI(){
    setTitle("Tambah Data Mahasiswa");

    contenPane = getContentPane();

    panelForm = new JPanel();
    panelForm.setLayout(new GridLayout(3, 2));
    lblId = new JLabel("Id");
    lblNama = new JLabel("Nama");
    lblAlamat = new JLabel("Alamat");
    txtId = new JTextField();
    txtNama = new JTextField();
    txtAlamat = new JTextField();
    panelForm.add(lblId); panelForm.add(txtId);
    panelForm.add(lblNama); panelForm.add(txtNama);
    panelForm.add(lblAlamat); panelForm.add(txtAlamat);
    contenPane.add(panelForm, BorderLayout.CENTER);

    panelButton = new JPanel();
    panelButton.setLayout(new GridLayout(1, 2));
    btnSimpan = new JButton("Simpan");
    btnBatal = new JButton("Batal");
    panelButton.add(btnSimpan); panelButton.add(btnBatal);
    contenPane.add(panelButton, BorderLayout.SOUTH);

    pack();

    btnSimpan.addActionListener(new BtnSimpanClick());
    btnBatal.addActionListener(new BtnBatalClick());
  }

  public void clearform(){
    txtId.setText("");
    txtNama.setText("");
    txtAlamat.setText("");
  }

  // event

  private class BtnSimpanClick implements ActionListener {
    public void actionPerformed(ActionEvent evt){
      String id = txtId.getText();
      String nama = txtNama.getText();
      String alamat = txtAlamat.getText();
      String query = "insert into profile(id, nama, alamat) "+
                      "values ('"+id+"', '"+nama+"', '"+alamat+"')";
      try {
        MainUI.koneksi.eksekusiUpdate(query);
        JOptionPane.showMessageDialog(null, "Data berhasil disimpan");
        setVisible(false);
        parent.refreshTable();
      } catch(SQLException e) {
        JOptionPane.showMessageDialog(null, "Gagal Menyimpan data");
        e.printStackTrace();
      }
    }
  }

  private class BtnBatalClick implements ActionListener {
    public void actionPerformed(ActionEvent evt){
      setVisible(false);
    }
  }
}
