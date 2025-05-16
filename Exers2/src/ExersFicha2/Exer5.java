package ExersFicha2;

import java.util.Scanner;

public class Exer5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		int n = 0;
		
		do
		{
			System.out.println("Insira um valor (1 a 10): ");
			n = scanner.nextInt();	
		}while(n < 1 || n > 10);
		
		for(int i = 0; i < n; i++)
		{
			System.out.println(i+1);
		}
	}

}
