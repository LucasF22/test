package br.com.aula02;

import java.util.Scanner;

public class ExercicioSeis {
	//6. Fa�a um programa que receba dois n�meros e mostre qual deles � o maior
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("## Comparador de N�meros ##");
		System.out.println("Digite o primeiro n�mero: ");
		int primeiroNumero = teclado.nextInt();
		
		System.out.println("Digite o segundo numero: ");
		int segundoNumero = teclado.nextInt();
		
		if (primeiroNumero == segundoNumero) {
			System.out.print("Os n�meros digitados s�o iguais");
		}else if (primeiroNumero > segundoNumero) {
			System.out.printf("O primeiro n�mero � maior que o segundo");
		}else {
			System.out.printf("O segundo n�mero � maior que o primeiro");
		}
		teclado.close();
		}
		
		
	}

