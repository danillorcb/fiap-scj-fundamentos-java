package br.com.fiap.exercicio3;

public class Main {

	public static void main(String[] args) {
		
		Cores[] cores = Cores.values();
		for (Cores cor : cores) {
			System.out.println("C�digo: " + cor.getCodigo() + ", Cor: " + cor.getNome());
		}
		
		System.out.println();
		System.out.println("C�digo: " + Cores.AMARELO.getCodigo() + ", Cor: " + Cores.AMARELO.getNome()); 
		System.out.println("C�digo: " + Cores.AZUL.getCodigo() + ", Cor: " + Cores.AZUL.getNome());
		System.out.println("C�digo: " + Cores.BRANCO.getCodigo() + ", Cor: " + Cores.BRANCO.getNome());
		System.out.println("C�digo: " + Cores.PRETO.getCodigo() + ", Cor: " + Cores.PRETO.getNome());
		System.out.println("C�digo: " + Cores.VERMELHO.getCodigo() + ", Cor: " + Cores.VERMELHO.getNome());
		
		System.out.println();
		System.out.println("C�digo da cor branca: " + Cores.BRANCO.getCodigo());
	}
}
