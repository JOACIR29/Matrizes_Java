package Execicio_100;

import java.util.Scanner;

public class DeterminanteMatriz3x3 {

	public static void main(String[] args) {
		int[][] matriz = new int[3][3];
		Scanner scanner = new Scanner(System.in);
		
		// Lendo os elementos da matriz
		System.out.println("Digite os elemntos da matriz 3x3:");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				matriz[i][j] = scanner.nextInt();
			}
		}
		
		// Calculando o determinate
		int determinante = (matriz[0][0] * matriz[1][1] * matriz[2][2])
				+ (matriz[0][1] * matriz[1][2] * matriz[2][0])
				+ (matriz[0][2] * matriz[1][0] * matriz[2][1])
				- (matriz[0][2] * matriz[1][1] * matriz[2][0])
				- (matriz[0][0] * matriz[1][1] * matriz[2][1])
				- (matriz[0][1] * matriz[1][0] * matriz[2][2]);
		
		//Exibindo o determinante
		System.out.println("Determinante: " + determinante);

	}

}
