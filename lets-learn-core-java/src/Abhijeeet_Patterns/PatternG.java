package Abhijeeet_Patterns;

public class PatternG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=10;
		for(int row=1; row<=num; row++)
		{
			for(int col=1; col<=num; col++)
			{
				if(row==1 && col==1||row==num && col==1|| row==1&& col==num|| row==num&&col==num)
				{
					System.out.print(" ");
				}
				else if(row==1||col==1|| row==num|| row>=((2*num)/3)&& col==num|| row==(2*num/3)&& col>(num/2))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}System.out.println();
		}
	}

}
