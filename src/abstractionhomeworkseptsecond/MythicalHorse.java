/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractionhomeworkseptsecond;

/**
 *
 * @author Alyson
 */
public abstract class MythicalHorse implements MythicalAnimal {
    public static String sound = "neigh";
    public static String hoofSound = "bang bang bang";
    public static String walk = "Clop Clop Clop Clop";
    public static String canter = "Clopclop clopclop";
    public static String gallop = "ClippityClap ClippityClap";
    
    public String Neigh(){
        return sound;
        
    }
    public String stompHoof(){
        return hoofSound;
    }
    @Override
    public String run(int speed){
        if (speed < 3){
            return walk;
        }
        else if(speed < 7){
            return canter;
        }
        else{
            return gallop;
        }
    }
}
