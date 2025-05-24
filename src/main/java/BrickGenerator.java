/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.java;

/**
 *
 * @author Leveno
 */
public class BrickGenerator {
    public Brick getBrick(int choice, int row, int col){
        if(choice ==1){
            return new Brick1("src/main/java/Brick1/1.png");
        }
        else if(choice == 2){
            return new Brick2("src/main/java/Brick2/1.png");
        }
        else if(choice == 3){
            return new Brick3("src/main/java/Brick3/1.png");
        }
        else if(choice == 4){
            return new Brick4("src/main/java/Brick4/1.png");
        }
        
        return null;
    }
}
