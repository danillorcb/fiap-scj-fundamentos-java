package br.com.fiap.exercicio3;

public enum Cores {
	BRANCO("Branco", 21),
	PRETO("Preto", 22),
	VERMELHO("Vermelho", 23),
	AMARELO("Amarelo", 24),
	AZUL("Azul", 25);
	
	private String nome;
	private int codigo;
	
	private Cores(String nome, int codigo) {
		this.nome = nome;
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public int getCodigo() {
		return codigo;
	}
}
