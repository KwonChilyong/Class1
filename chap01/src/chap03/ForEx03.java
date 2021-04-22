package chap03;

public class ForEx03 {

	public static void main(String[] args) {
		for(int i = 1; i < 9; i+=3) {
			for(int j = 1; j < 10; j++) {
				System.out.printf("%2d * %2d = %2d\t",i,j,i*j);
				System.out.printf("%2d * %2d = %2d\t",i+1,j,(i+1)*j);
				System.out.printf("%2d * %2d = %2d\n",i+2,j,(i+2)*j);
			}
		}

	}

}
