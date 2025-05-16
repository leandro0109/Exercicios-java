package Exers;

import java.util.Scanner;

/*5. Escreva um algoritmo para ler o número total de eleitores de um município, o
número de votos brancos, nulos e válidos. Calcular e escrever a percentagem que
cada um representa em relação ao total de eleitores.*/

public class Exer5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		
		int eleitores = 0, votosBrancos = 0, votosNulos = 0, votosValidos = 0;
		
		System.out.println("Insira a quantidade de eleitores do municipio: ");
		eleitores = entrada.nextInt();
		System.out.println("Insira o número de votos brancos: ");
		votosBrancos = entrada.nextInt();
		System.out.println("Insira o número de votos nulos: ");
		votosNulos = entrada.nextInt();
		System.out.println("Insira o número de votos válidos: ");
		votosValidos = entrada.nextInt();
		
		  double percBrancos = (votosBrancos * 100.0) / eleitores;
          double percNulos = (votosNulos * 100.0) / eleitores;
          double percValidos = (votosValidos * 100.0) / eleitores;
		
		System.out.println("Percentagem de votos brancos: " + percBrancos + "%");
		System.out.println("Percentagem de votos nulos: " + percNulos + "%");
		System.out.println("Percentagem de votos válidos: " + percValidos + "%");
	}

}
