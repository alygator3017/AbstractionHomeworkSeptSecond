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
public class Unicorn implements MythicalHorse {
    
    public void fly(){
        
    }

    @Override
    public int age() {
        return 0;
        
    }

    @Override
    public String isGoodOrBad() {
        return "Good";
        
    }

    @Override
    public String speak() {
        String sound = "neigh";
        return sound;
    }

    @Override
    public void gallop() {
        
    }

    @Override
    public void snort() {
        
    }

    @Override
    public void kick() {
        
    }

    @Override
    public String run(int speed) {
        String sound;
        if(speed <4){
          sound = "Clip Clop";
        }else if(speed == 4 && speed < 7){
          sound = "clippity clop";
        }else if(speed == 7 && speed <= 10){
            sound = "clippity clippity";
        }else{
            sound ="Error not a real speed";
        }
        
        
        return sound;
        
    }

    @Override
    public void doSomething() {
        
    }

    @Override
    public String getName() {
        return "Unicorn";
        
    }

    

}
