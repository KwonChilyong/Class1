package chap04;

public class ClassEx04 {
	static double radius; // 필드 , static이 앞에 붙으면 main 에서 참조변수쓰고 
						  // 여러개의 radius 를 불러도 static은 하나만의 값을 저장한다는 느낌.
						  // 제일 나중에 쓴 값을 저장하는것 같다.
	
	static double findArea() {  // 메소드 
		return 3.14*radius*radius;
	}
	
	static void show(double x, double y) { //메소드
		System.out.printf("반지름 = %.1f , 넓이 = %.1f\n", x, y);
	}
	public static void main(String[] args) { 
		ClassEx04 c = new ClassEx04(); 
		c.radius = 10.0; // 같은 class 안에 있기때문에 바로 호출 가능.
		c.radius = 20.0;
		double area = findArea();
		
		
		
		ClassEx04 c1 = new ClassEx04();
		c1.radius = 30.0;
		c.show(radius, area);
		c1.show(radius, area);

	}

}
