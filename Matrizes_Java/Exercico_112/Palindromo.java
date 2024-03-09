package Exercico_112;

public class Palindromo {

	public static void main(String[] args) {
		String palavra = "radar";
		boolean resultado = verificarPalindromo(palavra);
		System.out.println("A palavra " + palavra + " é um palindromo? "+ resultado);
	}
	
	public static boolean verificarPalindromo(String palavra) {
		if (palavra.length() <= 1) {
			return true;
		} else {
			char primeiro = palavra.charAt(0);
			char ultimo = palavra.charAt(palavra.length() - 1);
			
			if (primeiro == ultimo) {
				String subPalavra = palavra.substring(1, palavra.length() - 1);
				return verificarPalindromo(subPalavra);
			} else {
				return false;
			}
		}
	}

}