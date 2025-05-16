package Exers;

import java.util.Random;

public class Alinea2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random rand = new Random();
		
		int[][] matriz = new int[5][5];
		int somaMatriz = 0, mediaMatriz = 0, somaL3 = 0, somaCol4 = 0, somaDiagonalP = 0, menorDiagonalP = 0, indiceMenor = 0, somaDiagonalSec = 0;
		int[] maiorElem = new int[5];
		int[] mediaCol = new int[5];
		int col = 4;
		
		for(int i = 0; i < 5; i++)
		{
			for(int j = 0; j < 5; j++)
			{
				matriz[i][j] = rand.nextInt(1, 100);
			}
		}
		
		menorDiagonalP = matriz[0][0];
		
		for(int i = 0; i < 5; i++)
		{
			for(int j = 0; j < 5; j++)
			{
				somaMatriz += matriz[i][j];
				if(matriz[j][i] > maiorElem[j])
					maiorElem[j] = matriz[j][i];
				
				mediaCol[i] += matriz[i][j];	
				System.out.print(" " + matriz[i][j]);
			}
			System.out.println();
			mediaCol[i] /= 5;
			somaL3 += matriz[i][3];
			somaCol4 += matriz[4][i];
			somaDiagonalP += matriz[i][i];
			if(matriz[i][i] < menorDiagonalP)
			{
				menorDiagonalP = matriz[i][i];
				indiceMenor = i;
			}
			somaDiagonalSec += matriz[i][col];
			col--;
		}
		
		mediaMatriz = somaMatriz / (5 * 5);
		
		System.out.println("Soma elementos da matriz -> " + somaMatriz);
		System.out.println("Media elementos matriz -> " + mediaMatriz);
		for(int i = 0; i < 5; i++)
		{
			System.out.println("Maior elemento linha" + i + " -> " + maiorElem[i]);
			System.out.println("Media da coluna" + i + " -> " + mediaCol[i]);
		}
		System.out.println("Soma elementos da linha 3 -> " + somaL3);
		System.out.println("Soma elementos da coluna 4 -> " + somaCol4);
		System.out.println("Soma elementos diagonal principal -> " + somaDiagonalP);
		System.out.println("Menor elemento da diagonal principal -> " + menorDiagonalP + " Posição [" + indiceMenor + "][" + indiceMenor + "]");
		System.out.println("Soma elementos diagonal secundária -> " + somaDiagonalSec);
	}

}
