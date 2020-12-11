package formatif;
/*
* Author : dani
*Date: Dec. 10, 2020
*/
public class exercise2
	{

		public static void main(String[] args)
			{
				int [] nombre = {14,12,24,12,2,9,8,3,1000,4,10};
				int trouver = 55;
				boolean trouve = false;
				
				for(int n: nombre)
				{
					if(n==trouver)
					{
						trouve=true;
						break;
					}
				}
				if(trouve)
					System.out.println(trouver + " = oui");
				else
					System.out.println(trouver + " = non");
				

		     

			}

	}
