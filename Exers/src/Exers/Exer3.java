package Exers;

import java.util.Scanner;

/*3. Escreva um algoritmo para ler as dimensões de um retângulo (base e altura),
calcular e escrever a área do retângulo.*/

public class Exer3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada= new Scanner(System.in);
		float base = 0f, altura = 0f;
		
		System.out.println("Insira a dimensão da base: ");
		base = entrada.nextFloat();
		System.out.println("Insira a dimensão da altura: ");
		altura = entrada.nextFloat();
		
		System.out.println("Área do retângulo = " + base * altura);
		entrada.close();
	}

}
