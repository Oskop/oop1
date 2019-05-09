package ui;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class UbahUI extends JFrame {
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

  public UbahUI(MainUI parent){
    this.parent = parent;
    initUI();
  }

  private void initUI(){
    setTitle("Ubah Data Mahasiswa");

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
    txtId.setEditable(false);
  }

  public void tampilkan(String id, String nama, String alamat){
    txtId.setText(id);
    txtNama.setText(nama);
    txtAlamat.setText(alamat);
    setVisible(true);
  }

  // event

  private class BtnSimpanClick implements ActionListener {
    public void actionPerformed(ActionEvent evt){
      String query = "update profile set "+
                      "nama='"+txtNama.getText()+"', "+
                      "alamat='"+txtAlamat.getText()+"' "+
                      "where id="+txtId.getText()+"";
      try {
        MainUI.koneksi.eksekusiUpdate(query);
        JOptionPane.showMessageDialog(null, "Data berhasil diubah");
        setVisible(false);
        parent.refreshTable();
      } catch(SQLException e) {
        JOptionPane.showMessageDialog(null, "Data gagal diubah");
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
