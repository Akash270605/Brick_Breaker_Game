/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.java;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;

public abstract class Brick extends GameObjects{
    public Brick(String path){
        super(path);
    }
    
    public void draw(Graphics2D g, int x, int y){
        g.drawImage(this.image, x, y, null);
        g.setColor(new Color(255, 0, 0));
    }
    
    //Sets path of a brick image
    public abstract void setBrickImage();
}
