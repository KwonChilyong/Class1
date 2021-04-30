package chap06;

class Product{
	int price;
	int bonusPoint;
	Product(int price){
		this.price = price;
		bonusPoint = price / 10; 
	}
}

class Tv extends Product {
	Tv(int price){
		super(price); 
		
	}
	public String toString() {
		return "TV";
	}
}

class Computer extends Product{
	Computer(int price){
		super(price);
	}
	public String toString() {
		return "COMPUTER";
	}
}

class Audio extends Product{
	Audio(int price){
		super(price);
	}
	public String toString() {
		return "Audio";
	}
}
class Buyer{
	int money = 1000;
	int bonusPoint = 0;
	void buy(Product p) {
		if(money < p.price) {
			System.out.println("�ܾ��� �����մϴ�.");
			return;
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		System.out.println(p + "��/�� �����Ͽ����ϴ�.");
		
	}
}
	

public class PolyArgumentTest {

	public static void main(String[] args) {
		Tv t = new Tv(100);
		Computer c = new Computer(150);
		Buyer b = new Buyer();
		
		
		b.buy(t); 
		System.out.println(t.toString());
		b.buy(c);
		b.buy(new Tv(150));
		b.buy(c);
		b.buy(new Audio(200));
		System.out.println("b�� �ܾ��� : " + b.money);
		System.out.println("b�� ���ʽ�����Ʈ�� : " + b.bonusPoint);
//		System.out.println(b.toString()); //b�� Ŭ�����̱� ������ ���ҷ���
	}

}
