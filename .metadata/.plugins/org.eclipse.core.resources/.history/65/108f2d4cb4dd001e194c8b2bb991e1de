package Exercico_113;

public class somaVetor {

	public static void main(String[] args) {
		int[] vetor = { 1, 2, 3, 4, 5 };
		int resultado = calcularSomaVetor(vetor, vetor.length - 1);
		System.out.println("A soma dos elementos do vetor é: " + resultado);
	}

	public static int calcularSomaVetor(int[] vetor, int indice) {
		if (indice < 0) {
			return 0;
		} else {
			return vetor[indice] + calcularSomaVetor(vetor, indice - 1);

		}
	}
}
