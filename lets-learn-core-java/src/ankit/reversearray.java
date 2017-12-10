package ankit;

import java.util.Scanner;

public class reversearray {

	public static void main(String[] args) {
		int[] userinput = new int[5];
		
		for(int i =0; i< userinput.length;i++){
			userinput[i]=new Scanner(System.in).nextInt();
		}

		for(int i =userinput.length-1; i>=0 ;i--){

			System.out.println("Reverse of array: " + userinput[i]);
			}
		
		
		
	}

}