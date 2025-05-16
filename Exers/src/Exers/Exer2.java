package Exers;

import java.util.Scanner;

/*2. Escreva um algoritmo para ler um valor (do teclado) e escrever (no écran) o seu
antecessor.*/

public class Exer2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um numero inteiro: ");
		
		int a = entrada.nextInt();
		int antecessor = a - 1;
		
		System.out.println("Antecessor de " + a + " é " + antecessor);
	}

}
