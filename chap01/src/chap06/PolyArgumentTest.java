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
			System.out.println("잔액이 부족합니다.");
			return;
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		System.out.println(p + "을/를 구입하였습니다.");
		
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
		System.out.println("b의 잔액은 : " + b.money);
		System.out.println("b의 보너스포인트는 : " + b.bonusPoint);
//		System.out.println(b.toString()); //b는 클래스이기 때문에 못불러옴
	}

}
