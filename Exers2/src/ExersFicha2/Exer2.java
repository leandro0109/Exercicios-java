package ExersFicha2;

import java.util.Scanner;

public class Exer2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		String nome;
		float media = 0f;
		int aulas = 0, faltas = 0;
		
		System.out.println("Insira o seu nome:	");
		nome = scanner.nextLine();
		System.out.println("Insira a sua média:	");
		media = scanner.nextFloat();
		System.out.println("Insira o total de aulas:	");
		aulas = scanner.nextInt();
		System.out.println("Insira a quantidade de faltas:	");
		faltas = scanner.nextInt();
		
		if(faltas <= aulas * 25 / 100 && media >= 9.5)
			System.out.println("Aluno '" + nome + "' aprovado!");
		else
			System.out.println("Aluno '" + nome + "' reprovado...");
	}

}
