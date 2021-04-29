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
		super(name); // super 는 항상 맨 앞에 와야한다.
					 // 부모 클래스에 생성자가 존재하면 자식클래스에 생성자 생성해야함
		this.addr = addr;
	
	}
	
	public String getInfo() {
		return name + addr;
	}
}





public class InheritanceEx01 {

	public static void main(String[] args) {
		Parent p = new Parent("개똥이");
		
		
		Child c = new Child("홍길동" , "대전");
		
		
		System.out.println(c.getInfo());
		

	}

}
