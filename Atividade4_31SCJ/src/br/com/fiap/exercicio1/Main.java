package br.com.fiap.exercicio1;

import java.time.Duration;
import java.time.LocalDateTime;

public class Main {

	public static void main(String[] args) {
		
		ThreadMensagem threadMensagem = new ThreadMensagem();
		threadMensagem.start();
		
		ThreadDataHora threadDataHora = new ThreadDataHora();
		threadDataHora.start();
		
		LocalDateTime tempo = LocalDateTime.now();
		while (true) {
			
			if (Duration.between(tempo, LocalDateTime.now()).getSeconds() >= 5) {				
				System.out.println("[Estado da ThreadMensagem : " + threadMensagem.getState() + "]");
				System.out.println("[Estado da ThreadDataHora: " + threadDataHora.getState() + "]");
				tempo = LocalDateTime.now();
			}
		}
	}
}
