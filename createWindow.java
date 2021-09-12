package com.cryptoApp;


import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.text.JTextComponent;
import java.awt.Dimension;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

class menuWindow {
  public static void main(String[] args){
    new loadingScreen();
    createWindow();
  }

  public static void createWindow() {
    JFrame frame = new JFrame("Investment Style");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    createUI(frame);
    frame.setSize(560, 600);
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
  }

  private static void createUI(final JFrame frame) {
    JPanel panel = new JPanel();
    LayoutManager layout = new FlowLayout();
    panel.setLayout(layout);

    JButton aggButton = new JButton("Agressive");
    JButton modButton = new JButton("Moderate");
    JButton longButton = new JButton("Long Term");
    aggButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(frame, "Aggressive Investments");
      }
    });
    modButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(frame, "Medium Investments");
      }
    });
    longButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) { JOptionPane.showMessageDialog(frame, "Low Risk Investments");
      }
    });
    panel.add(aggButton);
    panel.add(modButton);
    panel.add(longButton);
    frame.getContentPane().add(panel, BorderLayout.CENTER);
  }
}