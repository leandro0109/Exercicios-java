package exersFicha4;

import java.util.Random;

public class Alinea1 {
	
	public static void preencherMatriz(int matriz[][])
	{
		Random random = new Random();
		for(int i = 0; i < 4; i++)
		{
			for(int j = 0; j < 4; j++)
			{
				matriz[i][j] = random.nextInt(1, 1000);
			}
		}
	}
	
	public static int menorMaiorSoma(int matriz[][])
	{
		int maior = matriz[0][0], menor = matriz[0][0];
		for(int i = 0; i < 4; i++)
		{
			for(int j = 0; j < 4; j++)
			{
				if(matriz[i][j] > maior)
					maior = matriz[i][j];
				
				if(matriz[i][j] < menor)
					menor = matriz[i][j];
			}
		}	
		return maior + menor;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int matriz[][] = new int[4][4];
		preencherMatriz(matriz);
		
		System.out.println("Maior + Menor valor da matriz = " + menorMaiorSoma(matriz));
		
	}

}
