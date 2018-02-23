package Class170218;

import java.util.ArrayList;
import java.util.Iterator;

public class StudentArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<student> AL= new ArrayList<>();
		
		AL.add(new student(100, 24, "ABHI"));
		AL.add(new student(110, 25, "WAJ"));
		AL.add(new student(111, 26, "OMI"));
		AL.add(new student(101, 27, "AVI"));

		print(AL);
		AL.remove(3);
		
		print(AL);
	}
	
	public static void print(ArrayList<student> st){
		student s;
		
		Iterator it=st.iterator();
		while(it.hasNext()){
			s =(student) it.next();
			System.out.println("Roll no. :" + s.roll);
			System.out.println("Roll no. :" + s.age);
			System.out.println("Roll no. :" + s.name);
			System.out.println("____________________________");
		}
	}

}

class student{
	
	int roll, age;
	String name;
	
	student( int roll, int age, String name)
	{
		this.roll=roll;
		this.age=age;
		this.name=name;
	}
}