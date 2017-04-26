/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questoes.exercicio;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class ExercicioQuatro {
    
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira um numero: ");
        double numero = sc.nextDouble();
        
        
        
        
        if (numero % 2 == 0){
            System.out.println("Seu número é par !!!");
        }
        
        
        
        else {
            System.out.println("Seu número é impar !!!");
    }
    
}
}
