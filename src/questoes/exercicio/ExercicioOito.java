
package questoes.exercicio;

import java.util.Scanner;


public class ExercicioOito {
    
 public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        
       System.out.println("Informe um numero : ");
       int numero = sc.nextInt(); 
       
       String bin = Integer.toString(numero, 2);
       
       System.out.println("Seu numero em binario é : " + bin);
    }
    
}
