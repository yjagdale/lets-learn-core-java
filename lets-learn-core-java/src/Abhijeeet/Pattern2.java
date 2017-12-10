package Abhijeeet;

public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num =6;
		
		for(int row=1; row<=num; row++)
		{
			for(int col=1;col<=row; col++)
			{
				System.out.print(""+row+"");
			}
			System.out.println();
		}
		
		for(int row=1; row<=num; row++)
		{
			for(int col=1;col<=row; col++)
			{
				System.out.print(""+col+"");
			}
			System.out.println();
		}
		
		for(int row=1; row<=num; row++)
		{
			for(int col=1;col<=row; col++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
