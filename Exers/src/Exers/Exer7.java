package Exers;

import java.util.Scanner;

/*7. Faça um algoritmo que leia três notas de um aluno, calcule e escreva a média
final deste aluno. Considere que a média é ponderada e que o peso das notas é
2, 3 e 5.*/

public class Exer7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		float nota1 = 0f, nota2 = 0f, nota3 = 0f, media = 0f;
		
		System.out.println("Nota 1: ");
		nota1 = scanner.nextFloat();
		System.out.println("Nota 2: ");
		nota2 = scanner.nextFloat();
		System.out.println("Nota 3: ");
		nota3 = scanner.nextFloat();
		
		media = ((nota1*2) + (nota2*3) + (nota3*5)) / 10;
		
		System.out.println("Média das notas do aluno = " + media);
	}

}
