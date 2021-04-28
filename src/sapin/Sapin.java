package sapin;

public class Sapin {
	
	public static void main(String[] args) {
		dessinerSapin(5);

	}
	
	public static void dessinerSapin(int h) {
		int min = 5;
		int max = 25;
		
		if (h >= min && h <= max) {
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < h - 1 - i; j++) {
					System.out.print(" ");
				}
				for (int j = 0; j < 2 * i + 1; j++) {
					System.out.print("#");
				}
				System.out.println();
			}
			for (int i = 0; i < h - 2; i++) {
				System.out.print(" ");
			}
			for (int i = 0; i < 3; i++) {
				System.out.print("#");
			}
			
		} else {
			System.out.println("Impossible de dessinner un sapin de cette hauteur.");
		}
	}

}