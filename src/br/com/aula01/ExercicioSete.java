package br.com.aula01;

import java.util.Scanner;

public class ExercicioSete {
	//7. Leia um n�mero inteiro e imprima o seu antecessor e o seu sucessor.

	public static void main(String[] args) {
	Scanner teclado = new Scanner (System.in);
	
	System.out.println("Digite um valor: ");
	int numero = teclado.nextInt();
	
	int antecessor = numero - 1;
	int sucessor = numero + 1;
	
	System.out.printf("O seu antecessor de %d � %d e o sucessor � %d.", numero, antecessor, sucessor);
	teclado.close();
	}

}
