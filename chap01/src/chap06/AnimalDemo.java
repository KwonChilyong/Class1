package chap06;

class Animal1{
	public Animal1(String s) {
		System.out.println("���� : " + s);
	}
}

class Mammal extends Animal1{
	
	public Mammal() {
		super("������");
		System.out.println("������: ������");
	}
	
	public Mammal(String s) {
		super(s);
		System.out.println("������: " +s);
		
	}
	
}
public class AnimalDemo {

	public static void main(String[] args) {
		
		Mammal ape = new Mammal();
		Mammal lion = new Mammal("����");

	}

}
