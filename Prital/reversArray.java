package Prital;

import java.util.Scanner;

public class reversArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] number = new int[new Scanner(System.in).nextInt()];

		for (int i = 0; i < number.length; i++) {
			number[i] = new Scanner(System.in).nextInt();
		}
		
		for (int i = number.length-1; i >= 0; i--) {
			System.out.println(number[i]);
		}
	}

}
