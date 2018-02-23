package Class100218;

public class ChlidInherit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BaseClass b =new BaseClass();
		b.print1();
		
		BaseClass c1= new Child1Class();
		c1.print2();
		
		Child3Class c3= new Child3Class();
		c3.printx();
		c3.printp();
		c3.print2();
	}

}

class BaseClass{
	public void print1(){
		System.out.println("Base print 1");
	}
	
	public void print2(){
		System.out.println("Base print 2");
	}
	
}

class Child1Class extends BaseClass{
	public void print1(){
		System.out.println("Child1 print 1");
	}
}

class Child2Class extends BaseClass{
	public void print2(){
		System.out.println("Child2 print 1");
	}
	
	public void printx(){
		System.out.println("Child2 print x");
	}
}


class Child3Class extends Child2Class{
	public void print2(){
		System.out.println("Child3 print 1");
	}
	
	public void printp(){
		System.out.println("Child3 print P");
	}
}