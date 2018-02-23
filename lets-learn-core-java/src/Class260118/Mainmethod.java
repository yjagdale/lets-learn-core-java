package Class260118;

public class Mainmethod {
	
		int acc;
		String Name;
		float bal;
		static String ab= "my Name is khan";
		
		/*Constructor*/	Mainmethod(int acc, String Name, float bal){
			this.acc=acc;
			this.Name=Name;
			this.bal=bal;
		}
		
		
		public void setAcc(int acc, String Name, float bal){
			this.acc=acc;
			this.Name=Name;
			this.bal=bal;
		}
		
		public String showAcc(){
			return "Name:"+Name+"\n"+"ACCOUNT:"+acc+"\n"+"Balance"+bal+ab;
		}
		
		public float CheckBal()
		{
			return bal;
		}
		
		public int deposit(int amt)
		{
			bal= bal+amt;
			return acc;
		}
		
		public int withdrawn(int amt)
		{
			bal= bal-amt;
			return acc;
		}
	}
