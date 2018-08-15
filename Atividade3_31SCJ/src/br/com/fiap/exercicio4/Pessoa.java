package br.com.fiap.exercicio4;

public class Pessoa implements Comparable<Pessoa> {
	
	private String nome;
	private int idade;
	private char sexo;
	private String empresa;
	
	public Pessoa(String nome, int idade, char sexo, String empresa) {
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
		this.empresa = empresa;
	}

	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}

	public char getSexo() {
		return sexo;
	}

	public String getEmpresa() {
		return empresa;
	}
	
	@Override
	public String toString() {
		return "|" + nome + "|" + idade + "|" + sexo + "|" + empresa + "|";
	}

	@Override
	public int compareTo(Pessoa outraPessoa) {
		return this.getNome().compareTo(outraPessoa.getNome());
	}
}
