package chap05;

public class p203Ex1 {

	public static void main(String[] args) {
		String str = "java is Ok.";
		
		System.out.println("a�� ������ : " + countChar(str,'a'));
		

	}
	public static int countChar(String s, char c) {
		int countChar = 0;
		for(int i = 0 ; i < s.length() ; i++) {  // ���ڿ��� ���� ������ length()
			if(s.charAt(i) == c) {
				countChar++;
			}
		}
		return countChar; 
	}

}
