package com.saltimure.paintapp.logic;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.saltimure.paintapp.gui.PaintFrameColorButtonsPanel;

/**
 * @author saltimure
 * Adds ActionListeners for buttons
 */
@SuppressWarnings("serial")
public class PaintFrameColorButtonsPanelActionEvents extends PaintFrameColorButtonsPanel implements ActionListener{

    public PaintFrameColorButtonsPanelActionEvents() {
        super.getRedButton().addActionListener(this);
        super.getBlackButton().addActionListener(this);
        super.getYellowButton().addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == super.getRedButton()) super.setColor(Color.RED);
        else if (e.getSource() == super.getYellowButton()) super.setColor(Color.YELLOW);
        else if (e.getSource() == super.getBlackButton()) super.setColor(Color.BLACK);
    }

}
