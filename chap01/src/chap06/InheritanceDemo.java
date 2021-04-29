package chap06;

class Demo{
	String str;
	void findLength() {
		System.out.println("길이 이다.");
	}
}

public class InheritanceDemo {

	public static void main(String[] args) {
		Circle c1 = new Circle();
		Ball c2 = new Ball("빨간색");
		Demo d = new Demo();
		
		d.findLength();
//		d.findRadius();  못쓴다 상속을 못받아서.
//		d.findArea();    역시 상속을 못받아서 못씀.
		
		
		
		
		System.out.println("원 : ");
		c1.findRadius();
		c1.findArea();
		
		System.out.println("\n공 : ");
		c2.findRadius();
		c2.findColor();
		c2.findArea();
		c2.findVolume(); // c2 Ball 에는 color,volume 뿐인데 circle 에서 
		                 // 상속받아서 이게 가능한거

	}

}
