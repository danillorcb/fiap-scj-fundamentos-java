

import javax.swing.JOptionPane;

public class Exercicio5 {

	public static void main(String[] args) {
		
		int i = Integer.parseInt(JOptionPane.showInputDialog("Digite um número para calcular o fatorial"));
		
		int fatorial = 1;
		while (i > 0) {
			fatorial *= i;
			i--;
		}
		
		JOptionPane.showMessageDialog(null, "Fatorial de "+i+" é: "+fatorial, "Calculadora", JOptionPane.INFORMATION_MESSAGE);
	}

}
