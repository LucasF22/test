package br.com.aula01;

import java.util.Scanner;

public class ExercicioSeis {
	//6. Leia o tamanho do lado de um quadrado e imprima como resultado a sua �rea.
	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	
	System.out.println("Digite primeiro valor: ");
	float Lado = teclado.nextFloat();
		
	float area = Lado * Lado;
	System.out.printf("A �rea do quadrado �: %.2f", area);
	teclado.close();
	}
		
}
