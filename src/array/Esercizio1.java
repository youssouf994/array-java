package array;

import java.util.Random;

public class Esercizio1 {
	public static void main(String[] args)
	{
		int[] num;
		int i, tot=0;
		
		Random rand=new Random();
		num=new int[10];
		
		for(i=0;i<10;i++)
		{
			num[i]=rand.nextInt();
			System.out.print(num[i]+"\t");
		}
		
		System.out.println();
		
		for(i=0;i<10;i++)
		{
			tot+=num[i];
		}
		
		System.out.println("Il totale dell'array è "+tot);
	}
}
