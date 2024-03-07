package Exercico_110;

public class InverterString {

	public static void main(String[] args) {
		String texto = "Olá mundo!";
		String textoInvertido = inverterString(texto);
		System.out.println("Texto original: " + texto);
		System.out.println("Texto invertido: " + textoInvertido);

	}
	
	public static String inverterString(String texto) {
		if (texto.isEmpty()) {
			return texto;
		} else { 
			char primeiroChar = texto.charAt(0);
			String restoString = texto.substring(1);
			return inverterString(restoString) + primeiroChar;
		}
	}

}
