package ankit;

import java.util.Scanner;

public class pattern5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No of Rows You want to Print in Pattern: ");
		int num=sc.nextInt();
		sc.close();
	for (int i=num;i>0;i--)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print( j+" ");
			
		}
		System.out.println();	
	}
		
		
	}

}