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
public class HandSanitizer implements Sanitizer {

    private boolean areYourHandsDry;
    private boolean isSaniDryOnHands;
    private boolean goodToGo;

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
    public String baseType(String sanitizer) {
        String type = null;
        //alcohol or ?
        if ("alochol based gel".equals(sanitizer)) {
            type = "alcohol";
        }
        return type;

    }

    @Override
    public String findUses(String chemical) {
        
        return null;

    }

    @Override
    public String lookUpMSDN(String chemical) {
        return null;

    }

    @Override
    public boolean use() {
        //if hands dry use sani
        //check to make sure sani is dry
        // all done
        return true;
    }

}
