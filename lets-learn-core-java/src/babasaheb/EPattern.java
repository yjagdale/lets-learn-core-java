package babasaheb;

public class EPattern {

	public static void main(String[] args) {

		int num = 10;
		for (int row = 1; row <= num; row++) {
			for (int col = 1; col <= num; col++) {
				if (row == 1 || col == 1 || row == num / 2 || row == num || row == num) {

					System.out.print(" * ");
				} else {
					System.out.print("   ");
				}

			}
			System.out.println();
		}

	}

}
