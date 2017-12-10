package Abhijeeet;

import java.util.Scanner;

public class reverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = new int[5];
		System.out.println("Enter number:");
		Scanner sc =new Scanner(System.in);
		
		for (int i = 0; i < a.length; i++) {
			a[i]=sc.nextInt();
			
		}
		
		for (int i = a.length-1; i >= 0; i--) {
						
			System.out.print(a[i]);
	}
		

	}

}
