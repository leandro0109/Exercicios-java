package Exers;

/*1. Escreva um algoritmo que armazene o valor 10 numa variável A e o valor 20 
numa variável B. A seguir (utilizando apenas atribuições entre variáveis) troque os 
seus conteúdos fazendo com que o valor que está em A passe para B e vice-versa. No 
final, escrever os valores que ficaram armazenados nas variáveis.*/

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 10, b = 20, aux = 0;
		
		System.out.println("\n\tvalor de 'a' antes da troca:\t" + a + "\n\tValor de 'b' antes da troca:\t" + b);
		
		aux = a;
		a = b;
		b = aux;
		
		System.out.println("\n\tvalor de 'a' após a troca:\t" + a + "\n\tValor de b após a troca:\t" + b);
		
	}

}
