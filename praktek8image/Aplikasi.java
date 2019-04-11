import javax.swing.*;
import java.awt.*;

public class Aplikasi{

  public static void main(String[] args) {
    JFrame frame = new JFrame();
    ImageIcon img = new ImageIcon("58206608_p0.jpg");
    JLabel lbl = new JLabel(img);

    frame.add(lbl);
    frame.pack();
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}
