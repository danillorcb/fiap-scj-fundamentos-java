package br.com.fiap.exercicio2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Exercicio2 {

	public static void main(String[] args) {
		
		LocalDateTime dataHora = LocalDateTime.of(2012, 9, 10, 12, 00);
		
		System.out.println(
				dataHora.format(DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm")));
		
		System.out.println(
				dataHora.format(DateTimeFormatter.ofPattern("dd-MM-yy hh:mm:ss")));
		
		System.out.println(
				dataHora.format(DateTimeFormatter.ofPattern("EEEE")));
		
		System.out.println(
				dataHora.format(DateTimeFormatter.ofPattern("y")));
		
		System.out.println(
				dataHora.format(DateTimeFormatter.ofPattern("G")));
	}
}
