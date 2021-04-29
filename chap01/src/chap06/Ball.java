package chap06;

public class Ball extends Circle {
	private String color;
	
	public Ball(String color) {
		this.color = color;
	}
	
	@Override   // 이 뒤쪽에 나오는 메소드는 부모 클래스의 메소드를 오버라이딩 한것 이라는 표시
	public void findArea() {
		findRadius(); // protected라 상속받은 자식은 가능
		super.findArea(); // 오버라이딩하면 부모 클래스의 오버라이딩된 메소드를 숨김
		                  // 이때 숨겨진 메소드를 다시 호출할때 super 사용
//		super.secret(); error 뜸 secret 메소드 가 private 라 호출 못함
		
		System.out.println("넓이는 (π*반지름*반지름*반지름)이다.");
	} //상속 받은거를 고치는걸 오버라이딩.
	
	public void findColor() {
		System.out.println(color + " 공이다.");
	}
	
	public void findVolume() {
		System.out.println("부피는 4/3*(π*반지름*반지름*반지름)이다.");
	}
}
