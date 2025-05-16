package Exers;

import java.util.Random;

public class Alinea1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random rand = new Random();
		
		int a = rand.nextInt(1, 100);
		int igualA = 0, igualDiagonal = 0, primeiraCol = 0, maiorA = 0, somaMaioresA = 0;
		
		int[][] matriz = new int[30][30];
		
		for(int i = 0; i < 30; i++)
		{
			for(int j = 0; j < 30; j++)
			{
				matriz[i][j] = rand.nextInt(1, 500);
			}
		}
		
		for(int i = 0; i < 30; i++)
		{
			for(int j = 0; j < 30; j++)
			{
				if(matriz[i][j] == a)
					igualA++;
				else if(matriz[i][j] > a)
				{
					maiorA++;
					somaMaioresA += matriz[i][j];
				}
				
				if(matriz[0][j] == a)
					primeiraCol++;
			}
			if(matriz[i][i] == a)
				igualDiagonal++;
		}
		
		System.out.println("Valores iguais a A -> " + igualA);
		System.out.println("Valores iguais a A na diagonal principal da matriz -> " + igualDiagonal);
		System.out.println("Valores iguais a A na primeira coluna -> " + primeiraCol);
		System.out.println("Valores maiores do que A -> " + maiorA);
		System.out.println("Soma dos valores maiores do que A -> " + igualA);
		
	}

}
