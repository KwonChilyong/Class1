package chap06;

class Animal1{
	public Animal1(String s) {
		System.out.println("동물 : " + s);
	}
}

class Mammal extends Animal1{
	
	public Mammal() {
		super("원숭이");
		System.out.println("포유류: 원숭이");
	}
	
	public Mammal(String s) {
		super(s);
		System.out.println("포유류: " +s);
		
	}
	
}
public class AnimalDemo {

	public static void main(String[] args) {
		
		Mammal ape = new Mammal();
		Mammal lion = new Mammal("사자");

	}

}
