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
public class NikeFlyKnitLunar3 implements RunningShoe {

    private String brand;
    private String color;
    private String gender;
    private float size;
    private String type;

    @Override
    public void tie() {
        //tie shoe using laces
    }

    @Override
    public void run() {
        
    }

    @Override
    public void walk() {
        
    }

    @Override
    public void putOn() {
        //put shoe one
        tie();
    }

    public String getBrand() {
        return brand;
    }

    public final void setBrand(String brand) {
        this.brand = "nike";
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public float getSize() {
        return size;
    }

    public void setSize(float size) {
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    
    
}
