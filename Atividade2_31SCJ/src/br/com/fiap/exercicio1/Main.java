package br.com.fiap.exercicio1;

import javax.swing.JOptionPane;

public class Main {
	
	public static void main(String[] args) {
		
		float op1 = Float.parseFloat(
				JOptionPane.showInputDialog("Digite o primeiro valor:"));
		float op2 = Float.parseFloat(
				JOptionPane.showInputDialog("Digite o segundo valor:"));
		
		Calculadora calculadora = new Calculadora();
		
		System.out.println("Soma.........: " + calculadora.somar(op1, op2));
		System.out.println("Subtração....: " + calculadora.subtrair(op1, op2));
		System.out.println("Divisão......: " + calculadora.dividir(op1, op2));
		System.out.println("Multiplicação: " + calculadora.multiplicar(op1, op2));
	}
}
