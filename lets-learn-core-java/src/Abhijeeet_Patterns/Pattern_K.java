package Abhijeeet_Patterns;

public class Pattern_K {

	public static void main(String[] args) {

		int col,row;
		int num=7;
		for(row=1;row<=num;row++)
		{
			if(row>=(2*num/3))
			{
			for( col=num;col>=1;col--)
			{
				System.out.print("*");
			}
			}
			else if(row<(2*num/3))
			{
				for(col=1;col<=num;col++)
				{
					System.out.print("*");
				}
			}
			else 
			{
				System.out.print(" ");
			}
		
			}System.out.println("");
		}

}


