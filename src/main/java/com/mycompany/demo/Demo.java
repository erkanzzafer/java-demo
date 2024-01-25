/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.demo;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author zafer
 */
public class Demo {

    static JFrame frame;

    public static void main(String[] args) {
        // System.out.println("Hello World!");
        //    frameInit();
        //   setImage();

        myFrame myFrame = new myFrame();
        

    }

    public static void frameInit() {
        frame = new JFrame();
        frame.setTitle("Jframe");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(800, 600);
        frame.setVisible(true);
    }

    public static void setImage() {

        ImageIcon image = new ImageIcon("logo.png");
        frame.setIconImage(image.getImage());
        frame.getContentPane().setBackground(Color.green);
    }
}
