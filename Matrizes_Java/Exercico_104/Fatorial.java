package Exercico_104;

public class Fatorial {
	public static void main(String[] args) {
		int numero = 5;
		long resultado = calcularFatorial(numero);
		System.out.println("O fatorial de " + numero + " é: " + resultado);
	}
	
	public static long calcularFatorial(int numero) {
		if (numero == 0) {
			return 1;
		} else {
			return numero * calcularFatorial(numero - 1);
		}
	}
}
