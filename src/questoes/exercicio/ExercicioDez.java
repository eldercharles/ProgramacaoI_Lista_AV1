
package questoes.exercicio;

import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class ExercicioDez {
    
public static void main(String[] args) {
        Object[] cityObject = new Object[5];
        String userCity;

	int count = 0;

	do {
            userCity = JOptionPane.showInputDialog(null, "Digite uma cidade");
            
            if (!userCity.equals("")) {
            cityObject[count] = userCity;
            System.out.println(cityObject[count]);
            count++;
            }
	} while (count < 5);

        JOptionPane.showInputDialog(null, "Escolha uma cidade", "Cidades", JOptionPane.INFORMATION_MESSAGE, null,
        cityObject, cityObject[0]);
    }
    
}
