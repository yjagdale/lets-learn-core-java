package Class110218;


interface draw{
	void draw();
	
}

interface print extends draw{
	void print();
}

class Circle implements draw, print{

	@Override
	public void draw() {
		System.out.println("Drawing circle");
		
	}

	@Override
	public void print() {
		System.out.println("Printing Rectangle");
		
	}
	
}

class Rectangle implements draw{

	@Override
	public void draw() {
		System.out.println("Drawing rectangle");
		
	}
	
}

public class intrfc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		draw c= new Circle();
		c.draw();
		print c1=new Circle();
		c1.print();
		
		Rectangle r= (Rectangle) c;   //Casting same memory allocation of circle obj to rectangle obj  
		r.draw();
	}

}
