package Class280118;

public class DoctorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		surgen bdoc =new surgen(101,"Dr. x", "Bone", 50000, "surgery");
		physician sdoc = new physician(102, "Dr. Jakyl", "Brain", 100000, "Chekup");
		
		heartSurg hdoc= new heartSurg(103, "Dr Heart", "abc",4500000,"Heartsurgery");
		
		System.out.println("Dr. X");
		bdoc.surgery();
		
		hdoc.getdetails();
		hdoc.special();
		hdoc.Docprotect();
		//bdoc.Docprotect();
		//sdoc.Docprotect();
		
		
		h1surgen h1 =new h1surgen(104, "Dr. h1", "left heart",451545,"assa");
		//h1.Docprotect();
		
		
	}

}
