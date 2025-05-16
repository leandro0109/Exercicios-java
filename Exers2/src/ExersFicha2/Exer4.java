package ExersFicha2;

import java.util.Scanner;

public class Exer4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		float salario = 0f, novoSalario = 0f;
		
		System.out.println("Insira o valor do salario: ");
		salario = scanner.nextFloat();
		novoSalario = salario;
		
		if(salario < 700)
			novoSalario += salario * 10 / 100;
		else if(salario > 1500)
			novoSalario += salario * 5 / 100;
		else
			novoSalario += salario * 7.5 / 100;
		
		System.out.println("Salário antes do reajuste: " + salario);
		System.out.println("Novo salario ajustado: " + novoSalario);
	}

}
