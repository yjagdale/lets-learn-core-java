package Pattern;

public class printPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=6;
		int mid=num/2;
		for (int row = 1; row <= num; row++) {
			for (int col = 1; col <= num; col++) {
				//if(row==1||col==1||row==num||col==num) //To print O
				//if(row==1||col==1||row==mid||col==num||row==num) //To print A or B
				//if(row==1||col==1||row==num) //To print C
				//if(row==1||col==1||row==num||row==mid) // To print E
				//if(row==1||col==1||row==mid) //To print F
				// Print G remaining
				//if(col==1||col==num||row==mid) // To print H
				if(row==1||row==num||col==mid) // To print I
				{
					System.out.print(" * ");
				}
				else {
					System.out.print("   ");
				}
			}
			System.out.println();
		}
	}

}
