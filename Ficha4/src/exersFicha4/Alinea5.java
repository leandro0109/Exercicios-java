package exersFicha4;

import java.util.Arrays;

public class Alinea5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nrs[] = {2, 4, 35, 50, 23, 17, 9, 12, 27};
		int maiorValor = nrs[0];
		double media = 0;
		
		for (int i = 0; i < nrs.length; i++)
		{
			if(nrs[i] > maiorValor)
				maiorValor = nrs[i];
			media += nrs[i];
		}
		media = media / nrs.length;		
		Arrays.sort(nrs);
		
		System.out.println("Maior valor -> " + maiorValor);
		System.out.println("Média dos valores -> " + media);
		System.out.println("Valores em ordem crescente:" + "\n" + Arrays.toString(nrs));
	}

}
