package com.saltimure.paintapp.gui;

import javax.swing.JFrame;

import com.saltimure.paintapp.logic.PaintFrameColorButtonsPanelActionEvents;

/**
 * @author saltimure
 * Main window that contains cursor coordinates
 */
@SuppressWarnings("serial")
public class PaintFrame extends JFrame{
    
    private PaintFrameColorButtonsPanel colorButtonsPanel = new PaintFrameColorButtonsPanelActionEvents();
    
    //cursor coordinates that will be used in dragging event
    private int x,y;
    
    public PaintFrame() {
        this.setTitle("Paint");
        this.setSize(1000, 1000);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setLocationRelativeTo(null);
        this.add(colorButtonsPanel);
        this.setVisible(true);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public PaintFrameColorButtonsPanel getColorButtonsPanel() {
        return colorButtonsPanel;
    }
}
