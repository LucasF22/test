package br.com.aula02;

import java.util.Scanner;

public class ExercicioUm {
	//1. Leia um valor de comprimento em polegadas e 
	//apresente-o convertido em cent�metros.
	
	//POL * 2,54 
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("## Converta polegada para centimetro ##");
		System.out.println("Digite o valor em polegadas:");
		float valorPolegadas = teclado.nextFloat();
		
		
		float valorCentimetros = valorPolegadas * 2.54F;
		
		System.out.printf("O valor %.2f polegadas equivale � %.2f cent�metros", valorPolegadas, 
				valorCentimetros);
		
		teclado.close();

	}

}
