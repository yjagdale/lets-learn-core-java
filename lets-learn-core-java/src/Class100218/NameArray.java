package Class100218;

public class NameArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	 String a= "Abhijeet";
	
		char[] b = a.toCharArray();
		
		String ab=b.toString();
		for(int i=0; i<a.length(); i++)
		{
			for(int j=0;j<=i; j++)
			{
				System.out.print(a.charAt(j));
			}
			System.out.println();
		}
}
 }