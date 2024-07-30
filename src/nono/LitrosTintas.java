/*	Crie um programa que leia a altura e largura de uma parede (em metros) e 
	escreva a área da parede e a quantidade de tinta necessária para pintá-la 
	(considerando que cada litro de tinta pinta 2m²).

Fórmula para cálculo de área: 
area = altura * largura;*/
package nono;

import java.util.Scanner;

public class LitrosTintas {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		double altura, largura, area, tinta;
		
		System.out.println("Calculadora de quantidade de Tinta pintar parede");
		System.out.println("Digite a altura: ");
		altura = scan.nextDouble();

		System.out.println("Digite a largura: ");
		largura = scan.nextDouble();

		area = altura * largura;
		tinta = area / 2;

		System.out.printf("Quantidade de tinta para pintar parede é %.2fL, para uma parede de %.2f m²",
				tinta, area);
	}
}
