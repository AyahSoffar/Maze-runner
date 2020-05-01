/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.awt.Graphics;
import javax.swing.ImageIcon;

/**
 *
 *
 */
public class ArmorDecorator extends Player {

    public static ArmorDecorator d1 = null;

    public void draw(Graphics g) {
        super.draw(g);
        ImageIcon im = new ImageIcon("armor.png");
        g.drawImage(im.getImage(), getxPlayer() * 30, getyPlayer() * 30, null);
    }

    public static Player getInstance() {

        if (d1 == null) {
            d1 = new ArmorDecorator();
        }
        return d1;

    }

}
