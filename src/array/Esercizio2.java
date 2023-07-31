package array;

import java.util.Random;

public class Esercizio2 {
	public static void main(String[] args)
	{
		int[][] num;
		int i, x, tot=0;
		
		Random rand = new Random();
		num = new int[2][5];
		
		for(i=0;i<2;i++)
		{
			for(x=0;x<5;x++)
			{
				num[i][x]=rand.nextInt();
				tot+=num[i][x];
				System.out.print(num[i][x]+"\t");
			}
			System.out.println();
		}
		
		System.out.println("La somma della matrice è "+tot);
	}
		
}
