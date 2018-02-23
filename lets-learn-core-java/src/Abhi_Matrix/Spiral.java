package Abhi_Matrix;

import java.util.Scanner;

public class Spiral {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number of rows: ");
		int a = sc.nextInt();
		System.out.println("Enter number of cols: ");
		int b = sc.nextInt();

		int[][] m = new int[a][b];

		System.out.println("Enter elements:");
		for (int row = 0; row < a; row++) {
			for (int col = 0; col < b; col++) {
				m[row][col] = sc.nextInt();
			}
		}

		for (int row = 0; row < a; row++) {
			for (int col = 0; col < b; col++) {
				System.out.print(m[row][col] + "\t");
			}
			System.out.println("");
		}
		
		spiral(m);

	}

	
	public static void spiral(int m[][]){
		int rowmax =m.length-1, colmax=m.length-1;
		int x=0, y=0;
		
		while(x<rowmax && y<colmax){
			for(int i=x; i<rowmax;i++)
			{
				System.out.println(m[x][i]);
				
			}
			for(int j=y; j<colmax;j++)
			{
				System.out.println(m[j][colmax]);
				
			}
			
			if(x==rowmax)
			{
				for(;;)
				{
					
				}
			}
		}
	}

}

