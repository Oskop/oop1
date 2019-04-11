import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Aplikasi{

  private static JTextField txtNIM;
  private static JTextField txtNama;
  private static JTextField txtKelas;

  public static void main(String[] args) {
    JFrame frame = new JFrame();
    JLabel label = new JLabel("Oskop");
    JPanel panel = new JPanel();
    panel.setLayout(new GridLayout(3, 2));
    JButton btn = new JButton("Proses");
    btn.addActionListener(new BtnClick());
    JLabel lblNIM = new JLabel("NIM");
    JLabel lblNama = new JLabel("NAMA");
    JLabel lblKelas = new JLabel("Kelas");
    txtNIM = new JTextField();
    txtNama = new JTextField();
    txtKelas = new JTextField();

    panel.add(lblNIM); panel.add(txtNIM);
    panel.add(lblNama); panel.add(txtNama);
    panel.add(lblKelas); panel.add(txtKelas);

    frame.getContentPane().add(panel, BorderLayout.CENTER);
    frame.getContentPane().add(btn, BorderLayout.SOUTH);
    frame.pack();
    frame.setMinimumSize(new Dimension(300, 200));
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

  static class BtnClick implements ActionListener {
    public void actionPerformed(ActionEvent event){
      JOptionPane.showMessageDialog(null,
        txtNIM.getText() + " - "+
        txtNama.getText()+ " - "+
        txtKelas.getText());
    }
  }
}
