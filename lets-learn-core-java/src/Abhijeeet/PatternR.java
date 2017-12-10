package Abhijeeet;

public class PatternR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num =10;
		
		for(int row=1; row<=num; row++)
		{
			for(int col=1; col<=row; col++)
			{
				if(row==1 || row == (num/2)|| col==1 || row == col ){
					
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
