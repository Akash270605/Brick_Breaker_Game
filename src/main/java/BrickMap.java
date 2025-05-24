/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.java;

import java.awt.Graphics2D;
import java.util.Random;

public class BrickMap {
    public Brick brick[][];
    public int map[][];
    public int brickWidth;
    public int brickHeight;
    public boolean isfire; 
    public BrickGenerator brickfactory = new BrickGenerator();
    public boolean check = true;
    public boolean greencheck = true;
    public Random rand=new Random();

    public BrickMap(int row, int col) {
        
        map = new int[row][col];
        brick = new Brick[row][col];
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                
                map[i][j] = rand.nextInt(4)+1;                
                brick[i][j]=brickfactory.getBrick(map[i][j], row, col);
            }
        }
        brickWidth = 620 / col;
        brickHeight = 200 / row;
    }

    public void paint(Graphics2D g)
    {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                if (map[i][j] > 0) {
                    brick[i][j].draw(g, j * brickWidth+80, i * brickHeight+50);
                }
            }
        } 
    }



    public int setBrickValue(int row, int col,int brickvalue) {
        
        if(isfire)
        {
            if(map[row][col] == 4)
            {
                map[row][col] = 0;
                brick[row][col] = null;
                check = false;
                return (brickvalue-1);
            }
            
        }
        if (!(brick[row][col] instanceof Brick4)){
            map[row][col]--;
            brick[row][col].setBrickImage();
            check = false;
            
        }
        if(map[row][col]==0)
        {
            brick[row][col] = null;
            check = true;
            
            return (brickvalue-1);      
        }
        
        return brickvalue;
    }
}