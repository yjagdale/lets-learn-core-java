package Abhijeeet;

import java.util.Scanner;

public class arrayMax {

	public static void main(String[] args) {


		int[] a = new int[5];
		System.out.println("Enter number:");
		 for (int i = 0; i < a.length; i++) {
			a[i] = new Scanner(System.in).nextInt();
			
		}
		 int max=0;
		 for (int i = 0; i < a.length; i++) {
			
			if(a[i]>max){
				max=a[i];
			}
		 }
			System.out.println("Max is:"+max);
		}

	}


