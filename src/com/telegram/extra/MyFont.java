/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.telegram.extra;

import javax.microedition.lcdui.Font;

/**
 *
 * @author Devashish
 */
public class MyFont {
    private static final int face = Font.FACE_SYSTEM;
    private static final int style = Font.STYLE_PLAIN;
    private static final int size = Font.SIZE_SMALL;
    
    public static Font getFont() {
        Font myFont = Font.getFont(face, style, size);
        return myFont;
    }
}
