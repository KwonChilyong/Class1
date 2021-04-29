package chap06;

class Parent{
	String name;
	
	Parent(String name){
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
}

class Child extends Parent{
	String addr;
	
	Child(String name, String addr) {
		super(name); // super �� �׻� �� �տ� �;��Ѵ�.
					 // �θ� Ŭ������ �����ڰ� �����ϸ� �ڽ�Ŭ������ ������ �����ؾ���
		this.addr = addr;
	
	}
	
	public String getInfo() {
		return name + addr;
	}
}





public class InheritanceEx01 {

	public static void main(String[] args) {
		Parent p = new Parent("������");
		
		
		Child c = new Child("ȫ�浿" , "����");
		
		
		System.out.println(c.getInfo());
		

	}

}
