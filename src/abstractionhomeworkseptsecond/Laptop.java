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
public class Laptop implements ElectronicDevice {
    private String open;

    public String getOpen() {
        return open;
    }

    public void setOpen(String open) {
        this.open = open;
    }

    public String getClose() {
        return close;
    }

    public void setClose(String close) {
        this.close = close;
    }
    public String close;
    public String openOrCloseLaptop;
    
    public String openOrClose(String orientation){
        //..... stuff here on if to open or close
        return openOrCloseLaptop;
    }

    @Override
    public boolean turnOn(boolean turnOn) {
        return false;
        
    }

    @Override
    public boolean turnOff(boolean turnOff) {
        return false;
        
    }
    
}
