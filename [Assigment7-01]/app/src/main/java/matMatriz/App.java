/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package matMatriz;

public class App {
    public static void main(String[] args) {
        
        int[][] matriz = Methods.Matriz();
        
        int line = Methods.additionReverseDiagonal(matriz, 1);
        
        System.out.println("The sum is: "+line);
        
    }
}
