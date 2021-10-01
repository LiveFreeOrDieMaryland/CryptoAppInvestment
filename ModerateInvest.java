package com.cryptoApp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ModerateInvest implements ActionListener{
    JFrame modInvest = new JFrame();
    JLabel modLabel = new JLabel("Moderate Investment Page");
    JButton menuButton = new JButton("Back to Main Menu");

    ModerateInvest() {

      Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
      int height = screenSize.height;
      int width = screenSize.width;


      modInvest.setSize(width/2, height/2);
      modInvest.add(modLabel);
      modInvest.setSize(750, 500);
      modInvest.setLayout(null);
      modInvest.setVisible(true);
      modInvest.add(menuButton);
      modInvest.setLocationRelativeTo(null);


      modLabel.setBounds(10, 0, 500, 50);
      modLabel.setFont(new Font(null, Font.PLAIN, 25));

      menuButton.setBounds(50, 100, 200, 50);
      menuButton.setFocusable(false);
      menuButton.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
      if (e.getSource() == menuButton) {
        new Menu();
        modInvest.dispose();
      }
    }
  }
