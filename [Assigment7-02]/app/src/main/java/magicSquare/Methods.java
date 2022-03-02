/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package magicSquare;

import java.util.Arrays;
import javax.swing.JOptionPane;


/**
 *
 * @author fundacion
 */
public class Methods {
    
    public static int getLongList(){
        int aux = 0;
        int longList = 0;
        
        while (aux < 1){
            longList = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero impar, este sera el tamaño de su cubo magico"));
            
            if (longList%2 == 0){
              System.out.println("El numero debe ser impar");  
            } else{
                
                aux = 1;
            }
        }
        return longList;
    }
    
    public static void cuby(){
        
        int longLista = getLongList();
        int start = longLista/2;
        int[][] magiCuby = new int[longLista][longLista];
        
        
        
        int hor_ant = 0;
        int ver_ant = 0;
        
        int num = 1;
        
        for (int i = 0; i < longLista; i++) {
            for (int j = 0; j < longLista; j++) {
                magiCuby[i][j] = 0;
                
            }
            
        }
        
        int hor = start;
        int ver = 0;
        
        while (num != (longLista * longLista) +1){
            
            if (magiCuby[ver][hor] == 0){
                magiCuby[ver][hor] = num;
                
            } else{
                ver = ver_ant +1;
                hor = hor_ant;
                
                magiCuby[ver][hor] = num;
                
            }
            
            ver_ant = ver;
            hor_ant = hor;
            
            num++;
            ver--;
            hor++;
            
            if (ver < 0 && hor == longLista) {
                ver = longLista - 1;
                hor = 0;
            }
            
            else if(ver < 0){
                ver = ver + longLista;
            }
            
            else if (hor == longLista) {
                hor = 0;
            }
        }
        
        for (int i = 0; i < magiCuby.length; i++) {
                System.out.println(Arrays.toString(magiCuby[i]));
        }
    }
}
