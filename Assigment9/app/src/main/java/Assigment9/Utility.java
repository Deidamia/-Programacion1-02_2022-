/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assigment9;

/**
 *
 * @author fundacion
 */
public class Utility {
    public static String[] Repeated(String frase){
        
        int counter = 0;
        int wordCounter = 1;
        String mostRepitedWord = null;
        
        frase = frase.toLowerCase();
        String[] words = frase.split(" ");
        
        for (String word : words) {
            for (int j = 1; j < words.length; j++) {
                if (words[j].equals(word)) {
                    wordCounter++;
                }
                if (wordCounter > counter) {
                    counter = wordCounter;
                    mostRepitedWord = word;
                }
                
            }
            wordCounter =0;
        }
        String[] Result = {mostRepitedWord, String.valueOf(counter)};
        
        return Result;
    }
}
