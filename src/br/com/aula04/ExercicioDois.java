package br.com.aula04;

import java.util.Scanner;

public class ExercicioDois {
		// 2. Crie um programa que l� 6 valores inteiros e, em seguida, 
		// mostre na tela os valores lidos.
		
		public static void main(String[] args) {
			
			Scanner teclado = new Scanner(System.in);
			
			System.out.println("## LER 6 VALORES ##");
			int[] valores = new int[6];
			
			for (int i = 0; i < valores.length; i++) {
				System.out.println("Digite um valor:");
				valores[i] = teclado.nextInt();
			}
			
			System.out.println("\nOs valores lidos foram:");
			
			for (int i = 0; i < valores.length; i++) {
				System.out.printf("\nO valor na posi��o %d � %d", i, valores[i]);
			}
						
			teclado.close();
		}
		
}
