/*	Crie um programa que leia a distância percorrida por um carro (em km) 
 * 	e o tempo gasto (em horas) e escreva a velocidade média do carro. 

A fórmula de velocidade média é: 
vm = distancia(em metros) / tempo(em segundos)*/
package terceiro;

import java.util.Scanner;

public class VelocidadeCarro {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double distanciaKm, tempoHora, vm, distancaiMetro, tempoSegundo;
		
		System.out.println("Digite a distancia em Km: ");
		distanciaKm = scan.nextDouble();
		
		System.out.println("Digite o tempo gasto: ");
		tempoHora = scan.nextDouble();
		
		distancaiMetro = distanciaKm * 1000;
		
		tempoSegundo = tempoHora * 3600;
		
		vm = distancaiMetro / tempoSegundo;
		
		System.out.printf("Velocidade media ", vm);
	}
}
