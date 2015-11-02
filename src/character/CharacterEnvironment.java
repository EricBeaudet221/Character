/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package character;

import environment.Environment;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

/**
 *
 * @author ericbeaudet
 */
class CharacterEnvironment extends Environment {

    public Wallace gromitBig;
    public Wallace gromitSmall;

    public CharacterEnvironment() {
        gromitBig = new Wallace(50, 50, 150, 450);
        gromitSmall = new Wallace(250, 50, 75, 300);
    }

    @Override
    public void initializeEnvironment() {

    }

    @Override
    public void timerTaskHandler() {
    }

    @Override
    public void keyPressedHandler(KeyEvent e) {
    }

    @Override
    public void keyReleasedHandler(KeyEvent e) {
    }

    @Override
    public void environmentMouseClicked(MouseEvent e) {
     
    }

    @Override
    public void paintEnvironment(Graphics graphics) {

        if (gromitBig != null) {
            gromitBig.draw(graphics);

        }

        if (gromitSmall != null) {
            gromitSmall.draw(graphics);

        }
//        graphics.setColor(Color.pink);
//        graphics.fillOval(90, 115, 100, 45);
//        graphics.setColor(Color.pink);
//        graphics.fillOval(117, 60, 45, 100);
//        graphics.setColor(Color.black);
//        graphics.drawOval(117, 90, 20, 20);
//        graphics.setColor(Color.white);
//        graphics.fillOval(117, 90, 19, 19);
//        graphics.setColor(Color.black);
//        graphics.fillOval(122, 95, 10, 10);
//        graphics.setColor(Color.black);
//        graphics.drawOval(142, 90, 20, 20);
//        graphics.setColor(Color.white);
//        graphics.fillOval(142, 90, 19, 19);
//        graphics.setColor(Color.black);
//        graphics.fillOval(147, 95, 10, 10);
//        graphics.setColor(Color.white);
//        graphics.fillRect(105, 127, 70, 20);
//        graphics.setColor(Color.black);
//        graphics.drawOval(132, 105, 15, 15);
//        graphics.drawLine(WIDTH, WIDTH, WIDTH, WIDTH);
        
    }

}
