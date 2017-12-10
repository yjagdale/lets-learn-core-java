package Ashish;

import java.util.Scanner;

public class Arrayoprations {
public static void main(String[] args) {
	
	
	reverse();
	
	
}

public static void max()
{
	int[] userinputs=new  int[10];
	int max=0;
	for (int i = 0; i < userinputs.length; i++) {
		userinputs[i]= new Scanner(System.in).nextInt();
	}
	for (int i = 0; i < userinputs.length; i++) {
		if (userinputs[i]>max) {
			
			max=userinputs[i];
			
		}
	}
	
	for (int i = 0; i < userinputs.length; i++) {
		
		System.out.println(i+"-->"+userinputs[i]);
	}
}

public static void reverse()
{
	int[] userinputs=new  int[5];
	int max=0,i,j=5;
	for ( i = 0; i < userinputs.length; i++) {
//		System.out.println("enter the element in array:--");
		userinputs[i]= new Scanner(System.in).nextInt();
		
	}
	
	for ( i = userinputs.length-1; i >=0; i--) {
		
		System.out.println(i+"-->"+userinputs[i]);

	}
}

}
