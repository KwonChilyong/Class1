package chap10;

//class Cup{ 
//	private Beer beverage;
//
//	public Beer getBeverage() {
//		return beverage;
//	}
//	public void setBeverage(Beer beverage) {
//		this.beverage = beverage;
//	}
	
//}
//
//class Cup1{
//	private Boricha beverage;
//
//	public Boricha getBeverage() {
//		return beverage;
//	}
//	public void setBeverage(Boricha beverage) {
//		this.beverage = beverage;
//	}
//}

//--- 매번 다른 음료 종류에 따라 cup1,cup2 ... 계속 클래스를 만들어야 하니 제네릭 클래스 만든다.

class Cup<T>{  //제네릭 클래스 <타입>
	private T beverage;
	
	public T getBeverage() {
		return beverage;
	}
	public void setBeverage(T beverage) {
		this.beverage = beverage;
	}
}
	
class Beer{
	
}

class Boricha{
	
}

public class GenericClassEx01 {

	public static void main(String[] args) {
		Cup<Boricha> c = new Cup<Boricha>();
		Cup<Beer> c1 = new Cup<Beer>();

	}

}
