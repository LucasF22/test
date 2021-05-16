package br.com.aula02;

import java.util.Scanner;

public class ExercicioQuatro {
	//4. Receba a altura do degrau de uma escada e a altura que o 
	//usu�rio deseja alcan�ar subindo a escada. Calcule e mostre quantos degraus
	//o usu�rio dever� subir para atingir seu objetivo.
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("## altura para alcan�a ##");
		System.out.println("Digite a altura do degrau cm: ");
		float alturaDegrau = teclado.nextFloat();
		
		System.out.println("Altura da Escada em m: ");
		float alturaEscada = teclado.nextFloat();
		
		float qtdDegraus = (alturaEscada * 100) / alturaDegrau;
		
		System.out.printf("A quantidade de degraus dessa escada � %.0f", qtdDegraus);
		teclado.close();
		
	}
}
