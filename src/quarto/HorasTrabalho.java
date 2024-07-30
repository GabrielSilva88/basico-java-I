/* Crie um programa que leia o número de horas trabalhadas por um funcionário e
 *  o valor da hora de trabalho e escreva o salário bruto desse funcionário.*/
package quarto;

import java.util.Scanner;

public class HorasTrabalho {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
				
		double valorHora, salarioBruto;
		
		System.out.println("Digite o número de horas: ");
		int horaTrabalhada = scan.nextInt();
		
		System.out.println("Digite o valor da horas: ");
		valorHora = scan.nextDouble();
		
		salarioBruto = horaTrabalhada * valorHora;
		
		System.out.printf("O valor do salario é %.2f ", salarioBruto);
		
	}
}
