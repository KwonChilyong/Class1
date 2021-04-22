package chap03;

public class ForEx02 {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {

			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for (int i = 0; i < 5; i++) {

			for (int j = 0; j <= 4-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for (int i = 0; i < 5; i++) {

			for (int j = 0; j <= 4-i; j++) {
				System.out.print(" ");
			}
			for(int k = 0; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 0; i < 5; i++) {

			for (int j = 0; j <= i; j++) {
				System.out.print(" ");
			}
			for(int k = 0; k <= 4-i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
