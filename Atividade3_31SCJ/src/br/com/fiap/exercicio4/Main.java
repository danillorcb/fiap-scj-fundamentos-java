package br.com.fiap.exercicio4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<Pessoa> pessoas = new ArrayList<>();
		pessoas.add(new Pessoa("João Garcia", 20, 'M', "AIK Enterprises"));
		pessoas.add(new Pessoa("Maria Martins", 44, 'F', "Simples"));
		pessoas.add(new Pessoa("Henrique Fernando", 43, 'M', "AIK Enterprises"));
		pessoas.add(new Pessoa("Inácio Luís", 33, 'M', "Magazine André"));
		pessoas.add(new Pessoa("Fernando Ferreira", 87, 'M', "Casas Recife"));

		// a. Sortear a lista e retirar uma pessoa;
		Collections.shuffle(pessoas);
		System.out.println(pessoas.get(0));
		System.out.println();
		
		// b. Ordenação da lista baseado no atributo nome;
		Collections.sort(pessoas);
		pessoas.forEach(System.out::println);
		System.out.println();
		
		// c. Inverter a ordem da lista baseado no atributo nome;
		Collections.reverse(pessoas);
		pessoas.forEach(System.out::println);
		System.out.println();
	}
}
