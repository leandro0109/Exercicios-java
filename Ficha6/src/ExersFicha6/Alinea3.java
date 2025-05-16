package ExersFicha6;

import java.util.Scanner;
import java.util.Stack;

public class Alinea3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		Stack<Character> pilha = new Stack<>();
		String dados = "";
		
		System.out.println("Introduza os caracteres: ");
		dados = scanner.nextLine();
		
		System.out.println();
		
		for(int i = 0; i < dados.length(); i++)
		{
			pilha.push(dados.charAt(i));
		}
		
		System.out.println("Caracteres Invertidos: ");
		
		while(!pilha.isEmpty())
		{
			System.out.println(pilha.pop());
		}	
		
	}

}
