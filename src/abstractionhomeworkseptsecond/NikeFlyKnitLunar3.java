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

    String howToPutOnShoe;

    public String getHowToPutOnShoe() {
        return howToPutOnShoe;
    }

    public void setHowToPutOnShoe(String howToPutOnShoe) {
        this.howToPutOnShoe = howToPutOnShoe;
    }

    @Override
    public boolean run() {
        return false;
    }

    @Override
    public boolean doSomething(boolean shouldWeDoAnActivity) {
        return false;
    }

    @Override
    public String putOn(String how) {

        return howToPutOnShoe;
    }

}
