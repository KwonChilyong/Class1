package chap06;

class Animal{
	String eye;
	String mouth;
	
	void eat() {
		System.out.println("�Դ´�.");
	}
	void sleep() {
		System.out.println("���ܴ�.");
	}
}
class Eagle extends Animal{ // extends �� ��ӹ޴´�.
	String wing;
	
	void fly(){
		System.out.println("���� �ٴѴ�.");
	}
}
class Tiger extends Animal{
	String leg;
	
	void run() {
		System.out.println("�پ� �ٴѴ�.");
	}
}
class Goldfish extends Animal{
	String fin;
	
	void swim() {
		System.out.println("���ģ��.");
	}
}
public class AnimalTest {

	public static void main(String[] args) {
		Eagle e1 = new Eagle();
		
		e1.wing = "2��";
		e1.eye = "�Ķ���";   // eagle �ȿ��� ������ animal �� eye mouth �־ ����
		e1.mouth = "�����ϴ�";
		
		e1.fly();
		e1.eat(); // animal �� �����ִ� Ư���� ����
		
		Tiger t1 = new Tiger();
		
		t1.eat();
		t1.eye="������";
		
	}

}
