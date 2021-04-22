package chap04;
class St {
	int no;             // 필드들이다. 필드는 생성시 자동 초기화가 이루어짐.
	String name;
	int age;
	
	void print() {
		int k; // 지역변수 
		System.out.println("no : " + no + ", name : " + name + ", age : " + age );
	}
}

public class ClassEx03 {
//	static int number = 10; // 클래스에 해준건 필드
	public static void main(String[] args) {
		int n; // 메소드에 해준건 지역변수, 지역변수는 자동초기화 안됨.
//		System.out.println(number);
		St s = new St();
		n = 20;
//		no = 1; 필드들은 그대로 쓰면 안되고 s. 붙여줘야함
		s.no = 1;
		s.name = "홍길동";
		s.age = 30;
		s.print(); //메소드도 s. 붙임
		System.out.println(s.no);
		System.out.println(s.name);
		System.out.println(s.age);
		System.out.println(n);
		
		for(int i = 0; i < 5; i++) {
			int k = 10; // 매번 생성되기 때문에 계속 10
			System.out.println("k : " + k);
			System.out.println("n : " + n);
			k++;
			n++;
		}
	}

}
