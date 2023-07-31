/*1. Creare la classe Esercizio1 nel cui main creare un vettore 
(array monodimensionale) di 10 interi, popolarlo con dati casuali, sommare i dati all'interno dell'array e stampare il totale.*/

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
