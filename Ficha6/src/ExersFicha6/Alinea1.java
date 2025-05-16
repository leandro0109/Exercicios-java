package ExersFicha6;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Alinea1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		Queue<String> fila = new LinkedList<>();
		int op;
		String nome = "", id = "";
		
		do
		{
			System.out.println("Menu Opções");
			System.out.println("1 - Nº Aviões na fila");
			System.out.println("2 - Descolagem do primeiro avião da fila");
			System.out.println("3 - Adicionar avião");
			System.out.println("4 - Listar todos os aviões");
			System.out.println("5 - Mostrar primeiro avião");
			System.out.println("Insira uma opção: ");
			op = scanner.nextInt();
			scanner.nextLine();
			
			switch(op)
			{
			case 1:
				System.out.println("Quantidade de aviões na fila: " + fila.size());
				break;
			case 2:
				if(!fila.isEmpty())
					System.out.println("Avião a descolar: " + fila.poll());
				else
					System.out.println("Nenhum avião a descolar.");
				break;
			case 3:
				int pos = fila.size() + 1;
				id = Integer.toString(pos);
				System.out.println("ID do avião: " + id);
				System.out.println("Nome do avião:\t");
				nome = scanner.nextLine();
				
				fila.add("ID: " + id + " NOME: " + nome);
				break;
			case 4:
				if(fila.isEmpty())
					System.out.println("Fila vazia");
				else
					for(String aviao : fila)
					{
						System.out.println(aviao);
					}
				break;
			case 5: 
				if(fila.isEmpty())
					System.out.println("Fila vazia");
				else
				{
				System.out.println("Caracteristicas 1º avião da fila");
				System.out.println(fila.peek());
				}
				break;
			case 0:
				System.out.println("A terminar o programa...");
				break;
			default:
				System.out.println("Opção inserida inválida...");
				break;
			}
		}while(op != 0);
	}

}
