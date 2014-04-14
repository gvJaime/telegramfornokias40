/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.telegram.modules;

import com.telegram.constants.Color;
import com.telegram.constants.MessageSource;
import com.telegram.constants.MessageType;
import com.telegram.extra.LineEnumeration;
import com.telegram.extra.MyFont;
import javax.microedition.lcdui.*;

/**
 * @author Devashish
 */
public class BubbleMessage extends Canvas implements CommandListener {
    
    private int id;
    private int xLength;
    private int yLength;
    private int source;
    private int type;
    private String message;
    private long userId;
    
    /**
     * constructor
     */
    public BubbleMessage() {
        try {
            // Set up this canvas to listen to command events
            setCommandListener(this);
            // Add the Exit command
            addCommand(new Command("Exit", Command.EXIT, 1));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public BubbleMessage(int id, String message, int source, int type, int xLength, int yLength, long userId) {
        this.id = id;
        this.message = message;
        this.source = source;
        this.type = type;
        this.xLength = xLength;
        this.yLength = yLength;
        this.userId = userId;
    }

    /**
     * paint
     */
    public void paint(Graphics g) {
        int x, y, w, h;
        
        g.setFont(MyFont.getFont());
        
        if(this.source == MessageSource.Sent) {
            g.setColor(Color.BLUE);
            if (this.type == MessageType.TEXT) {
                 
            }
            else if (this.type == MessageType.IMAGE) {
                
            }
            else if (this.type == MessageType.AUDIO) {
                
            }
            else {
                
            }
        }
        else {
            g.setColor(Color.WHITE);
            if (this.type == MessageType.TEXT) {
                
            }
            else if (this.type == MessageType.IMAGE) {
                
            }
            else if (this.type == MessageType.AUDIO) {
                
            }
            else {
                
            }
        }

        g.fillRoundRect(this.xLength, this.yLength, this.xLength, this.yLength, 5, 5);
        g.setColor(Color.BLACK);
        g.drawString(this.message, 0, 0, Graphics.TOP | Graphics.LEFT);
    }

    /**
     * Called when a key is pressed.
     */
    protected void keyPressed(int keyCode) {
    }

    /**
     * Called when a key is released.
     */
    protected void keyReleased(int keyCode) {
    }

    /**
     * Called when a key is repeated (held down).
     */
    protected void keyRepeated(int keyCode) {
    }

    /**
     * Called when the pointer is dragged.
     */
    protected void pointerDragged(int x, int y) {
    }

    /**
     * Called when the pointer is pressed.
     */
    protected void pointerPressed(int x, int y) {
    }

    /**
     * Called when the pointer is released.
     */
    protected void pointerReleased(int x, int y) {
    }

    /**
     * Called when action should be handled
     */
    public void commandAction(Command command, Displayable displayable) {
    }
    
    public int getXLength() {
        return this.xLength;
    }
    
    public void setXLength(int xLength) {
        this.xLength = xLength;
    }
    
    public int getYLength() {
        return this.yLength;
    }
    
    public void setYLength(int yLength) {
        this.yLength = yLength;
    }
}
