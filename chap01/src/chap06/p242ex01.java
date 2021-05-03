package chap06;

//class Girl{
//	String name;
//}
//
//class GoodGirl extends Girl{
//	void show(){
//		System.out.println("그녀는 자바를 잘 안다.");
//	}
//}
//
//class BestGirl extends GoodGirl{
//	void show() {
//		System.out.println("그녀는 자바를 무지하게 잘 안다.");
//	}
//}
//
//public class p242ex01 {
//
//	public static void main(String[] args) {
//		Girl g1 = new Girl();
//		Girl g2 = new GoodGirl();
//		GoodGirl gg = new BestGirl();
////		물려준놈   gg = new 물려받은놈 
//		
////		g2.show(); Girl 에는 이름 뿐이 없음 .. show 는 자식의 show라 사용 x
//		gg.show(); // GoodGirl 에 show() 있어서 가능.
//
//	}
//
//}


// ex 02
//class Girl{
//	private String name;
//	Girl(){
//		
//	}  //디폴트 생성자
//	
//	void show() {
//		System.out.println("그녀는 자바 초보자이다.");
//	}
//	
//	Girl(String name) {
//		this.name = name;
//	}
//}
//
//class GoodGirl extends Girl{
////	GoodGirl(String name) {
////		super(name);
////	}
//	void show(){
//		System.out.println("그녀는 자바를 잘 안다.");
//	}
//}
//
//class BestGirl extends GoodGirl{
////	BestGirl(String name){
////		super(name);
////	}
//	void show() {
//		System.out.println("그녀는 자바를 무지하게 잘 안다.");
//	}
//}
//
//public class p242ex01 {
//
//	public static void main(String[] args) {
//		Girl g1 = new Girl();
//		Girl g2 = new GoodGirl();
//		GoodGirl gg = new BestGirl();
////		물려준놈   gg = new 물려받은놈 
//		
//		g2.show(); //Girl 에 show() 있어서 이제 가능
//		gg.show(); // GoodGirl 에 show() 있어서 가능.
//
//	}
//
//}

//  ex 03
class Girl{
	protected String name;
	
	void show() {
		System.out.println(name + "는 자바 초보자이다.");
	}
	
	Girl(String name) {
		this.name = name;
	}
}

class GoodGirl extends Girl{
	GoodGirl(String name) {
		super(name);
	}
	void show(){
		System.out.println(name + "는 자바를 잘 안다.");
	}
}

class BestGirl extends GoodGirl{
	BestGirl(String name){
		super(name);
	}
	void show() {
		System.out.println(name + "는 자바를 무지하게 잘 안다.");
	}
}

public class p242ex01 {

	public static void main(String[] args) {
		Girl[] girls = {new Girl("갑순위"), 
				new GoodGirl("콩쥐"), 
				new BestGirl("황진이")};
		
		for (Girl g : girls)
			g.show();
		
 
    	}

}