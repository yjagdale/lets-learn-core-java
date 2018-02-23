package Class170218;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> Std= new ArrayList<>();
		
		//Add elements
		Std.add("Std1");
		Std.add("Std2");
		Std.add("Std3");
		Std.add("Std4");
		
		// Get elements
		 String s= Std.get(3);
		 System.out.println("Student is  :"+s);
		 
		 // update elements
		 
		 Std.set(2, "Stdx");
		 
		 System.out.println(Std.get(2));
		 
		  // Delete item
		 
		 Std.remove(2);

		 // Print all 
		 //1st method
		 for(int i=0;i<Std.size(); i++)
		 {
			 System.out.println(Std.get(i));
		 }
		 
		 // 2nd method
		 Iterator it =Std.iterator();
		 while(it.hasNext()){
			 System.out.println(it.next());
		 }
		 
	}

}
