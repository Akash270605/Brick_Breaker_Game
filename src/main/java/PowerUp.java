/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.java;

import java.awt.Rectangle;

public class PowerUp extends GameObjects{
    public PowerUp(){
        super();
    }
    
    public PowerUp(int x, int y){
        super(x, y);
    }
    
    public void move(){
        this.y +=4;
    }
    
    public Rectangle getBounds(){
        return new Rectangle(x-(w/2), y-(h/2), w, h);
    }
}
