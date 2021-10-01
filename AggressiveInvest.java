package com.cryptoApp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AggressiveInvest implements ActionListener {
  JFrame aggInvest = new JFrame();
  JLabel aggLabel = new JLabel("Aggressive Investment Page");
  JButton menuButton = new JButton("Back to Main Menu");

  AggressiveInvest() {

    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    int height = screenSize.height;
    int width = screenSize.width;


    aggInvest.setSize(width/2, height/2);
    aggInvest.add(aggLabel);
    aggInvest.setSize(750, 500);
    aggInvest.setLayout(null);
    aggInvest.setVisible(true);
    aggInvest.add(menuButton);
    aggInvest.setLocationRelativeTo(null);


    aggLabel.setBounds(10, 0, 500, 50);
    aggLabel.setFont(new Font(null, Font.PLAIN, 25));

    menuButton.setBounds(50, 100, 200, 50);
    menuButton.setFocusable(false);
    menuButton.addActionListener(this);


  }

  @Override
  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == menuButton) {
      new Menu();
      aggInvest.dispose();
    }
  }
}
