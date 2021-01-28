package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleGui1B implements ActionListener {
    JButton button;

    public static void main(String [] args){
        SimpleGui1B gui = new SimpleGui1B();
        gui.go();
    }

    private void go() {
        JFrame frame = new JFrame();
        button = new JButton("click me");

        button.addActionListener(this);

        frame.getContentPane().add(BorderLayout.CENTER, button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        frame.setVisible(true);


    }


    public void actionPerformed(ActionEvent event) {
        button.setText("I've been clicked!");

    }
}
