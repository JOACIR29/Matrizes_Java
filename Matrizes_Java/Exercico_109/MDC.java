package Exercico_109;

public class MDC {

	public static void main(String[] args) {
		int numero1 = 36;
		int numero2 = 48;
		int mdc = calcularMDC(numero1, numero2);
		System.out.println("O MDC de " + numero1 + " e " + numero2 + " é: " + mdc);

	}
	
	public static int calcularMDC(int numero1, int numero2) {
		if (numero2 == 0) {
			return numero1;
		} else { 
			return calcularMDC(numero2, numero1 % numero2);
		}
	}

}
