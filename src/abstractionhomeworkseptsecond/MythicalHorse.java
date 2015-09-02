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

    private static final String SOUND = "neigh";
    private static final String HOOF_SOUND = "bang bang bang";
    private static final String WALK = "Clop Clop Clop Clop";
    private static final String CANTER = "Clopclop clopclop";
    private static final String GALLOP = "ClippityClap ClippityClap";
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
        return SOUND;

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String stompHoof() {
        return HOOF_SOUND;
    }

    public static String getSound() {
        return SOUND;
    }

    public static String getHoofSound() {
        return HOOF_SOUND;
    }

    public static String getWalk() {
        return WALK;
    }

    public static String getCanter() {
        return CANTER;
    }

    public static String getGallop() {
        return GALLOP;
    }

    public String run(int speed) {
        if (speed < 3) {
            return WALK;
        } else if (speed < 7) {
            return CANTER;
        } else {
            return GALLOP;
        }
    }

}
