package br.com.aula02;

import java.util.Scanner;

public class ExercicioOito {
	//8. Escreva um programa que, dados dois n�meros inteiros, mostre na tela o 
	//maior deles, assim como a diferen�a existente entre ambos.
	public static void main(String[] args) {
		Scanner  teclado = new Scanner(System.in);
		System.out.println("## Diferen�a dos n�meros ##");
		System.out.println("Digite o primeiro n�mero: ");
		int primeiroNumero = teclado.nextInt();
		
		System.out.println("Digite o segundo n�mero: ");
		int segundoNumero = teclado.nextInt();
		
		if (primeiroNumero == segundoNumero) {
			System.out.print("Os n�meros digitados s�o iguais");
		}else if (primeiroNumero > segundoNumero) {
			int diferenca = primeiroNumero - segundoNumero;
			System.out.printf("O primeiro n�mero � maior que o segundo \n "
					+ "E a diferan�a entre eles � de %d", diferenca);
		}else {
			int diferenca = segundoNumero - primeiroNumero;
			System.out.printf("O sugundo n�mero � maior que o primeiro \n "
					+ "E a diferan�a entre eles � de %d", diferenca);
		}
		teclado.close();
	}

}
