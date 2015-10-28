/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package character;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author ericbeaudet
 */
public class Wallace {
    
    public void  draw(Graphics graphics){
        graphics.setColor(Color.pink);
        graphics.drawRect(x, y, width, height);
        
    }

    public Wallace(int x, int y, int height, int width){
        this.x = x;
        this.y = y;
        this.height = height;
        this.width = width;
                
                
                
    }
    
    private int x;
    private int y;
    private int height;
    private int width;
}
