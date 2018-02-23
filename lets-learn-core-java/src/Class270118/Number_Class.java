package Class270118;

public class Number_Class {

	int a;
	Number_Class(int a){
		this.a=a;
		System.out.println("Inside Constructor:"+a);
	}


	int square()
	{
		/*this.a=a;
		a=a*a;
		System.out.println("Square is "+a);*/
				
		return a*a;
	}

	int Cube()
	{
		
		return a*a*a;
						
	}
	
	public void evenodd(int a)
	{
		if(a%2==0)
		{
			System.out.println("Number is even");
		}
		else
		{
			System.out.println(" number is odd");
		}
	}
	
	
	
	public static int add(int q, int b)
	{
		return q+b;
	}
}
