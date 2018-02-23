package Class130118;

import java.util.Scanner;

public class Except {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		System.out.println("Enter number");
		int i=1;
		try{
		 i= new Scanner(System.in).nextInt();
		}catch (Exception ee){
			ee.printStackTrace();
		}
		try{
			i=i/0;
			
		}catch(ArithmeticException eee)
		{
			eee.printStackTrace();//printStack can be used to find out the hierarchy of exception
		}
		
		
		
		
		System.out.println("Number is:"+i);
	}

}
