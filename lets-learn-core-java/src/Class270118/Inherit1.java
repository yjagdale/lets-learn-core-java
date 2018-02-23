package Class270118;

public class Inherit1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sedan a =new Sedan();
		a.print();
	}

}

class car
{
	String carType;
	String color;
	int rpm;
	boolean abs;
	
	void set(String Type, String color, int rpm, boolean abs){
		carType=Type;
		this.color=color;
		this.rpm=rpm;
		this.abs=abs;
		
	}
	
	void get()
	{
		System.out.println(carType+ color+ rpm+abs);
	}
}


class Sedan extends car
{
	int price=200000;
	
	void print()
	{
		get();
		System.out.println(price);
	}
}