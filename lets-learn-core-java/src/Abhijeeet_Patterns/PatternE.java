package Abhijeeet_Patterns;

public class PatternE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=7;
		for(int row=1;row<=num;row++)
		{
			for(int col=1;col<=num;col++)
			{
				if(row==1|| col==1 ||row==(num/2)+1||row==num)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
