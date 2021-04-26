package chap04;

class Person {
	String name;
	int age;
	
	public Person setName(String name) {
		this.name = name;
		return this;            // 연속 호출 사용시 return this 해줘야함.
	}
	
	public Person setAge(int age) {
		this.age = age;
		return this;
	}
	
	public void sayHello() {
		System.out.println("안녕,나는 " + name + "이고 " + age + "살 이야.");
	}
}
public class p149ex {

	public static void main(String[] args) {
		Person person = new Person();
		person.setName("민국").setAge(21).sayHello();
		//.setName().setAge().sayHello();  연속호출방법.
	}

}
