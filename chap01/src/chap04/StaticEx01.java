package chap04;

class Card {
	static int w;      // static 붙은놈을 정적 멤버(필드), static 붙은놈은 딱 한번만 만들어진다.				   // 
	static int h;       
	int kind;          // 안붙은걸 인스턴스 멤버
	int number;
	
	public String getCard() {
		return "H : " + h + ", W : " + w + ", KIND : " + kind + 
				", NUMBER : " + number;
	}
	
}
public class StaticEx01 {
	
	public void prt() {
		System.out.println("인스턴스 멤버 출력");
	}
	public static void staticPrt() {
		System.out.println("정적 멤버 출력");
	}
	
	
	public static void main(String[] args) {
		
		staticPrt();
//		prt();		    Error , 생성이 안되어있어서 class - StaticEx01
		StaticEx01 ss = new StaticEx01();
		ss.prt();     // 이렇게 생성해주면 가능
		
		
		Card.w = 300; // 정적 멤버는 생성이 되지 않아도 접근 가능
		
		Card c1 = new Card();
		c1.h = 150;         
		c1.w = 100;
		c1.kind = 1;
		c1.number = 1;
		
		Card c2 = new Card();
		c2.h = 200;
		c2.w = 150;
		c2.kind = 1;
		c2.number = 2;
		
//		c3.kind = 2;  // c3 가 생성이 안되어있다. Card c3 = new Card();
					  // 인스턴스 멤버는 생성을 하지 않으면 접근 불가.
		
		System.out.println(c1.getCard());
		System.out.println(c2.getCard());

	}

}
