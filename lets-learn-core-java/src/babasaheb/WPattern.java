package babasaheb;

public class WPattern {

	public static void main(String[] args) {

		int num = 10;
		for (int row = 1; row <= num; row++) {
			for (int col = 1; col<=num ;col++) {
				if (col == 1   || col==num/2|| col == num|| row == num || row == num) {

					System.out.print(" * ");
				} else {
					System.out.print("   ");
				}
				
			}
		 System.out.println();
		}

	}

}
