package Exers;

import java.text.DecimalFormat;
import java.util.Random;

public class Alinea3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random rand = new Random();
		DecimalFormat df = new DecimalFormat("0.00");
		
		double[] salarios = new double[12];
		double valorTotal = 0;
		
		for(int i = 0; i < 12; i++)
		{
			salarios[i] = rand.nextDouble(1500); 
			System.out.println("Valor recebido no mês " + (i+1) + ": " + df.format(salarios[i]));
			valorTotal += salarios[i];
		}
		System.out.println("Total anual recebido: " + df.format(valorTotal));
	}

}
