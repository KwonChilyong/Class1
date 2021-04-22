package chap03;

public class WhileEx01 {

	public static void main(String[] args) {
		int i = 1;
		while(i < 5) {
			System.out.println(i);
			i++;
		}
		while(true) {
			System.out.println(i);
			i++;
			if(i >= 10) {
				break;
			}
		}

	}

}
