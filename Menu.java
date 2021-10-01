package com.cryptoApp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu implements ActionListener {
  JFrame menu = new JFrame("Welcome to your first step into Cryptocurrencies");
  JButton aggButton = new JButton("Aggressive Investment Window");
  JButton modButton = new JButton("Moderate Investment Window");
  JButton longButton = new JButton("Long Term Investment Window");


  Menu() {
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    int height = screenSize.height;
    int width = screenSize.width;

    menu.setSize(width / 2, height / 2);
    menu.add(aggButton);
    menu.add(modButton);
    menu.add(longButton);

    menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    menu.setSize(750, 500);
    menu.setLocationRelativeTo(null);
    menu.setLayout(null);
    menu.setVisible(true);

    aggButton.setBounds(50, 100, 300, 50);
    aggButton.setFocusable(false);
    aggButton.addActionListener(this);
    modButton.setBounds(50, 200, 300, 50);
    modButton.setFocusable(false);
    modButton.addActionListener(this);
    longButton.setBounds(50, 300, 300, 50);
    longButton.setFocusable(false);
    longButton.addActionListener(this);
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == aggButton) {
      AggressiveInvest aggressiveInvest = new AggressiveInvest();
      menu.dispose();
    }
    if (e.getSource() == modButton) {
      ModerateInvest moderateInvest = new ModerateInvest();
      menu.dispose();
    }
    if (e.getSource() == longButton) {
      LongTermInvest longTermInvest = new LongTermInvest();
      new SimpleGUIProgram();
      menu.dispose();
    }
  }
}