/* Crie um programa que leia o nome do usuário e escreva uma saudação personalizada: 
"Olá, [nome do usuário]! Bem-vindo ao nosso programa!".*/

package primeiro; 

import java.util.Scanner;

public class DigitarNome {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Informe o seu Nome: ");
		String nome = scan.nextLine();

		System.out.println("Olá, " + nome + "!, Bem-vindo ao nosso programa!");
	}

}
