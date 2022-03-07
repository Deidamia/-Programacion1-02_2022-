/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assigment8;

import java.util.Random;

/**
 *
 * @author fundacion
 */
public class Assignment8 {
    
    public static String superNewWord = "";

    public Assignment8(String sentence){
        
        String[] words = sentence.split(" ");
        int newPlace = 0;
        
        for (String word : words) {
            
            String[] letters = word.split("");
            String[] newWord = new String[letters.length];
            
            newWord[0] = letters[0];
            newWord[newWord.length -1] = letters[letters.length -1];
            Random place = new Random();
            
            if (",".equals(letters[letters.length -1]) | ".".equals(letters[letters.length -1])|";".equals(letters[letters.length -1])| ":".equals(letters[letters.length -1])){
                newWord[newWord.length -2] = letters[letters.length -2];
                
                for (int i = 1; i < letters.length -2 ; i++) {
                
                    String letter = letters[i];
                    int aux = 0;

                    while (aux < 1){

                        newPlace = place.nextInt(letters.length -1);

                        if (newWord[newPlace] == null){
                            
                            newWord[newPlace] = letter;
                            aux = 2;
                        }
                    }
                }
            } 
            else {
                for (int i = 1; i < letters.length -1 ; i++) {
                
                    String letter = letters[i];
                    int aux = 0;

                    while (aux < 1){

                        newPlace = place.nextInt(letters.length -1);

                        if (newWord[newPlace] == null){
                            
                            newWord[newPlace] = letter;
                            aux = 2;
                        }
                    }
                }
            }
            
            for (String newWord1 : newWord) {
                superNewWord += newWord1;
            }

            superNewWord += " ";
        }
    }
    
    public String toString(){
        return superNewWord;
    }
}
