package br.com.aula04;

public class ExercicioUm {
		//1. Fa�a um programa que possua um vetor denominado A que armazene 6 n�meros inteiros. 
		// O programa deve executar os seguintes passos:
		//	Atribua os seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7.
		//	Armazene em uma vari�vel inteira (simples) a soma entre os valores das posi��es A[0], A[1] 
		//  e A[5] do vetor e mostre na tela esta soma.
		//	Modifique o vetor na posi��o 4, atribuindo a esta posi��o o valor 100.
		//	Mostre na tela cada valor do vetor A, um em cada linha.

		
		public static void main(String[] args) {
			
			int[] A = {1, 0, 5, -2, -5, 7};
						
			int posicao = 0;
			int soma = A[posicao] + A[1] + A[5];
			System.out.printf("A soma das posi��es 0, 1 e 5 �: %d\n", soma);
			
			A[4] = 100;
			
			System.out.println("Esta � a impress�o com o for normal");
			for (int i = 0; i < A.length; i++) {
				System.out.println(A[i]);
			}
			
			System.out.println("Esta � a impress�o com o foreach");
			for (int valor : A) {
				System.out.println(valor);
			}
			
			
		}
}
