package Exers;

import java.util.Scanner;

/*4. Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e
dias e escreva a idade dessa pessoa expressa apenas em dias. Considerar ano com 365
dias e mês com 30 dias.*/

public class Exer4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		
		int anos = 0, meses = 0, dias = 0, totalDias = 0;
		
		System.out.println("Insira a idade em anos: ");
		anos = entrada.nextInt();
		System.out.println("Insira a idade em meses: ");
		meses = entrada.nextInt();
		System.out.println("Insira a idade em dias: ");
		dias = entrada.nextInt();
		
		totalDias = (anos*365) + (meses*30) + dias;
		
		System.out.println("O utilizador tem " + totalDias + " de idade.");
	}

}
