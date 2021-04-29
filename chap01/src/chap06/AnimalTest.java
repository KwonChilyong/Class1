package chap06;

class Animal{
	String eye;
	String mouth;
	
	void eat() {
		System.out.println("먹는다.");
	}
	void sleep() {
		System.out.println("잠잔다.");
	}
}
class Eagle extends Animal{ // extends 로 상속받는다.
	String wing;
	
	void fly(){
		System.out.println("날라 다닌다.");
	}
}
class Tiger extends Animal{
	String leg;
	
	void run() {
		System.out.println("뛰어 다닌다.");
	}
}
class Goldfish extends Animal{
	String fin;
	
	void swim() {
		System.out.println("헤엄친다.");
	}
}
public class AnimalTest {

	public static void main(String[] args) {
		Eagle e1 = new Eagle();
		
		e1.wing = "2개";
		e1.eye = "파란색";   // eagle 안에는 없지만 animal 에 eye mouth 있어서 가능
		e1.mouth = "뾰족하다";
		
		e1.fly();
		e1.eat(); // animal 이 갖고있는 특성도 가능
		
		Tiger t1 = new Tiger();
		
		t1.eat();
		t1.eye="무섭다";
		
	}

}
