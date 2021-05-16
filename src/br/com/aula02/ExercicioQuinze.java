package br.com.aula02;

import java.util.Scanner;

public class ExercicioQuinze {
	// 15. Fa�a um programa que mostre ao usu�rio um menu com 4 op��es de opera��es
		// matem�ticas (as b�sicas, por exemplo). O usu�rio escolhe uma das op��es e o 
		// seu programa ent�o pede dois valores num�ricos e realiza a opera��o, 
		// mostrando o resultado e saindo.
		
		public static void main(String[] args) {
			
			Scanner teclado = new Scanner(System.in);
			System.out.println("## CALCULADORA ##");
			System.out.println(" ** Digite 1 para soma");
			System.out.println(" ** Digite 2 para subtra��o");
			System.out.println(" ** Digite 3 para multiplica��o");
			System.out.println(" ** Digite 4 para divis�o");
			int opcao = teclado.nextInt();
			
			switch (opcao) {
				case 1:
					System.out.println("Digite o primeiro valor: ");
					float primeiroValor = teclado.nextFloat();
					System.out.println("Digite o segundo valor: ");
					float segundoValor = teclado.nextFloat();
					float soma = primeiroValor + segundoValor;
					System.out.printf("O resulatado da soma �: %.2f", soma);
					break;
				
				case 2:
					System.out.println("Digite o primeiro valor: ");
					float primeiroValorSubtracao = teclado.nextFloat();
					System.out.println("Digite o segundo valor: ");
					float segundoValorSubtracao = teclado.nextFloat();
					float subtracao = primeiroValorSubtracao - segundoValorSubtracao;
					System.out.printf("O resulatado da subtra��o �: %.2f", subtracao);
					break;
				
				case 3:
					System.out.println("Digite o primeiro valor: ");
					float primeiroValorMult = teclado.nextFloat();
					System.out.println("Digite o segundo valor: ");
					float segundoValorMult = teclado.nextFloat();
					float multiplicacao = primeiroValorMult * segundoValorMult;
					System.out.printf("A diferenca dos valores �: %.2f", multiplicacao);
					break;
				
				case 4:
					System.out.println("Digite o primeiro valor: ");
					float primeiroValorDiv = teclado.nextFloat();
					System.out.println("Digite o segundo valor: ");
					float segundoValorDiv = teclado.nextFloat();
					float divisao = primeiroValorDiv / segundoValorDiv;
					System.out.printf("A diferenca dos valores �: %.2f", divisao);
					break;
				
				default:
					System.out.println("Op��o inv�lida.");
			
			}
			
			teclado.close();
		}
}
