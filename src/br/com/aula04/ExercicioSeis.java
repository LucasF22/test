package br.com.aula04;

import java.util.Scanner;

public class ExercicioSeis {
	// Fa�a um programa que receba do usu�rio um vetor com 
		// 10 posi��es. Em seguida dever� ser 
		// impresso o maior e o menor elemento do vetor.
		public static void main(String[] args) {
			
			Scanner teclado = new Scanner(System.in);
			System.out.println("## MAIOR MENOR DENTRO DE UM VETOR ##");
			int[] numerosLidos = new int[4];
			
			int posMaior = 0;
			int posMenor = 0;
			
			for (int i = 0; i < numerosLidos.length; i++) {
				System.out.println("Digite um valor: ");
				numerosLidos[i] = teclado.nextInt();
				
				// 1 itera��o: numerosLidos {} // posMaior = 0 // posMenor = 0 
				// numerosLidos[0] = 1
				// 2 itera��o: numerosLidos {1} // posMaior = 1 // posMenor = 0
				// numerosLidos[1] = 4
				// 3 itera��o: numerosLidos {1, 4} // posMaior = 1 // posMenor = 2
				// numerosLidos[2] = -2
				// 4 itera��o: numerosLidos {1, 4, -2} // posMaior = 1 // posMenor = 2
				// numerosLidos[3] = 2
				
				if (numerosLidos[i] > numerosLidos[posMaior]) {
					posMaior = i;
				}
				
				if (numerosLidos[i] < numerosLidos[posMenor]) {
					posMenor = i;
				}
				
			}
			// {1, 4, -2, 2} // posMaior = 1 // posMenor = 2
			System.out.printf("O menor valor � %d e ele se encontra na posi��o %d\n", 
					numerosLidos[posMenor], posMenor);
			System.out.printf("O maior valor � %d e ele se encontra na posi��o %d", 
					numerosLidos[posMaior], posMaior);
			
			teclado.close();
		}
}
