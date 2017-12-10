package Abhijeeet;

public class Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=6;
		for(int row=1; row<= num ; row++){
			for(int col=1; col<=num; col++){
				
				if(row==1 || row==num || col==1 ||col==num){
				
				System.out.print(" * ");
				}
				else{
					System.out.print("   ");
				}
				
			}
			System.out.println();
				
		}
	

	
	
	
}
}
