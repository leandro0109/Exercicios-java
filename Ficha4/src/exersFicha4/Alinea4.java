package exersFicha4;

import java.util.Random;

public class Alinea4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random rand = new Random();
		
		int nrs[] = new int[20];
		int pares = 0, impares = 0;
		
		for(int i = 0; i < nrs.length; i++)
		{
			nrs[i] = rand.nextInt(1, 100);
			System.out.println("Posição " + i + " = " + nrs[i]);
		}	
		
		for(int nr : nrs)
		{
			System.out.println(nr);
			if(nr % 2 == 0)
				pares++;
			else
				impares++;
		}
		
		System.out.println("Quantidade de nrs pares -> " + pares);
		System.out.println("Quantidade de nrs impares -> " + impares);
	}

}
