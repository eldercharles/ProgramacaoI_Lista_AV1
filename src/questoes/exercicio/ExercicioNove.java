
package questoes.exercicio;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class ExercicioNove {
    
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o numero da matriz: ");
        int matriz = sc.nextInt();

        for (int i = 0; i < matriz + 1; i++) {

            for (int v = 0; v < matriz; v++) {
                System.out.println("|" + v + "|" + i + "|");
            }

        }
    }
    
}
