package Exercico_111;

public class MenorValorVetor {

	public static void main(String[] args) {
	int[] vetor = {5, 2, 9, 1, 7};
	int menorValor = encontrarMenorValor(vetor);
	System.out.println("Menor valor: " + menorValor);
	}
	
	public static int encontrarMenorValor(int[] vetor) {
		return encontrarMenorValorRecursivo(vetor, 0, vetor.length - 1);
	}
	
	private static int encotrarMenorValorRecusivo(int[] vetor, int inicio, int fim) {
		if (inicio == fim) {
			return vetor[inicio];
		} else { 
			int meio = (inicio + fim) / 2;
			int menorEsquerda = encontrarMenorValorRecursivo(vetor, inicio, meio);
			int menorDireita = encontrarMenorValorRecursivo(vetor, meio + 1, fim);
			return Math.min(menorEsquerda, menorDireita);
			
		   
		}
	}

	private static int encontrarMenorValorRecursivo(int[] vetor, int inicio, int meio) {
		// TODO Auto-generated method stub
		return 0;
	}

}
