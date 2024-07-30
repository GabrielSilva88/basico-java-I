/*Crie um programa que leia a cotação do dólar e um valor em reais e escreva o valor convertido em dólares.
 * */

package oitavo;

import java.util.Scanner;

public class CotacaoDolar {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a cotação do dolar: ");
		double cotacao = scan.nextDouble();
		
		System.out.println("Digite o valor em real R$: ");
		double valor = scan.nextDouble();
		
		double converter = cotacao / valor;
		
		System.out.printf("Valor de R$ %.2f, convertido em dolares US$: %.2f", valor, converter);
	}
}
