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
    private int height;
    private int weight;
    private int age;
    private String name;
    private String color;

    public MythicalHorse() {
    }

    public MythicalHorse(int height, int weight, int age, String name, String color) {
        this.height = height;
        this.weight = weight;
        this.age = age;
        this.name = name;
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

    public String Neigh() {
        return sound;

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String stompHoof() {
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
    public String run(int speed) {
        if (speed < 3) {
            return walk;
        } else if (speed < 7) {
            return canter;
        } else {
            return gallop;
        }
    }

}
