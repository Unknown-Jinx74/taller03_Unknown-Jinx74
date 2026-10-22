/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio10;

/**
 *
 * @author VEL-USER
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean var1 = ((Math.pow(4,3)+ Math.sqrt(81))>70);
        boolean var2 = (var1 && ((50/2) == 25));
        boolean var3 = ((18+12) <= 25);
        boolean var4 = (var3 && !(Math.pow(7,2)>40));
        boolean result = (var2 || var4);
        
        System.out.println(result);
        
    }
    
}
