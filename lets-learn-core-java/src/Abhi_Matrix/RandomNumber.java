package Abhi_Matrix;

import java.util.Scanner;

public class RandomNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a, b;
		System.out.println("Enter lowest and highest number ");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();

		for (int i = 1; i < 5; i++) {
			if (a < b) {
				int z = (int) (Math.random() * (b - a) + a);
				System.out.println("number is :" + z);
			}
		}

	}

}
