package com.saltimure.paintapp.logic;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import com.saltimure.paintapp.gui.PaintFrame;

/**
 * @author saltimure
 * Adds MouseMotionListenerlistener for parent class
 */
@SuppressWarnings("serial")
public class PaintMouseMotionDragEvent extends PaintFrame implements MouseMotionListener{

    public PaintMouseMotionDragEvent() {
        super.addMouseMotionListener(this);
    }
    
    @Override
    public void mouseDragged(MouseEvent e) {
        //save mouse movement coordinates in parent class while dragging
        super.setX(e.getX());
        super.setY(e.getY());
        //will call on a paint method with a special parament (Graphics g)
        repaint();
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }
    
    //this method will paint our circle on screen by using our paren class coordinates
    @Override
    public void paint(Graphics g) {
        g.fillOval(super.getX(), super.getY(), 10, 10);
    }
}
