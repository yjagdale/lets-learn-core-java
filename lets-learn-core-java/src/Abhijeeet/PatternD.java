package Abhijeeet;

import java.util.Scanner;

public class PatternD {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		print();
	}

	private static void print() {
		System.out.println("Enter number of rows:");
		PatternD(sc.nextInt());
	}

	private static void PatternD(int num) {
		// TODO Drowing pattern D
		for(int row=1; row<=num; row++)
		{
			for(int col=1; col<=num; col++)
			{
				if(row==1 && col==num || row==num && col==num)
				{
					System.out.print(" ");
				}
				else if(row==1 || col== 1 || row==num|| col==num)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
				
				/*if(row==1 && col!=num || row==num && col!=num || col==1){
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}*/ 
				/*This one is also correct*/
				
			}
			System.out.println(" ");
		}
	}
	

}
