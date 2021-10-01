package com.cryptoApp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LongTermInvest implements ActionListener {
  JFrame longInvest = new JFrame();
  JLabel longLabel = new JLabel("Long Term Investment Page");
  JButton menuButton = new JButton("Back to Main Menu");
  JLabel image=new JLabel(new ImageIcon("CryptoAppInvestment/longterm.gif"));


  LongTermInvest() {
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    int height = screenSize.height;
    int width = screenSize.width;
    addImage();

    longInvest.setSize(width/2,height/2);
    longInvest.add(longLabel);
    longInvest.setSize(750,500);
    longInvest.setLayout(null);
    longInvest.setVisible(true);
    longInvest.add(menuButton);
    longInvest.setLocationRelativeTo(null);

    longLabel.setBounds(10,0,500,50);
    longLabel.setFont(new Font(null,Font.PLAIN, 25));

    menuButton.setBounds(50,350,200,50);
    menuButton.setFocusable(false);
    menuButton.addActionListener(this);
    }
  public void addImage() {
    image.setSize(600, 200);
    longInvest.add(image);
    image.setBounds(200, 10, 600, 400);
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == menuButton) {
      new Menu();
      longInvest.dispose();
      SimpleGUIProgram.DISPOSE_ON_CLOSE();
    }
  }
}
