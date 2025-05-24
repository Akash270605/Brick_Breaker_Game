/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.java;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class FileActions implements Serializable{
    private ArrayList<Object> objects = new ArrayList<Object>();
    
    //setters
    public void addObject(Object o){
        objects.add(o);
    }
    
    //getters
    public void saveGame(){
        try{
            //Open a file to write to, named SavedObj.sav
            FileOutputStream saveFile = new FileOutputStream("NTT.sav");
            
            //Creates an ObjectOutputStream to put objects into save file
            ObjectOutputStream save = new ObjectOutputStream(saveFile);
            
            //Save 
            for(int i = 0; i < objects.size(); i++){
                save.writeObject(objects.get(i));
            }
            
            //Close the file
            save.close();
        }catch(Exception exc){
            exc.printStackTrace();
        }
    }
    
    public Board loadGame(){
        Board stuff = new Board();
        try{
            //Open the file to read , named SavedObj.sav
            FileInputStream saveFile = new FileInputStream("NTT.sav");
            
            //Creates an ObjectInputStream to get objects from save file
            ObjectInputStream save = new ObjectInputStream(saveFile);
            
            stuff = (Board) save.readObject();
            
            //Close the file
            save.close();
        }catch(Exception exc){
            
        }
        System.out.println(stuff);
        
        return stuff;
    }
}
