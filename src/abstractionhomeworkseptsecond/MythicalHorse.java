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
public interface MythicalHorse extends MythicalAnimal {
    public static final String SOUND = "neigh";
    public static final String HOOF_SOUND = "bang bang bang";
    public boolean Neigh();
    public boolean stompHoof();
    public boolean gallop();
    public boolean canter();
}
