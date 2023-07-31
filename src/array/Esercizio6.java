package array;

import java.util.Scanner;
import java.util.Random;

public class Esercizio6 {
	public static void main(String[] args)
	{
		Scanner cin = new Scanner(System.in);
		Random rand = new Random();
		
		int d1, d2;
		int scelta;
		int i, bingo;
		
		System.out.println("Quanti lanci vuoi eseguire?");
		scelta=cin.nextInt();
		
		bingo=0;
		for(i=0;i<scelta;i++)
		{
			d1=rand.nextInt(1, 7);
			d2=rand.nextInt(1, 7);
			
			System.out.println("Lancio numero "+(i+1));
			System.out.println(d1);
			System.out.println(d2);
			System.out.println();
			
			if((d1==6)&&(d2==6))
			{
				bingo++;
			}
		}
		
		System.out.println("Probabilità matematica "+ bingo+"/"+scelta);
	}

}
