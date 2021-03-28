package br.com.erickfreire.valorespositivosnegativosezeros;

import java.util.Scanner;

/**
 * Crie um programa em Java que leia 5 valores e determine quantos são positivos, negativos e zeros
 * @author Erick Freire
 * @version 1 - Criado em 28-03-2021 as 18:59
 */

public class ValoresPositivosNegativosEZeros {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numero1;
		int numero2;
		int numero3;
		int numero4;
		int numero5;
		int positivo = 0;
		int negativo = 0;
		int zero = 0;
		
		System.out.print("Digite o primeiro valor: ");
		numero1 = entrada.nextInt();
		
		if(numero1 > 0)
			positivo = positivo + 1;
		if(numero1 < 0)
			negativo = negativo + 1;
		if(numero1 == 0)
			zero = zero + 1;
		
		System.out.print("Digite o segundo valor: ");
		numero2 = entrada.nextInt();
		
		if(numero2 > 0)
			positivo = positivo + 1;
		if(numero2 < 0)
			negativo = negativo + 1;
		if(numero2 == 0)
			zero = zero + 1;
		
		System.out.print("Digite o terceiro valor: ");
		numero3 = entrada.nextInt();
		
		if(numero3 > 0)
			positivo = positivo + 1;
		if(numero3 < 0)
			negativo = negativo + 1;
		if(numero3 == 0)
			zero = zero + 1;
		
		System.out.print("Digite o quarto valor: ");
		numero4 = entrada.nextInt();
		
		if(numero4 > 0)
			positivo = positivo + 1;
		if(numero4 < 0)
			negativo = negativo + 1;
		if(numero4 == 0)
			zero = zero + 1;
		
		System.out.print("Digite o quinto valor: ");
		numero5 = entrada.nextInt();
		
		if(numero5 > 0)
			positivo = positivo + 1;
		if(numero5 < 0)
			negativo = negativo + 1;
		if(numero5 == 0)
			zero = zero + 1;
		
		System.out.printf("A quantidade de números negativos é de: %d%n", negativo);
		System.out.printf("A quantidade de números iguais a zero é: %d%n", zero);
		System.out.printf("A quantidade de números positivos é de: %d%n", positivo);
	}

}
