package br.com.aula02;

import java.util.Scanner;

public class ExercicioOnze {
	//11. Fa�a um Programa que leia tr�s n�meros e mostre o maior deles.
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("## N�mero maior ##");
		
		System.out.println("Digite o primeiro n�mero:");
		int primeiroNumero = teclado.nextInt();
		
		System.out.println("Digite o segundo n�mero:");
		int segundoNumero = teclado.nextInt();
		
		System.out.println("Digite o terceiro n�mero:");
		int terceiroNumero = teclado.nextInt();
		
		int absNumero =(primeiroNumero + segundoNumero + Math.absExact(primeiroNumero - segundoNumero)) / 2;
		int maior = (absNumero + terceiroNumero + Math.absExact(absNumero - terceiroNumero)) / 2; 
		
		if(primeiroNumero == maior) {
			System.out.println("O primeiro n�mero � o maior digitado.");
		}else if (segundoNumero == maior) {
			System.out.println("O segundo n�mero � o maior digitado.");
		}else {
			System.out.println("O terceiro n�mero � o maior digitado.");
		}
		//Ou
		
//		boolean numerosIguais = primeiroNumero == segundoNumero 
//				&& segundoNumero == terceiroNumero;
//		boolean primeiroNumeroMaior = primeiroNumero > segundoNumero 
//				&& primeiroNumero > terceiroNumero;
//		boolean segundoNumeroMaior = segundoNumero > primeiroNumero 
//				&& segundoNumero > terceiroNumero;
//
//		if (numerosIguais) {
//		System.out.println("Os numeros s�o iguais.");
//		} else if (primeiroNumeroMaior) {
//		System.out.println("O primeiro n�mero � o maior digitado.");
//		} else if (segundoNumeroMaior) {
//		System.out.println("O segundo n�mero � o maior digitado.");
//		} else {
//		System.out.println("O terceiro n�mero � o maior digitado.");
//		}
		teclado.close();
	}

}
