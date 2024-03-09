package Exercico_115;

public class JogoDaVelha {

	public static void main(String[] args) {
		// Exemplo de matriz 3x3 representando o jogo da velha
		char[][] jogoDaVelha = { { 'X', 'O', 'X' }, { 'O', 'X', 'O' }, { 'X', 'X', 'O' } };

		// Chamada da função para verificar o resultado do jogo
		verificarResultado(jogoDaVelha);
	}

	public static void verificarResultado(char[][] jogoDaVelha) {
		// Verificar linhas e colunas
		for (int i = 0; i < 3; i++) {
			if (jogoDaVelha[i][0] == jogoDaVelha[i][1] && jogoDaVelha[i][1] == jogoDaVelha[i][2]
					&& jogoDaVelha[i][0] != ' ') {
				System.out.println("Jogador " + jogoDaVelha[i][0] + " venceu!");
				return;
			}

			if (jogoDaVelha[0][i] == jogoDaVelha[1][i] && jogoDaVelha[1][i] == jogoDaVelha[2][i]
					&& jogoDaVelha[0][i] != ' ') {
				System.out.println("Jogador " + jogoDaVelha[0][i] + " venceu!");
				return;
			}
		}

		// Verificar diagonais
		if ((jogoDaVelha[0][0] == jogoDaVelha[1][1] && jogoDaVelha[1][1] == jogoDaVelha[2][2]
				&& jogoDaVelha[0][0] != ' ')
				|| (jogoDaVelha[0][2] == jogoDaVelha[1][1] && jogoDaVelha[1][1] == jogoDaVelha[2][0]
						&& jogoDaVelha[0][2] != ' ')) {
			System.out.println("Jogador " + jogoDaVelha[1][1] + " venceu!");
			return;
		}

		// Verificar empate
		boolean empate = true;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (jogoDaVelha[i][j] == ' ') {
					empate = false;
					break;
				}
			}
		}

		if (empate) {
			System.out.println("O jogo terminou em empate!");
		} else {
			System.out.println("O jogo ainda não terminou.");
		}
	}
}
