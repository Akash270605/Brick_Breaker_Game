/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.java;

/**
 *
 * @author Leveno
 */
public class PowerUpGenerator {
    public String getPowerUp(String powerup){
        if(powerup.equalsIgnoreCase("Decrease"))
        {
            return "src/main/java/PowerUps/DecreasePowerUp.png";
        }
        else if(powerup.equalsIgnoreCase("Increase")){
            return "src/main/java/PowerUps/IncreasePowerUp.png";
        }
        else if(powerup.equalsIgnoreCase("Fast")){
            return "src/main/java/PowerUps/FastPowerUp.png";
        }
        else if(powerup.equalsIgnoreCase("Life")){
            return "src/main/java/PowerUps/lifegainPowerUp.png";
        }
        else if(powerup.equalsIgnoreCase("Slow")){
            return "src/main/java/PowerUps/SlowPowerUp.png";
        }
        else if(powerup.equalsIgnoreCase("Split")){
            return "src/main/java/PowerUps/SplitballPowerUp.png";
        }
        else if(powerup.equalsIgnoreCase("Fire")){
            return "src/main/java/PowerUps/FirePowerUp.png";
        }
        return "";
    }
}
