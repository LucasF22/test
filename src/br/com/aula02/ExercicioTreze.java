package br.com.aula02;

import java.util.Scanner;

public class ExercicioTreze {
		// 13. Fa�a um programa para a leitura de duas notas parciais de um aluno. O programa deve 
		// calcular a m�dia alcan�ada por aluno e apresentar: 
		// A mensagem "Aprovado", se a m�dia alcan�ada for maior ou igual a sete;
		// A mensagem "Reprovado", se a m�dia for menor do que sete;
		// A mensagem "Aprovado com Distin��o", se a m�dia for igual a dez.
		
		public static void main(String[] args) {
			
			Scanner teclado = new Scanner(System.in);
			System.out.println("## APROVA��O ESCOLAR COM OP��O DE DISTIN��O##");
			
			System.out.println("Digite a primeira nota: ");
			float primeiraNota = teclado.nextFloat();
			
			System.out.println("Digite a segunda nota: ");
			float segundaNota = teclado.nextFloat();
			
			float media = (primeiraNota + segundaNota) / 2F;
			
			if (media < 7) { 
				System.out.println("Reprovado");
			} else if (media < 10) {
				System.out.println("Aprovado");
			} else {
				System.out.println("Aprovado com distin��o");
			}
			
			teclado.close();
		}
}
