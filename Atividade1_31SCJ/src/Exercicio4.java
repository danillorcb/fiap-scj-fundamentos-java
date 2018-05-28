

import javax.swing.JOptionPane;

public class Exercicio4 {

	public static void main(String[] args) {
		
		String[] lista = {"Adi��o", "Subtra��o", "Multiplica��o", "Divis�o"};
		
		String operacao = (String) JOptionPane.showInputDialog(
				null, 
				"Selecione a opera��o:", 
				"Calculadora", 
				JOptionPane.DEFAULT_OPTION, 
				null, 
				lista, 
				null);
		
		String valor1 = JOptionPane.showInputDialog("Entre com o primeiro valor:").replace(",", ".");
		String valor2 = JOptionPane.showInputDialog("Entre com o segundo valor:").replace(",", ".");
		double op1 = Double.parseDouble(valor1);
		double op2 = Double.parseDouble(valor2);
		
		String resultado = "";		
		switch (operacao) {
		case "Adi��o":
			resultado = String.valueOf(soma(op1, op2));
			break;
		case "Subtra��o":
			resultado = String.valueOf(subtracao(op1, op2));
			break;
		case "Multiplica��o":
			resultado = String.valueOf(multiplicacao(op1, op2));
			break;
		case "Divis�o":
			resultado = String.valueOf(divisao(op1, op2));
			break;
		}
		
		JOptionPane.showMessageDialog(null, "Resultado: "+resultado, "Calculadora", JOptionPane.INFORMATION_MESSAGE);
	}
		
	public static double soma(double op1, double op2) {
		return op1 + op2;
	}
	public static double subtracao(double op1, double op2) {
		return op1 - op2;
	}
	public static double multiplicacao(double op1, double op2) {
		return op1 * op2;
	}
	public static double divisao(double op1, double op2) {
		return op1 / op2;
	}
}
