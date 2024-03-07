package Exercico_101;

import java.util.Scanner;

public class MultiplicacaoMatrizes {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite io número de linhas da primeira matriz: ");
		int linhasA = scanner.nextInt();
		
		System.out.print("Digite o número de colunas da segunda matriz: ");
		int colunasA = scanner.nextInt();
		
		System.out.print("Digite o número de linhas da segunda matriz: ");
		int linhasB = scanner.nextInt();
		
		System.out.print("Digite o número de colunas da segunda matriz: ");
		int colunasB = scanner.nextInt();
		
		// Verifica se a multiplicação é possivel
		if (colunasA != linhasB) {
			System.out.println("Não é possivel multiplicar as matrizes.");
			System.exit(0);
		}
		
		// Cria as matrizes
		int[][] matrizA = new int[linhasA][colunasA];
		int[][] matrizB = new int[linhasB][colunasB];
		int[][] matrizResultado = new int[linhasA][colunasB];
		
		// Lê os elementos da primeira matriz
		System.out.println("Digite os elementos da primeira matriz:");
		for (int i = 0; i < linhasA; i++) {
			for (int j = 0; j < colunasA; j++) {
				matrizA[i][j] = scanner.nextInt();
			}
		}
		
		// Lê os elementos da segunda matriz
		System.out.println("Digite os elemntos da segunda matriz.");
		for ( int i = 0; i < linhasB; i++) {
			for (int j = 0;j < colunasB; j++) {
				matrizB[i][j] = scanner.nextInt();
			}
		}
		// Realiza a multiplicação das matrizes
		for (int i = 0; i < linhasA; i++) {
			for ( int j = 0; j < colunasB; j++) {
				for (int k = 0; k < colunasA; k++) {
					matrizResultado[i][j] += matrizA[i][k] * matrizB[k][j];
				}
			}
		}
		// Exibe a matriz resultado
		System.out.println("Matriz resultado:");
		for (int i =0; i <linhasA; i++) {
			for (int j = 0; j < colunasB; j++) {
				System.out.print(matrizResultado[i][j] + " ");
			}
			System.out.println();
		}
		
		scanner.close();

	}

}
