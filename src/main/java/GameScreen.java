/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.java;

import java.awt.Color;
import javax.swing.JFrame;

public class GameScreen {
    public static void main(String[] args){
        JFrame obj = new JFrame();
        Board game = new Board();
        obj.setBounds(10, 10, 850, 700);
        obj.setTitle("Brick Breaker");
        obj.setResizable(false);
        obj.setVisible(true);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        obj.add(game);
    }
}
