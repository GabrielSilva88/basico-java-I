
/* Crie um programa que leia o preço de dois produtos e escreva o valor total da compra. 
 * Lembre-se que valores são números fracionados, ou seja, declare-os com o tipo double.*/

package segundo;

import java.util.Scanner;

public class DoisProdutos {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("produtor 1, Digite o valor: ");
		double produtUm = scan.nextDouble();
		
		System.out.println("produto 2, Digite o valor: ");
		double produtDois = scan.nextDouble();
		
		double soma = produtUm + produtDois;
		
		System.out.printf("Valor dos produtos somados são: %.2f", soma);
		
	}
}
