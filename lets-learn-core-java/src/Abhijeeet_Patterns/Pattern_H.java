package Abhijeeet_Patterns;

public class Pattern_H {

	public static void main(String[] args) {
		int num=5;
		
		for(int row=1;row<=num;row++)
		{
			for(int col=1;col<=num;col++)
			{
				if(col==1||col==num||row==(2*num/3))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}System.out.println("");
		}
	}

}
