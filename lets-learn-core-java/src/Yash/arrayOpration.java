package Yash;

import java.util.Scanner;

public class arrayOpration {
	/*
	 *
     * 		* * *
     * 		* * *
     * 		*   *
	 * 
	 * 
	 * 
	 * 
	 * 1 1 2 1 2 3 1 2 3 4
	 * 
	 * 
	 */
	public static void main(String[] args) {
		int number = 6;
		for (int row = 1; row <= number; row++) {
			for (int col = 1; col <= row; col++) {
				if(row == 1 || col == 1 || row == number || col == row) {
					System.out.print(" * ");
				} else {
					System.out.print("   ");
				}
			}
			System.out.println();
		}
	}

}
