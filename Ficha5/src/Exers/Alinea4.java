package Exers;

import java.text.DecimalFormat;
import java.util.Random;

public class Alinea4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random rand = new Random();
		DecimalFormat df = new DecimalFormat("0.00");
		
		double[] pesoParafusos = new double[20];
		double[] compParafusos = new double[20];	
		double pesoMedio = 0, compMedio = 0, pesoAcimaMedia = 0, maisComp = 0, maisCurto = 0;
		
		for(int i = 0; i < 20; i++)
		{
			pesoParafusos[i] = rand.nextDouble(20);
			compParafusos[i] = rand.nextDouble(20);	
			pesoMedio += pesoParafusos[i];
			compMedio += compParafusos[i];
		}
		
		maisCurto = compParafusos[0];
		pesoMedio /= 20;
		compMedio /= 20;
		
		for(int i = 0; i < 20; i++)
		{
			if(pesoParafusos[i] > pesoMedio)
				pesoAcimaMedia++; 
			
			if(maisCurto > compParafusos[i])
				maisCurto = compParafusos[i];
			
			if(maisComp < compParafusos[i])
				maisComp = compParafusos[i];
		}
		pesoAcimaMedia = pesoAcimaMedia / 20 * 100;
		
		System.out.println("Peso médio: " + df.format(pesoMedio) + "g");
		System.out.println("Comprimento médio: " + df.format(compMedio) + "cm");
		System.out.println("Percentagem parafusos com peso acima da média: " + df.format(pesoAcimaMedia) + "%");
		System.out.println("Diferença entre o parafuso mais comprido e mais curto: " + df.format(maisComp - maisCurto) + "cm");
	}

}
