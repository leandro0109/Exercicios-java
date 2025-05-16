package ExersFicha2;

public class Exer7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 0;
		while(num <= 20)
		{
			if(num % 2 == 0)
				System.out.println("Número " + num + " é par.");
			num++;
		}
		
		num = 0;
		do
		{
			if(num % 2 == 0)
				System.out.println("Número " + num + " é par.");
			num++;
		}while(num <= 20);
		
	}

}
