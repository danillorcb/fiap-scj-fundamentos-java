package br.com.fiap.exercicio1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ThreadDataHora extends Thread {

	@Override
	public void run() {
		
		try {
			while (true) {
				DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
				LocalDateTime date = LocalDateTime.now();
				System.out.println(date.format(df));
				sleep(10_000);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
