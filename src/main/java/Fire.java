/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.java;

import java.awt.Rectangle;

public class Fire extends GameObjects{
    private int fireSpeed = -5;
    public Fire(int x, int y){
        super("src/main/java/Fire/Fire.png",x, y);
    }
    
    public void move(){
        this.y += fireSpeed;
        
        //If bullet goes beyond the screen, it becomes invisible
        if(y < 0){
            visible = false;
        }
    }
    
    //Determines whether a bullet is visible or not
    public boolean isVisible(){
        return visible;
    }
    
    //Return the bounds of the bullet
    public Rectangle getBounds(){
        return new Rectangle(x, y, w+2, h+2);
    }
}
