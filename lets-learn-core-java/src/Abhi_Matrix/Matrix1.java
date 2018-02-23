package Abhi_Matrix;

import java.util.Scanner;

public class Matrix1 {
	static Scanner sc= new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a,b;
		
	//	int C[a][];
		System.out.println("Enter number of rows:");
		a=sc.nextInt();
		System.out.println("Enter number of Cols:");
		b=sc.nextInt();
		
		int R[][]= new int[a][b];
		
		System.out.println("Enter elements to matrix:");
		for(int row=0; row<a; row++)
		{
			for(int col=0; col<b; col++)
			{
				R[row][col]=sc.nextInt();
			}
		}
		for(int row=0; row<a; row++)
		{
			for(int col=0; col<b; col++)
			{
				System.out.print(R[row][col]+"  ");
				
			}System.out.println();
		}
		
		
	}

}
