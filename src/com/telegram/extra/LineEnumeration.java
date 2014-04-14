/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.telegram.extra;

import java.util.NoSuchElementException;
import javax.microedition.lcdui.Font;

/**
 *
 * @author Devashish
 */
public class LineEnumeration {
    private Font font;
    private String text;
    public static int lines;
 
    private int width;
    private int position;
    private int length;
    private int start = 0;
 
    public LineEnumeration(Font font, String text, int width) {
        this.font = font;
        this.text = text;
        this.width = width;
        this.length = text.length();
        this.lines = 0;
    }
 
 
    public boolean hasMoreElements() {
        return (position < (length-1));
    }
 
    public Object nextElement() throws NoSuchElementException {
        try {
            return text.substring(start,(start = next()));
        } catch ( IndexOutOfBoundsException e ) {
            throw new NoSuchElementException(e.getMessage());
        } catch ( Exception e ) {
            throw new NoSuchElementException(e.getMessage());
        }
    }
 
 
    private int next() {
        int i = position;
        int lastBreak = -1;
 
        for ( ;i < length && font.stringWidth(text.substring(position,i)) <= width; i++ ) {
            if ( text.charAt(i) == ' ' ) {
                lastBreak = i;
            } else if ( text.charAt(i) == '\n' ) {
                lastBreak = i;
                break;
            }
        }
 
 
        if ( i == length ) {
            position = i;
        } else if ( lastBreak <= position ) {
            position = i;
        } else {
            position = lastBreak;
        }
 
        return position;
    }
}
