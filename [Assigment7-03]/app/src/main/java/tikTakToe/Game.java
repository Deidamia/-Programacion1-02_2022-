/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tikTakToe;

import java.util.Arrays;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author fundacion
 */
public class Game {
    
    static Scanner entrada = new Scanner(System.in);
    
    public static String[][] board1(){
        
        String[][] boardGame = new String[3][3];
        for (int i = 0; i < boardGame.length; i++) {
            for (int j = 0; j < boardGame.length; j++) {
                boardGame[i][j] = "-";
            }
        }
        return boardGame;
    }
    
    public static void playing(){
        
        String[][] boardGame = board1();
        boolean changePlayer = true;
        int movementH;
        int movementV;
        int i = 0;    
        int endGame = 0;
        
        for (String[] boardGame1 : boardGame) {
            System.out.println(Arrays.deepToString(boardGame1));
        }

        while (i<9){

            if (changePlayer){
                System.out.print("Turno del jugador 1" +"\n");

                movementH = Integer.parseInt(JOptionPane.showInputDialog("Posiciòn en horizontal 1, 2, 3→"));

                movementV = Integer.parseInt(JOptionPane.showInputDialog("Posiciòn en vertical 1, 2, 3↓"));

               
                if (movementV >3 | movementH >3 | movementV <1 | movementH <1) {
                    System.out.print("movimiento no valido" +"\n");
                    i--;
                }
                else if (boardGame[movementV-1][movementH-1] != "-") {
                    System.out.print("posicion ocupada" +"\n");
                    i--;
                    
                } else{
                    boardGame[movementV-1][movementH-1] = "x";
                    changePlayer =! changePlayer;
                }


            } else{
                System.out.print("Turno del jugador 2" +"\n");

                movementH = Integer.parseInt(JOptionPane.showInputDialog("Posiciòn en horizontal 1, 2, 3→"));

                movementV = Integer.parseInt(JOptionPane.showInputDialog("Posiciòn en vertical 1, 2, 3↓"));

                if (movementV >3 | movementH >3 | movementV <1 | movementH <1) {
                    System.out.print("movimiento no valido" +"\n");
                    i--;
                }
                else if (boardGame[movementV-1][movementH-1] != "-") {
                    System.out.print("posicion ocupada" +"\n");
                    i--;
                    
                } else{
                    boardGame[movementV-1][movementH-1] = "o";
                    changePlayer =! changePlayer;
                }
            }
            i++;
            
            
            endGame = Game.winnig(boardGame);
            
            for (String[] boardGame1 : boardGame) {
                System.out.println(Arrays.deepToString(boardGame1));
            } 
            
            if (endGame == 0) {
                
                i = 10;
                
                if (changePlayer){
                    System.out.print("Gana el jugador 2");
                } else{
                    System.out.print("Gana el jugador 1");
                }
            } else if (i == 9) {
                System.out.print("empate");
            }
        }
    } 
    
    public static int winnig(String[][] boardGame){
        
        int win = 10;
        
        for (int i = 0; i < 3; i++) {
            if (boardGame[i][0] == boardGame[i][1] && boardGame[i][0] == boardGame[i][2] && boardGame[i][0] != "-") {
                win = 0;
            }
            else if (boardGame[0][i] == boardGame[1][i] && boardGame[0][i] == boardGame[2][i] && boardGame[0][i] != "-") {
                win = 0;
            }
            else if (boardGame[0][0] == boardGame[1][1] && boardGame[0][0] == boardGame[2][2] && boardGame[0][0] != "-"){
                win = 0;
            }
            else if (boardGame[0][2] == boardGame[1][1] && boardGame[0][2] == boardGame[2][0] && boardGame[1][1] != "-"){
                win = 0;
            }
        }
        
        
        return win;
    }
}
