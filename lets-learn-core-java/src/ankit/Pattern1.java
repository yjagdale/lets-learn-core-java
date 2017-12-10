package ankit;
import java.util.Scanner;
public class Pattern1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No of Rows You want to Print in Pattern: ");
		int num=sc.nextInt();
	for (int i=1;i<=num;i++)
	{
		for(int j=1;j<=num;j++)
		{
			System.out.print(" * ");
			
		}
		System.out.println();	
	}
		
		
	}

}
