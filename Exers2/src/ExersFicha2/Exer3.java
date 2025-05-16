package ExersFicha2;

import java.util.Scanner;

public class Exer3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		float n1 = 0f, n2 = 0f;
		char oper;
		
		System.out.println("Insira o primeiro digito: ");
		n1 = scanner.nextFloat();
		System.out.println("Insira o segundo digito: ");
		n2 = scanner.nextFloat();
		
		do
		{
			System.out.println("Insira o tipo de operação (+ - * /): ");
			oper = scanner.next().charAt(0);
		} while(oper != '+' && oper != '-' && oper != '*' && oper != '/');
		
		switch(oper)
		{
			case '+': System.out.println("Soma dos digitos inseridos: " + (n1 + n2)); break;	
			case '-': System.out.println("Subtração dos digitos inseridos: " + (n1 - n2)); break;	
			case '*': System.out.println("Multiplicação dos digitos inseridos: " + (n1 * n2)); break;	
			case '/': 
				if(n2 != 0)
					System.out.println("Divisão dos digitos inseridos: " + (n1 / n2));
				else	
					System.out.println("Não é possivel dividir por 0.");
				break;	
		}
	}

}
