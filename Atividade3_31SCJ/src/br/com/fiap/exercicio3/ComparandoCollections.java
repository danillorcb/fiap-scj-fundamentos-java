package br.com.fiap.exercicio3;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.WeakHashMap;

public class ComparandoCollections {

	public static void main(String[] args) {
		int quantidade = 1_000_000;

		// Comparando ArrayList e LinkedList
		comparaArrayListComLinkedList(quantidade);

		// Comparando Stack e HashSet
		comparaStackComHashSet(quantidade);

		// Comparando HashMap e WeakHashMap
		comparaHashMapComWeakHashMap(quantidade);
	}

	public static void comparaArrayListComLinkedList(int quantidade) {
		List<Integer> arrayList = new ArrayList<>();
		List<Integer> linkedList = new LinkedList<>();

		long tempoArrayList = adicionaNaCollection(arrayList, quantidade);
		long tempoLinkedList = adicionaNaCollection(linkedList, quantidade);

		System.out.println("Tempo adicionando " + quantidade + " elementos em ArrayList : " + tempoArrayList);
		System.out.println("Tempo adicionando " + quantidade + " elementos em LinkedList: " + tempoLinkedList);

		if (tempoArrayList < tempoLinkedList) {
			System.out.println("[RESULTADO]: ArrayList melhor para inserção.");
		} else if (tempoArrayList > tempoLinkedList) {
			System.out.println("[RESULTADO]: LinkedList melhor para inserção.");
		} else {
			System.out.println("[RESULTADO]: Empate.");
		}

		System.out.println();

		tempoArrayList = buscaNaList(arrayList, quantidade / 2);
		tempoLinkedList = buscaNaList(linkedList, quantidade / 2);

		System.out.println("Tempo buscando posição central em ArrayList : " + tempoArrayList);
		System.out.println("Tempo buscando posição central em LinkedList : " + tempoLinkedList);

		if (tempoArrayList < tempoLinkedList) {
			System.out.println("[RESULTADO]: ArrayList melhor para busca de informação.");
		} else if (tempoArrayList > tempoLinkedList) {
			System.out.println("[RESULTADO]: LinkedList melhor para busca de informação.");
		} else {
			System.out.println("[RESULTADO]: Empate.");
		}

		System.out.println("--------------------------------------------------------------");
	}

	public static void comparaStackComHashSet(int quantidade) {
		List<Integer> stack = new Stack<>();
		Set<Integer> hashSet = new HashSet<>();

		long tempoStack = adicionaNaCollection(stack, quantidade);
		long tempoHashSet = adicionaNaCollection(hashSet, quantidade);

		System.out.println("Tempo adicionando " + quantidade + " elementos em Stack : " + tempoStack);
		System.out.println("Tempo adicionando " + quantidade + " elementos em HashSet: " + tempoHashSet);

		if (tempoStack < tempoHashSet) {
			System.out.println("[RESULTADO]: Stack melhor para inserção.");
		} else if (tempoStack > tempoHashSet) {
			System.out.println("[RESULTADO]: HashSet melhor para inserção.");
		} else {
			System.out.println("[RESULTADO]: Empate.");
		}

		System.out.println();

		tempoStack = buscaNaList(stack, quantidade / 2);
		tempoHashSet = buscaNoSet(hashSet, quantidade / 2);

		System.out.println("Tempo buscando posição central em Stack : " + tempoStack);
		System.out.println("Tempo buscando posição central em HashSet : " + tempoHashSet);

		if (tempoStack < tempoHashSet) {
			System.out.println("[RESULTADO]: Stack melhor para busca de informação.");
		} else if (tempoStack > tempoHashSet) {
			System.out.println("[RESULTADO]: HashSet melhor para busca de informação.");
		} else {
			System.out.println("[RESULTADO]: Empate.");
		}

		System.out.println("--------------------------------------------------------------");
	}

	public static void comparaHashMapComWeakHashMap(int quantidade) {
		Map<Integer, Integer> hashMap = new HashMap<>();
		Map<Integer, Integer> weakHashMap = new WeakHashMap<>();

		long tempoHashMap = adicionaNoMap(hashMap, quantidade);
		long tempoWeakHashMap = adicionaNoMap(weakHashMap, quantidade);

		System.out.println("Tempo adicionando " + quantidade + " elementos em HashMap : " + tempoHashMap);
		System.out.println("Tempo adicionando " + quantidade + " elementos em WeakHashMap: " + tempoWeakHashMap);

		if (tempoHashMap < tempoWeakHashMap) {
			System.out.println("[RESULTADO]: HashMap melhor para inserção.");
		} else if (tempoHashMap > tempoWeakHashMap) {
			System.out.println("[RESULTADO]: WeakHashMap melhor para inserção.");
		} else {
			System.out.println("[RESULTADO]: Empate.");
		}

		System.out.println();

		tempoHashMap = buscaNoMap(hashMap, quantidade / 2);
		tempoWeakHashMap = buscaNoMap(weakHashMap, quantidade / 2);

		System.out.println("Tempo buscando posição central em HashMap : " + tempoHashMap);
		System.out.println("Tempo buscando posição central em WeakHashMap : " + tempoWeakHashMap);

		if (tempoHashMap < tempoWeakHashMap) {
			System.out.println("[RESULTADO]: HashMap melhor para busca de informação.");
		} else if (tempoHashMap > tempoWeakHashMap) {
			System.out.println("[RESULTADO]: WeakHashMap melhor para busca de informação.");
		} else {
			System.out.println("[RESULTADO]: Empate.");
		}

		System.out.println("--------------------------------------------------------------");
	}

	public static long adicionaNaCollection(Collection<Integer> c, int quantidade) {
		LocalDateTime inicio = LocalDateTime.now();
		for (int i = 0; i < quantidade; i++) {
			c.add(i);
		}
		LocalDateTime fim = LocalDateTime.now();

		return ChronoUnit.MILLIS.between(inicio, fim);
	}

	public static long adicionaNoMap(Map<Integer, Integer> map, int quantidade) {
		LocalDateTime inicio = LocalDateTime.now();
		for (int i = 0; i < quantidade; i++) {
			map.put(i, i);
		}
		LocalDateTime fim = LocalDateTime.now();

		return ChronoUnit.MILLIS.between(inicio, fim);
	}

	public static long buscaNaList(List<Integer> lista, int posicao) {
		LocalDateTime inicio = LocalDateTime.now();
		lista.get(posicao);
		LocalDateTime fim = LocalDateTime.now();

		return ChronoUnit.MILLIS.between(inicio, fim);
	}

	public static long buscaNoSet(Set<Integer> set, int posicao) {
		LocalDateTime inicio = LocalDateTime.now();
		set.contains(posicao);
		LocalDateTime fim = LocalDateTime.now();

		return ChronoUnit.MILLIS.between(inicio, fim);
	}

	public static long buscaNoMap(Map<Integer, Integer> map, int posicao) {
		LocalDateTime inicio = LocalDateTime.now();
		map.get(posicao);
		LocalDateTime fim = LocalDateTime.now();

		return ChronoUnit.MILLIS.between(inicio, fim);
	}
}
