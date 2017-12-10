package ankit;

import java.util.Scanner;

public class Pattern6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No of Rows You want to Print in Pattern: ");
		int num=sc.nextInt();
		sc.close();
	for (int i=1;i<=num;i++)
	{
		for(int j=num;j>=i;j--)
		{
			System.out.print(" * ");
			
		}
		System.out.println();	
	}
		
		
	}

}