package chap03;

public class WhileEx03 {

	public static void main(String[] args) {
		int i, j;
		i = 1;
		j = 1;
		
		while(i <= 10) {
			j = 1;
			while(j <= i) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}
		

	}

}
