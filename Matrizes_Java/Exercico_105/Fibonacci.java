package Exercico_105;

public class Fibonacci {

	public static void main(String[] args) {
		int limite = 50;
		System.out.println("Sequência de Fibonacci até " + limite + ":");
		for (int i = 0; i <= limite; i++) {
			System.out.print(calcularFibonacci(i) + " ");
		}
	}
	
	public static int calcularFibonacci(int numero) {
		if (numero <= 1) {
			return numero;
		} else {
			return calcularFibonacci(numero - 1) + calcularFibonacci(numero - 2);
		}
	}

}
