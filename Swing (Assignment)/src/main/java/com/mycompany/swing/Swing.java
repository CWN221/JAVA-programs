
package com.mycompany.swing;

/**
 * BSE-01-0032/2024
 * @author Carlos Nduhiu
 * 3/04/2025
 */

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Swing {
    Swing() {
        //Frame
        JFrame frame = new JFrame("RadioButtonDemo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        frame.setSize(600, 400);
        frame.setLayout(null);
 
        //Radio buttons
        JRadioButton r1 = new JRadioButton("Bird");
        JRadioButton r2 = new JRadioButton("Cat");
        JRadioButton r3 = new JRadioButton("Dog");
        JRadioButton r4 = new JRadioButton("Rabbit");
        JRadioButton r5 = new JRadioButton("Pig");

        //Grouping Radio Buttons
        ButtonGroup group = new ButtonGroup();
        group.add(r1);
        group.add(r2);
        group.add(r3);
        group.add(r4);
        group.add(r5);
        
        // Setting positions for the radio buttons
        r1.setBounds(50, 50, 100, 30);
        r2.setBounds(50, 100, 100, 30);
        r3.setBounds(50, 150, 100, 30);
        r4.setBounds(50, 200, 100, 30);
        r5.setBounds(50, 250, 100, 30);

        //Adding components
        frame.add(r1);
        frame.add(r2);
        frame.add(r3);
        frame.add(r4);
        frame.add(r5);
        
        //Adding images
        JLabel image = new JLabel();
        image.setBounds(250, 50, 250, 300);
        frame.add(image);
        
        //ActionListener
        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                JRadioButton selected = (JRadioButton) e.getSource();
                JOptionPane.showMessageDialog(frame, "You have selected: " +selected.getText());
                
                String animal = selected.getText().toLowerCase();
                ImageIcon pic = null;
                switch (animal) {
                    case "bird":
                        pic = new ImageIcon("bird.jpeg");
                        break;
                    case "pig":
                        pic = new ImageIcon("pig.jpeg");
                        break;
                    case "dog":
                        pic = new ImageIcon("dog.jpeg");
                        break;
                    case "cat":
                        pic = new ImageIcon("cat.jpeg");
                        break;
                    case "rabbit":
                        pic = new ImageIcon("rabbit.jpeg");
                        break;                    
                }
                image.setIcon(pic);
            }
        };

                
        r1.addActionListener(listener);
        r2.addActionListener(listener);
        r3.addActionListener(listener);
        r4.addActionListener(listener);
        r5.addActionListener(listener);

        
        //Show entire frame
        frame.setVisible(true);
    }
    

    public static void main(String[] args) {
        new Swing();    }
}
