package Exercico_107;

public class SomaDigitos {

	public static void main(String[] args) {
		int numero = 12345;
		int soma = calcularSomaDigitos(numero);
		System.out.println("A soma dos dígitos de " + numero + " é: " + soma);
	}
	
	public static int calcularSomaDigitos(int numero) {
		if (numero < 10) {
			return numero;
		} else {
			return numero % 10 + calcularSomaDigitos(numero / 10);
		}
	}

}
