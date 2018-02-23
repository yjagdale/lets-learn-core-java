package Class170218;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, student> stdList =new HashMap<>();
		
		// adding students
		stdList.put("Abhi", new student(100, 22, "Abhi"));
		stdList.put("Omi", new student(101, 24, "Omi"));
		stdList.put("Avi", new student(110, 25, "Avi"));
		stdList.put("Waj", new student(111, 26, "Waj"));
		stdList.put("Payur", new student(112, 28, "Payur"));
		stdList.put("Wam", new student(121, 27, "Wam"));
		
		// getting record
		
		Set<String> s= stdList.keySet();
		Iterator<String> it =s.iterator();
		
		String keeeyy;
		while(it.hasNext())
		{
			keeeyy = it.next();
			System.out.println(keeeyy + "::"+ ""+stdList.get(keeeyy).age+" "+stdList.get(keeeyy).name);
		
		}
		
	}

}
