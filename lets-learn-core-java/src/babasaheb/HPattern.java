package babasaheb;

public class HPattern {

	public static void main(String[] args) {

		int num = 10;
		for (int row = 1; row <= num; row++) {
			for (int col = 1; col<=num ;col++) {
				if (col == 1   || row==num/2|| col == num) {

					System.out.print(" * ");
				} else {
					System.out.print("   ");
				}
				
			}
		 System.out.println();
		}

	}

}
