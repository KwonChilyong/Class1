package chap04;
class Ball{  // 클래스(설계도) 생성  , 클래스  = 필드+동작
	double radius = 2.0;  //클래스의 필드 
	
	double getVolume() {  //클래스의 동작
		return 4/3*3.14*radius*radius*radius;
	}
}
public class ClassEx01 { //public class 는 하나 뿐이 못만듬, class 만들려면 public 빼고 class만

	public static void main(String[] args) {
		Ball b = new Ball(); // new 로 해줘야 그 클래스를 가져와서 쓸수있고 속성 바꿀수있음.
		Ball b1 = new Ball(); // 이렇게 new 로 만든 변수들을 참조변수라고 함.
		double d;
		d= b.getVolume();
		System.out.println(d);
		b1.radius = 3.5;     // 같은 클래스지만 속성을 다르게 줌 
		d = b1.getVolume();
		System.out.println(d);

	}

}
