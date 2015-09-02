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
public class Curse implements MagicSpell {
    public String spellSound = "DOOOOOOOOOOOM!";
    public String castUpon;
    public String duration;
    public String curseName;
    public String severityOfCurse;

    public String getCastUpon() {
        return castUpon;
    }

    public void setCastUpon(String castUpon) {
        this.castUpon = castUpon;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getCurseName() {
        return curseName;
    }

    public void setCurseName(String curseName) {
        this.curseName = curseName;
    }
    

    @Override
    public boolean castSpell() {
        return false;
        
    }
    
}
