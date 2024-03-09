package Exercico_116;

import java.util.Scanner;

public class PalavraPrima {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma palavra: ");
        String palavra = scanner.nextLine();

        if (ehPalavraPrima(palavra)) {
            System.out.println(palavra + " é uma palavra prima!");
        } else {
            System.out.println(palavra + " não é uma palavra prima.");
        }
    }

    private static boolean ehPalavraPrima(String palavra) {
        int somaValores = calcularSomaValores(palavra);
        return ehPrimo(somaValores);
    }

    private static int calcularSomaValores(String palavra) {
        int soma = 0;
        for (int i = 0; i < palavra.length(); i++) {
            char letra = palavra.toUpperCase().charAt(i);
            if (letra >= 'A' && letra <= 'Z') {
                soma += letra - 'A' + 1;
            }
        }
        return soma;
    }

    private static boolean ehPrimo(int numero) {
        if (numero < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}

