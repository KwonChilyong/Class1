package chap06;

//class Girl{
//	String name;
//}
//
//class GoodGirl extends Girl{
//	void show(){
//		System.out.println("�׳�� �ڹٸ� �� �ȴ�.");
//	}
//}
//
//class BestGirl extends GoodGirl{
//	void show() {
//		System.out.println("�׳�� �ڹٸ� �����ϰ� �� �ȴ�.");
//	}
//}
//
//public class p242ex01 {
//
//	public static void main(String[] args) {
//		Girl g1 = new Girl();
//		Girl g2 = new GoodGirl();
//		GoodGirl gg = new BestGirl();
////		�����س�   gg = new ���������� 
//		
////		g2.show(); Girl ���� �̸� ���� ���� .. show �� �ڽ��� show�� ��� x
//		gg.show(); // GoodGirl �� show() �־ ����.
//
//	}
//
//}


// ex 02
//class Girl{
//	private String name;
//	Girl(){
//		
//	}  //����Ʈ ������
//	
//	void show() {
//		System.out.println("�׳�� �ڹ� �ʺ����̴�.");
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
//		System.out.println("�׳�� �ڹٸ� �� �ȴ�.");
//	}
//}
//
//class BestGirl extends GoodGirl{
////	BestGirl(String name){
////		super(name);
////	}
//	void show() {
//		System.out.println("�׳�� �ڹٸ� �����ϰ� �� �ȴ�.");
//	}
//}
//
//public class p242ex01 {
//
//	public static void main(String[] args) {
//		Girl g1 = new Girl();
//		Girl g2 = new GoodGirl();
//		GoodGirl gg = new BestGirl();
////		�����س�   gg = new ���������� 
//		
//		g2.show(); //Girl �� show() �־ ���� ����
//		gg.show(); // GoodGirl �� show() �־ ����.
//
//	}
//
//}

//  ex 03
class Girl{
	protected String name;
	
	void show() {
		System.out.println(name + "�� �ڹ� �ʺ����̴�.");
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
		System.out.println(name + "�� �ڹٸ� �� �ȴ�.");
	}
}

class BestGirl extends GoodGirl{
	BestGirl(String name){
		super(name);
	}
	void show() {
		System.out.println(name + "�� �ڹٸ� �����ϰ� �� �ȴ�.");
	}
}

public class p242ex01 {

	public static void main(String[] args) {
		Girl[] girls = {new Girl("������"), 
				new GoodGirl("����"), 
				new BestGirl("Ȳ����")};
		
		for (Girl g : girls)
			g.show();
		
 
    	}

}