package br.com.aula03;

import java.util.Scanner;

public class ExercicioOito {
		// 8. Fa�a um programa que pe�a um n�mero inteiro e determine se ele � ou n�o um n�mero primo. 
		// Um n�mero primo � aquele que � divis�vel somente por ele mesmo e por 1.
		public static void main(String[] args) {
			
			Scanner teclado = new Scanner(System.in);
			
			System.out.println("## N�MEROS PRIMOS ##");
			
			System.out.println("Digite um n�mero inteiro e "
					+ "direi se ele � ou n�o primo.");
			int numero = teclado.nextInt();
			
			int contador = 0;
			for (int i = numero - 1; i > 1; i--) {
				if (numero % i == 0) {
					contador++;
					break;
				}
				
			}
			
			if (contador == 1) {
				System.out.println("N�o � primo!");
			} else {
				System.out.println("� primo!");
			}
			
			teclado.close();
		}
}
