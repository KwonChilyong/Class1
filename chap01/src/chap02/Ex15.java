package chap02;

public class Ex15 {

	public static void main(String[] args) {
		char c = 'e';
		char cu;
		
//		cu = (int)'h' - ((int)'a' - (int)'A');
		cu =(char)(c - 32);
		
		System.out.println(c + "의 대문자는 : " + cu);

	}

}
