package ExersFicha3;

import java.util.Scanner;

public class Alineas123 {
	
	public static boolean ePositivo(int num)
	{
		if(num >= 0)
			return true;
		else 
			return false;
	}
	
	public static void eNulo(Integer num)
	{
		if(num == null)
			System.out.println("Valor é nulo.");
		else
			System.out.println("Valor é válido.");
	}
	
	public static double maiorNum(double n1, double n2, double n3)
	{
		return Math.max(n1, Math.max(n2, n3));
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int valor = 0;
		boolean teste = true;
		
		System.out.println("Introduza o número: ");
		valor = scanner.nextInt();
		
		teste = ePositivo(valor);
		if(teste == true)
			System.out.println("O valor inserido é positivo");
		else
			System.out.println("O valor inserido é negativo");
		
		Integer num = null;
		eNulo(num);
			
		num = 5;
		eNulo(num);
		
		double n1 = 0, n2 = 0, n3 = 0;
		
		System.out.println("Insira o 1º valor: ");
		n1 = scanner.nextDouble();
		System.out.println("Insira o 2º valor: ");
		n2 = scanner.nextDouble();
		System.out.println("Insira o 3º valor: ");
		n3 = scanner.nextDouble();
		
		System.out.println("Maior valor dos 3 -> " + maiorNum(n1, n2, n3));
		
		scanner.close();
	}

}
