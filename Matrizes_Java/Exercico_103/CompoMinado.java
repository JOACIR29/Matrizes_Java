package Exercico_103;

import java.util.Scanner;

public class CompoMinado {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// Leitura das dimensões da matriz
		System.out.print("Digite o número de linhas da matriz: ");
		int linhas = scanner.nextInt();
		System.out.print("Digite o número de colunas da matriz: ");
		int colunas = scanner.nextInt();
		
		// Criação da matriz
		int[][] campoMinado = new int[linhas][colunas];
		
		// Leitura da matriz
		System.out.print("Digite a matriz indicando os locais das minas ");
		System.out.println("0 para cmpo neutro e 1 para mina:");
		
		for (int i = 0; i < linhas; i++) {
			for (int j = 0; j < colunas; j++) {
				campoMinado[i][j] = scanner.nextInt();
			}
		}
		// Criação da matriz com a contagem de minas nas casas vizinhas
		int[][] resultado = new int[linhas][colunas];
		
		// Iteração pela matriz campoMinado
		for (int i =0; i < linhas; i++) {
			for (int j = 0; j < colunas; j++) {
				// Verifica se a posição atual contém uma mina
				if (campoMinado[i][j] == 1) {
					// Incrementa o número de menas nas casas vizinhas
					incrementarVizinhos(resultado, i, j);
				}
			}
		}
		
		// Exibição da matriz resultado
		System.out.println("Matriz com a contagem de minas nas casas vizinhas:");
		for (int i = 0; i < linhas; i++) {
			for (int j = 0; j < colunas; j++) {
				System.out.print(resultado[i][j] + " ");
			}
			System.out.println();
		}
		scanner.close();
	}
	// Método para incrementar o número de minas nas casca vizinhas
	public static void incrementarVizinhos(int[][] matriz,int linha,int coluna) {
		int linhas = matriz.length;
		int colunas = matriz[0].length;
		
		// Verificação dos vizinhos em torno da posição atual
		for (int i = linha - 1; i <= linha + 1; i++) {
			for (int j = coluna - 1; j <= coluna + 1; j++) {
				// Verifica se a posição é válida e não é a posição atual
				if (i >= 0 && i < linhas && j >= 0 &&
					j < colunas && !(i == linha && j == coluna)) {
					matriz[i][j]++;
				}
			}
		}
	}

}
