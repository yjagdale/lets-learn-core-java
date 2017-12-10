package ankit;

import java.util.Scanner;

public class arrayoperation {

	public static void main(String[] args) {
		int[] userinput = new int[20];
		
		for(int i =0; i< userinput.length;i++){
			userinput[i]=new Scanner(System.in).nextInt();
		}

		int max=0;
		for(int i =0; i< userinput.length;i++){
			if(userinput[i] > max){
				max=userinput[i];
			}
		}
		
		System.out.println("Max Is: "+ max);
	}

}
