package br.com.aula01;

import java.util.Scanner;

public class ExercicioCinco {

	public static void main(String[] args) {
		//5. Leia um numero real e imprima a quinta parte deste n�mero.
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Digite um n�mero real: ");
		float valorLido = teclado.nextFloat();
		
		float quintaParte = valorLido / 5F;
		System.out.printf("O a quinta parte �: %.2f", quintaParte);
		teclado.close();
				
	}

}
