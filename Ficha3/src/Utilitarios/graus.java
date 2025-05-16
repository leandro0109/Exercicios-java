package Utilitarios;

public class graus {

	public static void converterF(double temp)
	{
		System.out.println(temp + " graus Celsius convertidos para Farenheit: " + ((9 * temp / 5) + 32)); 	
	}
	
	public static void converterC(double temp)
	{
		System.out.println(temp + " graus Farenheit convertidos para Celsius: " + (5 * (temp - 32) / 9)); 
	}

}
