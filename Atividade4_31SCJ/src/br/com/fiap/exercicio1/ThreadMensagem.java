package br.com.fiap.exercicio1;

import java.util.ArrayList;
import java.util.List;

public class ThreadMensagem extends Thread {
	
	private static List<String> mensagens = new ArrayList<>();
	
	static {
		mensagens.add("Mensagem pré-definida número 1");
		mensagens.add("Mensagem pré-definida número 2");
		mensagens.add("Mensagem pré-definida número 3");
//		mensagens.add("Mensagem pré-definida número 4");
//		mensagens.add("Mensagem pré-definida número 5");
	}
	
	@Override
	public void run() {
		
		try {
			while (mensagens.size() > 0) {
				System.out.println(mensagens.get(0));
				mensagens.remove(0);
				sleep(20_000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
