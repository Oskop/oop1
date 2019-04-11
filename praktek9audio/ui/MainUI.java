package ui;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import util.*;
import javax.sound.sampled.*;
import java.io.*;

public class MainUI extends JFrame {

  private MyPlayer player;
  private JButton btnPlay;
  private JButton btnStop;
  private Container pane;

  public MainUI(){
    initUI();
    try {
        player = new MyPlayer("./audio/sss.au");
    }catch (UnsupportedAudioFileException e) {
      JOptionPane.showMessageDialog(this, "Format File Tidak Diduking");
    }catch (LineUnavailableException e) {
      JOptionPane.showMessageDialog(this, "Hubungi Developer");
    }catch (IOException e) {
      JOptionPane.showMessageDialog(this, "File tidak dapat diakses");
    }
  }

  private void initUI(){
    btnPlay = new JButton("Putar");
    btnStop = new JButton("Hentikan");

    pane = getContentPane();
    pane.setLayout(new FlowLayout(FlowLayout.LEFT));
    pane.add(btnPlay);
    pane.add(btnStop);

    pack();
    setVisible(true);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    btnPlay.addActionListener(new BtnPlayClick());
    btnStop.addActionListener(new BtnStopClick());
  }

  // --------------- event

  class BtnPlayClick implements ActionListener {
    public void actionPerformed(ActionEvent event){
      try {
          player.play();
      } catch(Exception e) {
          JOptionPane.showMessageDialog(null, "Hubungi Developer");
      }
    }
  }

  class BtnStopClick implements ActionListener {
    public void actionPerformed(ActionEvent event){
      try {
          player.stop();
      } catch(Exception e) {
          JOptionPane.showMessageDialog(null, "Hubungi Developer");
      }
    }
  }
}
