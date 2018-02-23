package Class140118;

import java.util.Scanner;

public class SpiralMatrix {

	static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i, j = 0, row, col;
		
		System.out.println("Enter num of rows:");
		row=sc.nextInt();
		System.out.println("Enter num of cols:");
		col=sc.nextInt();
		
		int[][] a=new int[row][col];
		
		for( i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				a[i][j]=sc.nextInt();
				
			}
		}
		for( i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				System.out.print(a[i][j]+" ");
				
			}System.out.println(" ");
		}
		
		System.out.println("Spiral elements for this matrix are:");
		SpiralMatrx(a);
		
	}
	
	public static void SpiralMatrx(int[][] a)
	{
		int x=0,y=0;
		int rowmax=a.length-1;
		int colmax=a[0].length-1;
		
		while(x<rowmax && y<colmax)
		{
			for(int i=x;i<=rowmax;i++)
			{
				System.out.print(a[x][i]+" ");
			}
			for(int j=y;j<=colmax;j++)
			{
				System.out.print(a[j][colmax]+" ");
			}
			if(x+1<=rowmax)
			{
				for(int k=colmax;k>=y;k--)
				{
					System.out.print(a[rowmax][k]);
				}
			}
			if(y+1<=colmax)
			{
				for(int k=rowmax;k>x;k--)
				{
					System.out.print(a[k][colmax]);
				}
			}
			x++;
			rowmax--;
			y++;
			colmax--;
		}
		
	}

}
