package br.com.aula02;

import java.util.Scanner;

public class ExercixioSete {
	//7. Fa�a um programa que pe�a um valor e mostre na tela se o valor � 
	//positivo ou negativo.
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("## POSITIVO OU NEGATIVO ##");
		System.out.println("Digite um n�mero: ");
		int numeroLido = teclado.nextInt();
				
		if (numeroLido == 0) {
			System.out.println("O n�mero � nulo (igual a 0)");
		} else if (numeroLido > 0) {
			System.out.println("O n�mero � positivo!");
		} else {
			System.out.println("O n�mero � negativo!");
		}
		teclado.close();

	}

}
