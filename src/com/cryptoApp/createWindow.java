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
    createWindow();
    new ButtonExample();
  }

  public static void createWindow() {
    JFrame frame = new JFrame("Investment Style");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    createUI(frame);
    frame.setSize(560, 200);
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
  }

  private static void createUI(final JFrame frame) {
    JPanel panel = new JPanel();
    LayoutManager layout = new FlowLayout();
    panel.setLayout(layout);

    JButton okButton = new JButton("Agressive");
    JButton cancelButton = new JButton("Moderate");
    cancelButton.setEnabled(true);
    JButton submitButton = new JButton("Long Term");
    okButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(frame, "Ok Button clicked.");
      }
    });
    submitButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(frame, "Submit Button clicked.");
      }
    });
    frame.getRootPane().setDefaultButton(submitButton);
    panel.add(okButton);
    panel.add(cancelButton);
    panel.add(submitButton);
    frame.getContentPane().add(panel, BorderLayout.CENTER);
  }
}