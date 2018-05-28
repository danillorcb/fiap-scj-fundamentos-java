

public class Exercicio1 {

	public static void main(String[] args) {
		
		int[] a = {1,2,3};
		exibeArray(a);
		
		System.out.println();
		
		int[] b = inverteArray(a);
		exibeArray(b);
	}

	public static int[] inverteArray(int[] array) {
		
		int[] inverso = new int[array.length];
		
		for (int i = 1; i <= array.length; i++) {
			inverso[i-1] = array[array.length-i];
		}		
		return inverso;
	}
	
	public static void exibeArray(int[] array) {
		for (int i : array) {
			System.out.println(i);
		}
	}
}
