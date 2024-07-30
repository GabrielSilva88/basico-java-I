/*	Crie um programa que leia a quantidade de litros de água consumidos por uma residência em um mês 
  	e escreva o valor da conta de água (considerando que cada litro de água custa R$0,02).*/
package sexto;

import java.util.Scanner;

public class LitrosDeAgua {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double conta, aguaCusta = 0.02;
		
		System.out.println("Digite os litros de água consumida: ");
		int litros = scan.nextInt();
		
		conta = aguaCusta * litros;
		
		System.out.printf("Valor de Conta de Água: %.2f", conta);
	}
}
