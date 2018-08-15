package br.com.fiap.exercicio2;

public class Aviao extends Thread {

	private String nomeDoVoo;
	private Aeroporto aeroporto;    
	
	public Aviao(String nomeDoVoo, Aeroporto aeroporto) {
		this.nomeDoVoo = nomeDoVoo;
		this.aeroporto = aeroporto;
	}
	
	@Override
	public void run() {
		try {
			
			while (true) {
				decolar();
				voar();
				aterrissar();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private synchronized void decolar() throws InterruptedException {
		this.aeroporto.aguardaPistaDisponivel();
		System.out.println("[/  ] Decolando: " + nomeDoVoo);
	}

	private void voar() {
		try {
			System.out.println("[ - ] Voando: " + nomeDoVoo);
			sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}	
	
	private synchronized void aterrissar() throws InterruptedException {
		this.aeroporto.aguardaPistaDisponivel();
		System.out.println("[  \\] Aterrissando: " + nomeDoVoo);
	}
}
