package Class260118;

public class Calass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Television sony = new Television();
		sony.set(15000, 30, "B1", true);
		Television Panas =new Television();
		Panas.set(50000, 55, "p1", true);
		
		System.out.println(sony.get());
		System.out.println(Panas.get());
	}
}

	class Television
	{
		public int Prize;
		public int Size;
		public String Name;
		public boolean available;
		
		public void set(int Prize, int Size, String Name, boolean available)
		{
			this.Prize=Prize;
			this.Size=Size;
			this.Name=Name;
			this.available=available;
			
		}
		
		public String get()
		{
			return "Prize="+ Prize +"Size="+Size+"Name="+Name+"Is AVail? :"+available;
		}
}
