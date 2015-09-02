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
public class Unicorn implements MythicalHorse{
    public int lengthOfHorn;
    public String color;
    public int height;
    public int weight;
    public int age;
    public String name;

    public int getLengthOfHorn() {
        return lengthOfHorn;
    }

    public void setLengthOfHorn(int lengthOfHorn) {
        this.lengthOfHorn = lengthOfHorn;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    

    @Override
    public boolean Neigh() {
        return false;
        
    }

    @Override
    public boolean stompHoof() {
        return false;
        
    }

    @Override
    public boolean gallop() {
        return false;
        
    }

    @Override
    public boolean canter() {
        return false;
        
    }

    @Override
    public boolean run() {
        return false;
        
    }
    
}
