package Abhijeeet_Patterns;

public class Pattern_J {

	public static void main(String[] args) {

		int num=7;
		for(int row=1; row<=num; row++)
		{
			for(int col=1;col<=num;col++)
			{
				if(row==1 || row>=(2*num/3)&& col==1|| col==(2*num/3)||row==num&& col<=(2*num/3))
				{
					System.out.print(" * ");
				}
				else
				{
					System.out.print("   ");
				}
			}System.out.println("");
		}
	}

}
