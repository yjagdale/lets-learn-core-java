package Class280118;

public class Doctor {

	int id;
	String name;
	String Specialist;
	int sal;
	
	 Doctor(int id, String name, String Specialist, int sal)
	{
		this.id=id;
		this.name=name;
		this. Specialist=Specialist;
		this.sal=sal;
	}
	void getdetails()
	{
		System.out.println(id+  name+  Specialist+ sal);
		
	}
	
	 void Docprotect()
	{
		System.out.println("Doctor protecrted method");
	}
}

class surgen extends Doctor{
	surgen(int id, String name, String Specialist, int sal, String Surgery) {
		super(id, name, Specialist, sal);
		// TODO Auto-generated constructor stub
	}

	void surgery()
	{
		System.out.println("can perform surgery");
	}
	
}

class heartSurg extends surgen{

	heartSurg(int id, String name, String Specialist, int sal, String Surgery) {
		super(id, name, Specialist, sal, Surgery);
		// TODO Auto-generated constructor stub
	}
	
	void special()
	{
		System.out.println("can perform heart surgery");
	}
	
	 void Docprotect()
		{
			System.out.println("Doctor protecrted method in heartsurgen");
		}
}
class NuroSurg extends surgen{

	NuroSurg(int id, String name, String Specialist, int sal, String Surgery) {
		super(id, name, Specialist, sal, Surgery);
		// TODO Auto-generated constructor stub
	}
	
	void special()
	{
		System.out.println("can perform Nuro surgery");
	}
	
}

class h1surgen extends heartSurg{

	h1surgen(int id, String name, String Specialist, int sal, String Surgery) {
		super(id, name, Specialist, sal, Surgery);
		// TODO Auto-generated constructor stub
	}
	
}



class physician extends Doctor{
	
	physician(int id, String name, String Specialist, int sal, String checkup) {
		super(id, name, Specialist, sal);
		// TODO Auto-generated constructor stub
	}

	void checkup()
	{
		System.out.println(" Normal checkup");
		
	}
}

class nurse extends Doctor{
	nurse(int id, String name, String Specialist, int sal) {
		super(id, name, Specialist, sal);
		// TODO Auto-generated constructor stub
	}

	void support(){
		System.out.println("for support only.");
	}
}