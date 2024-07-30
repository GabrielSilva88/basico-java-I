/*	Crie um programa que leia o valor de um empréstimo,
 * 	a taxa de juros mensal e o número de meses e escreva o valor da parcela mensal do empréstimo.*/
package quinto;

import java.util.Scanner;

public class ParcelaMensalEmprestimos {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double valorEmprestimo, taxaJuros, valorTotal, valorParcela;
		
		System.out.println("Digite o valor do empréstimo: ");
		valorEmprestimo = scan.nextDouble();
		
		System.out.println("Digite a taxa de juros mensal: ");
		taxaJuros = scan.nextDouble();
		
		System.out.println("Digite o número de meses: ");
		int qtdMes = scan.nextInt();
		
		valorTotal = valorEmprestimo * (taxaJuros/ 100) * qtdMes;
		
		valorParcela = valorTotal / qtdMes;
		
		System.out.printf("Valor da parcela mensal do empréstimo: %.2f", valorParcela);
	}
}
