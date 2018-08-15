package br.com.fiap.exercicio5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

public class Cripto {
	
	public static String dirPackage = "src\\br\\com\\fiap\\exercicio5\\";

	public static void main(String[] args) throws IOException {

		System.out.println("[Para encerrar a leitura, deixe uma linha em branco e pressione ENTER]");

		InputStream in = System.in;
		Reader isr = new InputStreamReader(in);
		BufferedReader br = new BufferedReader(isr);

		List<String> conteudo = new ArrayList<>();

		// Lendo linhas digitadas no System.in
		String linha = br.readLine();
		while (linha != null && !linha.isEmpty()) {

			// Codificando cada linha lida
			conteudo.add(codificar(linha));

			linha = br.readLine();
		}

		if (!conteudo.isEmpty()) {

			// Salvando primeiro arquivo com a mensagem codificada
			escreverArquivo(dirPackage + "mensagemCodificada.txt", conteudo); 

			// Lendo o arquivo com a mensagem codificada
			List<String> msgCodificada = lerArquivo(dirPackage + "mensagemCodificada.txt");

			// Decodificando as linhas do arquivo codificado
			List<String> msgDecodificada = new ArrayList<>();
			for (String linhaDecodificada : msgCodificada) {
				msgDecodificada.add(decodificar(linhaDecodificada));
			}

			// Salvando o segundo arquivo com a mensagem decodificada
			escreverArquivo(dirPackage + "mensagemDecodificada.txt", msgDecodificada);
		}
	}

	private static String codificar(String linha) {
		StringBuilder builder = new StringBuilder();
		builder.append(linha);
		for (int i = 0; i < builder.length(); i++) {
			int ascii = (int) builder.charAt(i) + 1;
			builder.setCharAt(i, (char) ascii);
		}
		return builder.toString();
	}

	private static String decodificar(String linha) {
		StringBuilder builder = new StringBuilder();
		builder.append(linha);
		for (int i = 0; i < builder.length(); i++) {
			int ascii = (int) builder.charAt(i) - 1;
			builder.setCharAt(i, (char) ascii);
		}
		return builder.toString();
	}

	private static void escreverArquivo(String nomeArquivo, List<String> conteudo) throws IOException {
		FileWriter fw = new FileWriter(nomeArquivo);
		BufferedWriter bw = new BufferedWriter(fw);

		for (String linha : conteudo) {
			bw.write(linha);
			bw.newLine();
		}

		bw.close();
		fw.close();
	}

	private static List<String> lerArquivo(String nomeArquivo) throws IOException {
		FileReader fr = new FileReader(nomeArquivo);
		BufferedReader br = new BufferedReader(fr);

		List<String> conteudo = new ArrayList<>();
		while (br.ready()) {
			conteudo.add(br.readLine());
		}

		br.close();
		fr.close();

		return conteudo;
	}
}
