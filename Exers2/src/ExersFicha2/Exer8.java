package ExersFicha2;

import java.util.Scanner;

public class Exer8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		int num = 0;
		long factorial = 1;
		
		System.out.println("Insira um número: ");
		num = scanner.nextInt();
		
		for(int i = num; i > 0; i--)
		{
			factorial *= i;
		}
		System.out.println(factorial);
		scanner.close();
	}

}
