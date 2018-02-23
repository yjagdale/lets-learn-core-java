package Class270118;

import java.util.Scanner;

public class Number_Class_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int x;
		
		System.out.println("enter any number:");
		x=sc.nextInt();
		Number_Class num = new Number_Class(x);
				
		System.out.println(num.square());
		System.out.println(num.Cube());
		num.evenodd(x);
		
		System.out.println(Number_Class.add(x, x));
		
		
	}

}
