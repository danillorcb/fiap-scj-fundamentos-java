package br.com.fiap.exercicio4;

public class Calculadora implements CalculadoraBasica {

	@Override
	public float somar(float op1, float op2) throws Exception {
		if (op1 == 0) {
			throw new Exception("Operador 1 igual a zero");
		}
		return op1 + op2;
	}

	@Override
	public float subtrair(float op1, float op2) throws Exception {
		if (op1 == 0) {
			throw new Exception("Operador 1 igual a zero");
		}
		return op1 - op2;
	}

	@Override
	public float dividir(float op1, float op2) throws Exception {
		if (op1 == 0) {
			throw new Exception("Operador 1 igual a zero");
		}
		if (op2 == 0) {
			throw new Exception("Operador 2 igual a zero na divisão");
		}
		return op1 / op2;
	}

	@Override
	public float multiplicar(float op1, float op2) throws Exception {
		if (op1 == 0) {
			throw new Exception("Operador 1 igual a zero");
		}
		return op1 * op2;
	}

}
