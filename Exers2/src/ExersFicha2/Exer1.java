package ExersFicha2;

import java.util.Scanner;

public class Exer1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		int num;
		
		System.out.println("Insira um número para determinar se é par ou ímpar:	");
		num = scanner.nextInt();
		
		if(num % 2 == 0)
			System.out.println("O número '" + num + "' é par.");
		else
			System.out.println("O número '" + num + "' é ímpar.");
	}

}
