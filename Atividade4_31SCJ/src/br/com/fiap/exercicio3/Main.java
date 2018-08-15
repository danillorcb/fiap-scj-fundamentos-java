package br.com.fiap.exercicio3;

public class Main {

	public static void main(String[] args) {
		
		Cores[] cores = Cores.values();
		for (Cores cor : cores) {
			System.out.println("Código: " + cor.getCodigo() + ", Cor: " + cor.getNome());
		}
		
		System.out.println();
		System.out.println("Código: " + Cores.AMARELO.getCodigo() + ", Cor: " + Cores.AMARELO.getNome()); 
		System.out.println("Código: " + Cores.AZUL.getCodigo() + ", Cor: " + Cores.AZUL.getNome());
		System.out.println("Código: " + Cores.BRANCO.getCodigo() + ", Cor: " + Cores.BRANCO.getNome());
		System.out.println("Código: " + Cores.PRETO.getCodigo() + ", Cor: " + Cores.PRETO.getNome());
		System.out.println("Código: " + Cores.VERMELHO.getCodigo() + ", Cor: " + Cores.VERMELHO.getNome());
		
		System.out.println();
		System.out.println("Código da cor branca: " + Cores.BRANCO.getCodigo());
	}
}
