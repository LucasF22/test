package br.com.aula04;

import java.util.Scanner;

public class ExercicioTres {
		// 3. Ler um conjunto de n�meros reais, armazenando-o em vetor e calcular o 
		// quadrado dos componentes deste vetor, armazenando o resultado em outro vetor.
		// Os conjuntos tem 10 elementos cada. 
		// Imprimir todos os conjuntos no fim da execu��o.
		public static void main(String[] args) {
				
			Scanner teclado = new Scanner(System.in);
			System.out.println("## VALORES E O SEU QUADRADO ##");
			float[] numeros = new float[5];
	 		float[] quadrados = new float [5];
			
	 		for(int i = 0; i < numeros.length; i++) {
	 			System.out.println("Digite com um valor: ");
	 			numeros[i] = teclado.nextFloat();
	 		}
			
	 		
	 		System.out.println("\nN�meros lidos:");
	 		for (float valor : numeros) {
	 			System.out.println(valor);
	 		}
	 		
	 			 		
	 		System.out.println("\nQuadrados");
	 		for (float valor : quadrados) {
	 			System.out.println(valor);
	 		}
	 		
	 		teclado.close();
		}
}
