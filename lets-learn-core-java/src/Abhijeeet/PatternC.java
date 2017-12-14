package Abhijeeet;

import java.util.Scanner;

public class PatternC {
	static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print();
	}

	public static void print()
	{
		
		System.out.println("Enter number of rows:");
		PatternB(sc.nextInt());
	}
	
	public static void PatternB(int num)
	{
		for(int row=1; row<=num; row++)
		{
			for(int col=1; col<=num; col++){
				 if(row==1 && col==1 || row==num && col==1)
				{
					System.out.print(" ");
					
				}
				 else if(row==1 ||  row==num || col==1  ){
						
						System.out.print("*");
					}
			
			}
			System.out.println(" ");
		}
	}

}
