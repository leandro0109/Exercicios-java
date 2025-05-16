package Utilitarios;

public class calculos {
	
	public static double calcularDelta(double a, double b, double c)
	{
		double delta = Math.pow(b,  2) - 4 * a * c;
		System.out.println("Valor delta: " + delta);
		return delta;
	}

	public static void calcularRaizes(double a, double b, double c)
	{
		if(a == 0) 
		{
			System.out.println("Erro... O quoeficiente a deve ser diferente de 0");
		}
		else 
		{
			double delta = calcularDelta(a, b, c);
			double r1 = (-b + Math.sqrt(delta)) / Math.pow(a, 2);
			double r2 = (b + Math.sqrt(delta)) / Math.pow(a, 2);
			System.out.println("As raízes da equação são: raiz 1 = " + r1 + " e raiz 2 = " + r2);
		}
	};
	
	public static String maiorEMenor(double n1, double n2)
	{
		double maior = 0, menor = 0;
		if(n1 < n2)
		{
			maior = n2;
			menor = n1;
		}
		else
		{
			maior = n1;
			menor = n2;
		}
		return "Maior número: " + maior + "Menor número: " + menor;
	}

}
