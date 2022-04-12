package com.saltimure.paintapp.gui;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

/**
 * @author saltimure
 * Creates grid panel that contains buttons
 */
@SuppressWarnings("serial")
public class PaintFrameColorButtonsPanel extends JPanel{
    
    private JButton redButton, yellowButton, blackButton;
    
    public PaintFrameColorButtonsPanel() {
        this.setSize(150, 50);
        this.setLayout(new GridLayout());
        redButton = new JButton();
        redButton.setBackground(Color.RED);
        yellowButton = new JButton();
        yellowButton.setBackground(Color.YELLOW);
        blackButton = new JButton();
        blackButton.setBackground(Color.BLACK);
        this.add(blackButton);
        this.add(redButton);
        this.add(yellowButton);
    }

    public JButton getRedButton() {
        return redButton;
    }

    public JButton getYellowButton() {
        return yellowButton;
    }

    public JButton getBlackButton() {
        return blackButton;
    }
}
