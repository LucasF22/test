package br.com.aula01;

import java.util.Scanner;

public class ExercicioDois {
	//2. Fa�a um programa que leia um n�mero real e o imprima.
	public static void main(String[] args) {
		 System.out.println("Ol� querido usu�rio, digite um n�mero:");
		 Scanner teclado = new Scanner(System.in);
		 float realLido = teclado.nextFloat();
		 
		 System.out.printf("\nO n�mero lido foi: %.2f", realLido);
		 teclado.close();
	}
	

}
