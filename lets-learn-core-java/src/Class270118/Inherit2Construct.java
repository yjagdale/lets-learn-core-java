package Class270118;

public class Inherit2Construct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sedan1 a = new Sedan1("Seddaaan", "Red", 5000, true, 20000000);
		a.print();
	}

}

class carNEW {
	String carType;
	String color;
	int rpm;
	boolean abs;

	carNEW(String Type, String color, int rpm, boolean abs) {
		carType = Type;
		this.color = color;
		this.rpm = rpm;
		this.abs = abs;

	}

	void get() {
		System.out.println(carType + color + rpm + abs);
	}
}

class Sedan1 extends carNEW {
	int price = 200000;

	Sedan1(String Type, String color, int rpm, boolean abs, int price) {
		super(Type, color, rpm, abs);
		/*super();
		super();*/
		this.price = price;
	}

	void print() {
		get();
		System.out.println(price);
	}

}