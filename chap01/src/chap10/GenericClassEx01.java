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

//--- �Ź� �ٸ� ���� ������ ���� cup1,cup2 ... ��� Ŭ������ ������ �ϴ� ���׸� Ŭ���� �����.

class Cup<T>{  //���׸� Ŭ���� <Ÿ��>
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
