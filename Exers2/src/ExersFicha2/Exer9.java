package ExersFicha2;

import java.util.Scanner;

public class Exer9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		float num = 0f;
		int dentro = 0, fora = 0;
		
		for(int i = 0; i < 10; i++)
		{
			System.out.println("Insira o número: ");
			num = scanner.nextFloat();
			if(num > 10 && num < 20)
				dentro++;
			else
				fora++;
		}
		
		System.out.println("Quantidade de números dentro do intervalo: " + dentro);
		System.out.println("Quantidade de números fora do intervalo: " + fora);
	}

}
