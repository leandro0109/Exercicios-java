package Exers;

import java.util.Scanner;

/*6. O custo de um carro novo ao consumidor é a soma do custo de fábrica com a
percentagem do distribuidor e dos impostos (aplicados ao custo de fábrica). Supondo
que a percentagem do distribuidor seja de 28% e os impostos de 45%, escrever um
algoritmo para ler o custo de fábrica de um carro, calcular e escrever o custo final ao
consumidor*/

public class Exer6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		float custoFabrica = 0f, custoFinal = 0f, percDistribuidor = 0.28f, impostos = 0.45f;
		
		System.out.println("Insira o custo de fábrica do carro: ");
		custoFabrica = entrada.nextInt();
		
		custoFinal += custoFabrica;
		custoFinal += (custoFabrica * percDistribuidor);
		custoFinal += (custoFabrica * impostos);
		
		System.out.println("Custo final do carro: " + custoFinal + "€");
	}

}
