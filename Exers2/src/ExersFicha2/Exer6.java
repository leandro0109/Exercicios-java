package ExersFicha2;

import java.util.Scanner;

public class Exer6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		int num = 0;
		
		System.out.println("Insira um número para calcular a respetiva tabuada: ");
		num = scanner.nextInt();
		
		for(int i = 1; i <= 10; i++)
		{
			System.out.println(num * i);
		}
	}

}
