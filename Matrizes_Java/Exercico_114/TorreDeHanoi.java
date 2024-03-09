package Exercico_114;

public class TorreDeHanoi {

	public static void main(String[] args) {
		int numDiscos = 3; // Número de discos
		
		// Chama o método para a Torre de Hanoi
		resolverTorreDeHanoi(numDiscos, 'A', 'B', "c");

	}
	
	// Método recursivo para resolver a Torre de Hano1
	public static void resolverTorreDeHanoi(int numDiscos, char origem, char auxiliar, String string) {
		if (numDiscos == 1) {
			// Caso base: menor o disco a origem para o destino
			System.out.println("Mover disco 1 de " + origem + " para " +string) ;
		} else {
			// Mover n-1 discos da origem para auxiliar usando do destino como auxiliar
			resolverTorreDeHanoi(numDiscos - 1, origem, auxiliar, string);
			
			// Mover o disco restante da origem para o destino
			System.out.println("Mover disco " + numDiscos + " de " + origem + "para " + string );
			
			// Mover os n-1 dicos do auxiliar para  o destino usando a origem como auxiliar
			resolverTorreDeHanoi(numDiscos - 1, auxiliar,  origem, string);
		}
	}

}
