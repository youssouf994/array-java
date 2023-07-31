/*5. Creare la classe Esercizio5 nel cui main estrarre un numero a caso tra 1 e 100 (inclusi) e stabilire se è pari o dispari.*/

package array;

import java.util.Random;

public class Esercizio5 {
	public static void main(String[] args)
	{
		int estratto;
		
		Random rand = new Random();
		
		estratto=rand.nextInt(1, 101);
		
		if(estratto%2==0)
		{
			System.out.println(estratto);
			System.out.println("Il numero estratto è pari");
		}
		else
		{
			System.out.println(estratto);
			System.out.println("Il numero estratto è dispari");
		}
			
	}

}
