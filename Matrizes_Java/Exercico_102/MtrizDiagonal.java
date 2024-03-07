package Exercico_102;

import java.util.Scanner;

public class MtrizDiagonal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int tamanho =4;
		int[][] matriz = new int [tamanho][tamanho];
		
		// Leitura dos elementos da matriz
		for (int i = 0; i < tamanho; i++) {
			for (int j = 0; j < tamanho; j++) {
				System.out.print("Digite o elemento da posição [" + i + "][" + j + "]: ");
				matriz[i][j] = scanner.nextInt();
			}
		}
		
		boolean ehDiagonal = true;
		
		// Verificação da diagonal
		for (int i = 0; i < tamanho; i++) {
			for (int j = 0; j < tamanho; j++) {
				if (i != j && matriz[i][j] != 0) {
					ehDiagonal = false;
					break;
				}
			}
			if (!ehDiagonal) {
				break;
			}
		}
		// Exibição do resultado
		if (ehDiagonal) {
			System.out.println("A matriz é diagonal! ");
		} else {
			System.out.println("A matriz não é diagonal!");
		}
		
		
		scanner.close();

	}

}
