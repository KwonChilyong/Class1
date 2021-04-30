package chap06;

class Demo1{
	
}

class Demo2 extends Demo1{
	
}


public class AutoTypeEx {

	public static void main(String[] args) {
		Demo1  d = new Demo1();
		Demo2 d2 = new Demo2();
		Demo1 d1 = new Demo2();  // 부모 타입으로 자식타입 생성 가능
//		Demo2 d3 = new Demo1();  자식 타입으로 부모타입을 생성 불가능
		
		d1 = d2; // 
		d = d2;  // 객체 자동 형변환.
	}

}
