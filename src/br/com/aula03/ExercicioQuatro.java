package br.com.aula03;

public class ExercicioQuatro {
		// 4. Fa�a um programa que calcule e mostre a soma dos 
		// 50 primeiros n�meros �mpares.
		public static void main(String[] args) {
	
			System.out.println("## SOMA 50 PRIMEIROS IMPARES ##\n");
			
			int soma = 0;
			int contador = 0;
			int numero = 1;
			while (contador < 50) {
				
				if (numero % 2 != 0) {
					soma += numero;
					contador++;
				}
				
				numero++;
			}
			
			System.out.printf("\nA soma dos 50 primeiros n�meros �mpares � %d", soma);
			
		}
}
