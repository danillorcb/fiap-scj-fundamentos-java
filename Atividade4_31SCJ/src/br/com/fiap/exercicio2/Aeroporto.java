package br.com.fiap.exercicio2;

public class Aeroporto extends Thread {

	private String nome;
	private boolean estadoPista = false;

	public Aeroporto(String nome) {
		this.nome = nome;
	}

	@Override
	public void run() {
		System.out.println("[Aeroporto " + this.nome + " em funcionamento]");
		try {
			
			while (true) {
				alterarEstadoPista();
				sleep(3000);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public synchronized void aguardaPistaDisponivel() throws InterruptedException {
		while (!estadoPista) {
			System.out.println("Aguardando pista disponível...");
			wait();
		}
	}

	public synchronized void alterarEstadoPista() {
		estadoPista = !estadoPista;
		if (estadoPista) {
			System.out.println("[PISTA DISPONÍVEL]");
			notifyAll();
		} else {
			System.out.println("[PISTA INDISPONÍVEL]");
		}
	}
}
