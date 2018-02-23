package Class260118;

public class Bnk_Demo {

	public static void main(String[] args) {
		Mainmethod abhi=new Mainmethod(101,"Abhi",15000);
		//abhi.setAcc(101, "Abhi", 15000);
		abhi.deposit(5000);
		abhi.withdrawn(600);
		System.out.println(abhi.CheckBal());
		abhi.ab="my Name is @b";
		abhi.ab="my Name is @bb";
		System.out.println(abhi.showAcc());
	}

}

