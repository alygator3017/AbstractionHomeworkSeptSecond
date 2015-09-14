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
public class Word implements EnglishWord{

    private String word;
    private String[] lettersInWord;

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public Word(String[] word) {
        //put letters into array- what I have now is temporary placement.
        this.lettersInWord = word;
    }

    @Override
    public void slang() {
        
    }

    @Override
    public void dialect() {
        
    }

    @Override
    public void alphabet() {
        
    }

    
    
   
    
}
