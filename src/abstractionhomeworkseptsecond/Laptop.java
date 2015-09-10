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
public class Laptop implements Computer {

    private boolean close = true;
    private String openOrCloseLaptop;
    private boolean openApp;
    private boolean closeApp;
    private boolean open = false;

    public boolean isOpen() {
        return open;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }

    public boolean isClose() {
        return close;
    }

    public void setClose(boolean close) {
        this.close = close;
    }

    public boolean isOpenApp() {
        return openApp;
    }

    public void setOpenApp(boolean openApp) {
        this.openApp = openApp;
    }

    public boolean isCloseApp() {
        return closeApp;
    }

    public void setCloseApp(boolean closeApp) {
        this.closeApp = closeApp;
    }

    public String getOpenOrCloseLaptop() {
        return openOrCloseLaptop;
    }

    public void setOpenOrCloseLaptop(String openOrCloseLaptop) {
        this.openOrCloseLaptop = openOrCloseLaptop;
    }

    @Override
    public void turnOn() {
        System.out.println("Hello Unicorn Joe!");
    }

    @Override
    public void turnOff() {
        System.out.println("Goodbye Traitor... until next time");
    }

    @Override
    public boolean openApplication() {
        return false;

    }

    @Override
    public boolean closeApplication() {
        return false;

    }

}
