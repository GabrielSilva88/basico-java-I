/* Crie um programa que leia o peso de uma encomenda (em kg) 
 * e escreva  o valor do frete (considerando que cada kg custa R$5,00).*/
package setimo;

import java.util.Scanner;

public class FreteProduto {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double valorFrete, pesoEncomenda, custaKg = 5.00;
		
		System.out.println("Informe o peso da encomenda: ");
		pesoEncomenda = scan.nextDouble();
		
		valorFrete = pesoEncomenda * custaKg;
		
		System.out.printf("Valor do frete: %.2f", valorFrete);
	}
}
