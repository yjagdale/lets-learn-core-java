package babasaheb;

public class Dpattern {

	public static void main(String[] args) {

		int num = 10;
		for (int row = 1; row <= num; row++) {
			for (int col = 1; col<=num ;col++) {
				if (row == 1 || col == 3  || col==num|| row == num / 1|| row == num || row == num) {

					System.out.print(" * ");
				} else {
					System.out.print("   ");
				}
				
			}
		 System.out.println();
		}

	}

}
