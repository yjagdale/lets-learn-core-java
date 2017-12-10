package Abhijeeet;

public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=6;
		for(int row=1; row<=a;row++)
		{
			for(int col=a; col>=row; col--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int row=1; row<=a;row++)
		{
			for(int col=a; col>=row; col--)
			{
				System.out.print(""+col+"");
			}
			System.out.println();
		}
	}

}
