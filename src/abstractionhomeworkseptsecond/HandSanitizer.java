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
public class HandSanitizer implements Sanitizer{
    public boolean areYourHandsDry;
    public boolean isSaniDryOnHands;
    public boolean goodToGo;

    public boolean isAreYourHandsDry() {
        return areYourHandsDry;
    }

    public void setAreYourHandsDry(boolean areYourHandsDry) {
        this.areYourHandsDry = areYourHandsDry;
    }

    public boolean isIsSaniDryOnHands() {
        return isSaniDryOnHands;
    }

    public void setIsSaniDryOnHands(boolean isSaniDryOnHands) {
        this.isSaniDryOnHands = isSaniDryOnHands;
    }

    public boolean isGoodToGo() {
        return goodToGo;
    }

    public void setGoodToGo(boolean goodToGo) {
        this.goodToGo = goodToGo;
    }
    

    @Override
    public boolean use() {
        return false;
        
    }

    @Override
    public String mix(String agent) {
        return null;
        
    }
    
}
