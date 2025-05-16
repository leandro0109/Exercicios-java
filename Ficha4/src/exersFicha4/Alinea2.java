package exersFicha4;

import java.util.Random;

public class Alinea2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random rand = new Random();
		
		int nrs[] = new int[7];
		
		for(int i = 0; i < nrs.length; i++)
		{
			nrs[i] = rand.nextInt(1, 1000);
			System.out.println("Posição " + i + " = " + nrs[i]);
		}	
	}

}
