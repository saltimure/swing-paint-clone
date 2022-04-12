package com.saltimure.paintapp.gui;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class PaintFrame extends JFrame{
    
    public PaintFrame() {
        this.setTitle("Paint");
        this.setSize(1000, 1000);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}
