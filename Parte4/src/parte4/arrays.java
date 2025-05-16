package parte4;

import java.util.Arrays;
import java.util.Random;

public class arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x=10;
		int[] num=new int[x];
		Random rnd=new Random();
		
		for(int i=0; i<x; i++) {
			num[i]=rnd.nextInt(1,51);
		
		}
		
		for (int conta: num) {
			System.out.println(conta);
		}
		
		int maior=num[0];
		int menor=num[0];
		
		for(int i=0; i<x; i++) {
			if(num[i]>maior) {
				maior=num[i];
			}
			
			if(num[i]<menor) {
				menor=num[i];
			}
		}
		
		System.out.println("O maior valor é " + maior + " e o menor valor é " + menor);
		
		Arrays.sort(num);
		
		for (int conta: num) {
			System.out.println(conta);
		}
 
	}

}
