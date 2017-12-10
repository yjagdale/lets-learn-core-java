package ankit;
public class Pattern8 {

	public static void main(String[] args) {
	int num=6;
	for (int row=1;row<=num;row++)
	{
		for(int col=1;col<=num;col++)
		{
			if(row==1 || row==(num/2+1) || col==1 || col==num )
			{
				System.out.print(" * ");
			}else
			{
				System.out.print("   ");
			}
		}
		System.out.println();
	
	
	}
		
		
	}

}