/*3. Creare la classe Esercizio3 nel cui main creare un array monodimensionale di 10 interi e inizializzarlo con valori casuali. Trovare il valore più grande e stamparlo.
*/

package array;

import java.util.Random;

public class Esercizio3 {
	public static void main(String[] args)
	{
		int[] num;
		int i, temp=-2147483648;
		
		num= new int[10];
		Random rand = new Random();
		
		for(i=0;i<10;i++)
		{
			num[i]=rand.nextInt();
			System.out.print(num[i]+"\t");
		}
		
		for(i=0;i<10;i++)
		{
			if(num[i]>temp)
			{
				temp=num[i];
			}
		}
		
		System.out.println("\nIl numero maggiore è "+temp);
	}

}
