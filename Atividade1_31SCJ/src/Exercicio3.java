

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Exercicio3 {

	public static void main(String[] args) {
		
		int qtdFuncionarios = 0;
		while (qtdFuncionarios == 0) {
			qtdFuncionarios = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de funcionários:"));
		}
		
		double[] salarios = new double[qtdFuncionarios];
		
		for (int i = 0; i < qtdFuncionarios; i++) {
			salarios[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário do Funcionário "+(i+1)+":").replace(",", "."));
		}
			
		double mediaSalarial = soma(salarios) / qtdFuncionarios;
		DecimalFormat df = new DecimalFormat("#.00");		
		JOptionPane.showMessageDialog(null, "Média salarial da empresa: R$ " + df.format(mediaSalarial), "Mensagem", JOptionPane.INFORMATION_MESSAGE);
	}

	public static double soma(double[] array) {
		
		double total = 0d;
		for (double d : array) {
			total += d;
		}
		return total;
	}
}

