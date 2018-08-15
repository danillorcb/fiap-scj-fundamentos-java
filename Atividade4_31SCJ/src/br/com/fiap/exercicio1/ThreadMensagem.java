package br.com.fiap.exercicio1;

import java.util.ArrayList;
import java.util.List;

public class ThreadMensagem extends Thread {
	
	private static List<String> mensagens = new ArrayList<>();
	
	static {
		mensagens.add("Mensagem pr�-definida n�mero 1");
		mensagens.add("Mensagem pr�-definida n�mero 2");
		mensagens.add("Mensagem pr�-definida n�mero 3");
//		mensagens.add("Mensagem pr�-definida n�mero 4");
//		mensagens.add("Mensagem pr�-definida n�mero 5");
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
