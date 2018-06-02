package br.com.fiap.exercicio4;

import javax.swing.JOptionPane;

public class Main {
	
	public static void main(String[] args) {
		
		while (true) {
			
			float op1 = input(1);
			float op2 = input(2);
			
			Calculadora calculadora = new Calculadora();
			try {
				float soma = calculadora.somar(op1, op2);
				float sub  = calculadora.subtrair(op1, op2);
				float div  = calculadora.dividir(op1, op2);
				float mult = calculadora.multiplicar(op1, op2);
						
				System.out.println("Soma.........: " + soma);
				System.out.println("Subtra��o....: " + sub);
				System.out.println("Divis�o......: " + div);
				System.out.println("Multiplica��o: " + mult);
				System.out.println("---------------------------");
				
				if (JOptionPane.showConfirmDialog(null, "Deseja realizar uma nova opera��o?", "Calculadora", 
						JOptionPane.YES_NO_OPTION) == JOptionPane.NO_OPTION) {
					break;
				}
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
			}		
		}
	}
	
	public static float input(int operador) {
		
		float value;
		
		while (true) {
			try {
				value = Float.parseFloat(JOptionPane.showInputDialog("Digite o " + operador + "� operador"));
				break;
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, 
						"Valor inv�lido, digite novamente.", "Erro", JOptionPane.ERROR_MESSAGE);
			}
		}		
		
		return value;
	}
	
}
