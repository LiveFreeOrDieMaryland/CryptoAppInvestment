package com.cryptoApp;

import javax.swing.*;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.border.Border;
import java.awt.*;

public class ButtonExample {
  JFrame frame;
  JLabel image=new JLabel(new ImageIcon("C:\\Users\\Adam Beck-Budovec\\Documents\\cryptoApp\\src\\com\\cryptoApp\\goku-jumping.gif"));
  JLabel text=new JLabel("Loading Application");
  JProgressBar progressBar=new JProgressBar();
  JLabel message=new JLabel();//Crating a JLabel for displaying the message
  ButtonExample()
  {
    createGUI();
    addImage();
    addText();
    addProgressBar();
    addMessage();
    runningPBar();
  }
  public void createGUI(){
    frame=new JFrame();
    frame.getContentPane().setLayout(null);
    frame.setUndecorated(true);
    frame.setSize(600,400);
    frame.setLocationRelativeTo(null);
    frame.getContentPane().setBackground(Color.white);
    frame.setVisible(true);
  }
  public void addImage(){
    image.setSize(600,200);
    frame.add(image);
  }
  public void addText()
  {
    text.setFont(new Font("arial",Font.BOLD,30));
    text.setBounds(170,220,600,40);
    text.setForeground(Color.BLUE);
    frame.add(text);
  }
  public void addMessage()
  {
    message.setBounds(250,320,200,40);//Setting the size and location of the label
    message.setForeground(Color.black);//Setting foreground Color
    message.setFont(new Font("arial",Font.BOLD,15));//Setting font properties
    frame.add(message);//adding label to the frame
  }
  public void addProgressBar(){
    progressBar.setBounds(100,280,400,30);
    progressBar.setBorderPainted(true);
    progressBar.setStringPainted(true);
    progressBar.setBackground(Color.WHITE);
    progressBar.setForeground(Color.BLACK);
    progressBar.setValue(0);
    frame.add(progressBar);
  }
  public void runningPBar(){
    int i=0;//Creating an integer variable and intializing it to 0

    while( i<=100)
    {
      try{
        Thread.sleep(100);//Pausing execution for 50 milliseconds
        progressBar.setValue(i);//Setting value of Progress Bar
        message.setText("LOADING "+Integer.toString(i)+"%");//Setting text of the message JLabel
        i++;
        if(i==100)
          frame.dispose();
      }catch(Exception e){
        e.printStackTrace();

        class Menu {
          private ButtonExample buttonExample;

          public Menu(ButtonExample buttonExample) {
            this.buttonExample = buttonExample;
          }
        }
      }
    }
  }
}