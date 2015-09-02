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
    private static final String sound = "neigh";
    private static final String hoofSound = "bang bang bang";
    private static final String walk = "Clop Clop Clop Clop";
    private static final String canter = "Clopclop clopclop";
    private static final String gallop = "ClippityClap ClippityClap";
    
    public String Neigh(){
        return sound;
        
    }
    public String stompHoof(){
        return hoofSound;
    }

    public static String getSound() {
        return sound;
    }

    public static String getHoofSound() {
        return hoofSound;
    }

    public static String getWalk() {
        return walk;
    }

    public static String getCanter() {
        return canter;
    }

    public static String getGallop() {
        return gallop;
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
