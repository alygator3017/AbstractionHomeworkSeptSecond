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
public interface Sanitizer extends SanitationChemical{
    public abstract boolean use();
    public abstract String baseType(String sanitizer);
}
