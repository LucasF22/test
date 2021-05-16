package br.com.aula02;

import java.util.Scanner;

public class ExercicioDoze {
		// 12. Fa�a um programa que pergunte o pre�o de tr�s produtos e informe qual produto 
		//voc� deve comprar, sabendo que a decis�o � sempre pelo mais barato.
		
		public static void main(String[] args) {
			
			Scanner teclado = new Scanner(System.in);
			
			System.out.println("## MENOR VALOR DE PRODUTO ##");
			
			System.out.println("Digite o primeiro valor: ");
			float primeiroProduto = teclado.nextFloat();
			
			System.out.println("Digite o segundo valor: ");
			float segundoProduto = teclado.nextFloat();
			
			System.out.println("Digite o terceiro valor: ");
			float terceiroProduto = teclado.nextFloat();
			
			
			if (primeiroProduto == segundoProduto 
					&& segundoProduto == terceiroProduto) {
				System.out.println("Tanto faz, todos os produtos tem o mesmo pre�o.");
			
			} else if (primeiroProduto < segundoProduto 
					&& primeiroProduto < terceiroProduto) {
				System.out.println("Compre o primeiro produto.");
			
			} else if (segundoProduto < primeiroProduto 
					&& segundoProduto < terceiroProduto) {
				System.out.println("Compre o segundo produto.");
			
			} else {
				System.out.println("Compre o terceiro produto.");
			}
			
			//OU
//			float absProduto =(primeiroProduto + segundoProduto + Math.absExact(primeiroProduto - segundoProduto)) / 2;
//			float menorValor = (absProduto + terceiroProduto + Math.absExact(absProduto - terceiroProduto)) / 2; 
//			
//			if(primeiroProduto  == menorValor) {
//				System.out.println("Compre o primeiro produto.");
//			}else if (segundoProduto == menorValor) {
//				System.out.println("Compre o segundo produto.");
//			}else {
//				System.out.println("Compre o terceiro produto.");
//			}
			teclado.close();
		}
}
