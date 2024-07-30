/*Crie um programa que leia o preço à vista de um produto e o número de parcelas e escreva  
 * o valor de cada parcela (considerando juros simples de 2% ao mês). */
package decimo;

import java.util.Scanner;

public class PrecoVistaProduto {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		double precoVistaProduto, valorParcelas, prazo, juros = 0.02;

		System.out.println("Digite o valor do produto: ");
		precoVistaProduto = scan.nextDouble();

		System.out.println("Digite o número de parcelas: ");
		int numParcela = scan.nextInt();

		prazo = precoVistaProduto * (1 + juros * numParcela);
		valorParcelas = prazo / numParcela;

		System.out.println("Valor de cada parcela é: " + valorParcelas);
	}
}
