package Abhijeeet;

public class Pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num =6;
		
		/*for(int row=1; row<=num; row++)
		{
			for(int col=1; col<=row; col++)
			{
				if(row==1 || row == num|| col==1 || row == col ){
					System.out.print("*");
	
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		for(int row=1; row<=num; row++)
		{
			for(int col=1; col<=row; col++)
			{
				if(row==1 ||  col==1 || row == col ){
					System.out.print("*");
	
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}*/
		
		
		for(int row=1; row<=num;row++)
		{
			for(int col=num; col>=row; col--)
			{
				if(row==1 ||  col==num || col==row ){
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
