/*4. Creare la classe Esercizio4 nel cui main ripetere l'esercizio 3 con una matrice 5x2 anziché un vettore*/

package array;

import java.util.Random;

public class Esercizio4 {
	public static void main(String[] args)
	{
		int[][] num;
		int i, x, temp=-2147483648;
		
		num = new int[5][2];
		Random rand = new Random();
		
		for(i=0;i<5;i++)
		{
			for(x=0;x<2;x++)
			{
				num[i][x]=rand.nextInt();
				System.out.print(num[i][x]+"\t");
			}
			System.out.println();
		}
		
		for(i=0;i<5;i++)
		{
			for(x=0;x<2;x++)
			{
				if(num[i][x]>temp)
				{
					temp=num[i][x];
				}
			}
		}
		
		System.out.println("Il maggiore è "+temp);
	}

}
