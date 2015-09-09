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
public abstract class RunningShoe implements AthleticShoe{
    private String brand;
    private String color;
    private String gender;
    private float size;
    private String type;
    
    
    public RunningShoe(){
    }

    public RunningShoe(String brand, String color, String gender, float size, String type) {
        this.brand = brand;
        this.color = color;
        this.gender = gender;
        this.size = size;
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
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
