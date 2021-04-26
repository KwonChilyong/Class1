package chap04;
class Circle {
	private double radius; // private = 캡슐화 (은닉화), 같은 class 내에서만 접근가능
	                       // 외부의 클래스나 메소드에서는 접근 안됨.
						   // 외부의 클래스에서 접근하기 위해서는 get,set 필요
	
	Circle() {
		
	}          // 원래는 자동으로 생성되는데 다른 생성자가 존재한다면 만들어줘야함.
			   // 생성자 쓸때는 앞에 public 생략해도 된다.
	Circle(double radius) {
		this.radius = radius;  
	}                         // 생성자 오버로딩 (똑같은 이름의 생성자를 만듬)
	
	public void setRadius(double radius) {
		if(radius > 0 ) {
		this.radius = radius; // this. 붙이면 현재 class의 필드
		}else {
			System.out.println("반지름은 0보다 큰수를 입력하시오");
			return;
		}
			//priavte 에서는 set 부분에 제약조건을 주는것도 방법
	}
	
	public double getRadius() {
		return radius;
	}
	//private 에는 반드시 get,set 만들어줘야한다. 마우스 우클릭, source 에 있다 
	public double findArea() {
		return 2.14 * radius * radius;
	}


}
public class PrivateEx01 {

	public static void main(String[] args) {
		Circle c1 = new Circle();
		Circle c2 = new Circle(3.5); 
//		c1.radius = 2.5;
//		System.out.println(c1.radus); 
		
		c1.setRadius(2.5);  // 외부에서 접근하려면 private 클래스 내에 메소드를 만들어줘야 접근가능
		System.out.println(c1.findArea());
		System.out.println(c1.getRadius());
		
		System.out.println(c2.findArea());
		System.out.println(c2.getRadius());
	}

}
