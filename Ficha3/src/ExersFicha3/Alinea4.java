package ExersFicha3;

import java.util.Scanner;
import Utilitarios.*;

public class Alinea4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		double a = 0, b = 0, c = 0, res = 0;
		
		System.out.println("Insira o valor de a: ");
		a = scanner.nextDouble();
		System.out.println("Insira o valor de b: ");
		b = scanner.nextDouble();
		System.out.println("Insira o valor de c: ");
		c = scanner.nextDouble();
		
		calculos.calcularRaizes(a, b, c);
		
		char escolha;
		double temp = 0;
		
		System.out.println("Converter para F ou C? ");
		escolha = scanner.next().charAt(0);
		System.out.println("Insira a temperatura: ");
		temp = scanner.nextDouble();
		
		switch(escolha)
		{
		case 'F':
			graus.converterF(temp);
			break;
		case 'C':
			graus.converterC(temp);
			break;
		default:
			System.out.println("Erro na conversão...");
			break;
		}
	}

}
