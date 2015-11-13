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
        
        //cheeks
        graphics.setColor(Color.pink);
        graphics.fillOval(x + (width * 20 / 100), y + (height * 15 / 100), width * 60 / 100, height * 10 / 100);
//        graphics.fillOval(90, 115, 100, 45);
        
        //head
        graphics.setColor(Color.pink);
        graphics.fillOval(x + (width * 35 / 100), y + (height * 3 / 100), width * 30 / 100, height * 20 / 100);
//        graphics.fillOval(x + (width * 20 / 100), 60, 45, 100);
        
        
        //eyes
        graphics.setColor(Color.white);
        graphics.fillOval(x + (width * 35 / 100), y + (height * 10 / 100), width * 14 / 100, width * 14 / 100);
        graphics.setColor(Color.black);
        graphics.drawOval(x + (width * 35 / 100), y + (height * 10 / 100), width * 14 / 100, width * 14 / 100);
        //pupil
        graphics.setColor(Color.black);
        graphics.fillOval(x + (width * 39 / 100), y + (height * 11 / 100), width * 7 / 100, width * 7 / 100);
        
//        eye
        graphics.setColor(Color.white);
        graphics.fillOval(x + (width * 50 / 100), y + (height * 10 / 100), width * 14 / 100, width * 14 / 100);
        graphics.setColor(Color.black);
        graphics.drawOval(x + (width * 50 / 100), y + (height * 10 / 100), width * 14 / 100, width * 14 / 100);
        //pupil
        graphics.setColor(Color.black);
        graphics.fillOval(x + (width * 54 / 100), y + (height * 11 / 100), width * 7 / 100, width * 7 / 100);
        
        //mouth
        graphics.setColor(Color.white);
        graphics.fillOval(x + (width * 25 / 100), y + (height * 18 / 100), width * 50 / 100, width * 14 / 100);
//        graphics.fillOval(105, 127, 70, 25);
        graphics.setColor(Color.pink);
        graphics.fillOval(x + (width * 27 / 100), y + (height * 16 / 100), width * 45 / 100, width * 14 / 100);
//        graphics.fillOval(105, 120, 65, 20);
        
        //ear
        graphics.setColor(Color.pink);
        graphics.fillOval(x + (width * 64 / 100), y + (height * 11 / 100), width * 12 / 100, width * 12 / 100);
        //ear
        graphics.setColor(Color.pink);
        graphics.fillOval(x + (width * 23 / 100), y + (height * 11 / 100), width * 12 / 100, width * 12 / 100);
        
        
        //nose
        
        
        
    }

    public Wallace(int x, int y, int width, int height){
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
