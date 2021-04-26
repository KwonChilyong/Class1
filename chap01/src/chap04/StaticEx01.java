package chap04;

class Card {
	static int w;      // static �������� ���� ���(�ʵ�), static �������� �� �ѹ��� ���������.				   // 
	static int h;       
	int kind;          // �Ⱥ����� �ν��Ͻ� ���
	int number;
	
	public String getCard() {
		return "H : " + h + ", W : " + w + ", KIND : " + kind + 
				", NUMBER : " + number;
	}
	
}
public class StaticEx01 {
	
	public void prt() {
		System.out.println("�ν��Ͻ� ��� ���");
	}
	public static void staticPrt() {
		System.out.println("���� ��� ���");
	}
	
	
	public static void main(String[] args) {
		
		staticPrt();
//		prt();		    Error , ������ �ȵǾ��־ class - StaticEx01
		StaticEx01 ss = new StaticEx01();
		ss.prt();     // �̷��� �������ָ� ����
		
		
		Card.w = 300; // ���� ����� ������ ���� �ʾƵ� ���� ����
		
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
		
//		c3.kind = 2;  // c3 �� ������ �ȵǾ��ִ�. Card c3 = new Card();
					  // �ν��Ͻ� ����� ������ ���� ������ ���� �Ұ�.
		
		System.out.println(c1.getCard());
		System.out.println(c2.getCard());

	}

}
