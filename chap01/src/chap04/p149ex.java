package chap04;

class Person {
	String name;
	int age;
	
	public Person setName(String name) {
		this.name = name;
		return this;            // ���� ȣ�� ���� return this �������.
	}
	
	public Person setAge(int age) {
		this.age = age;
		return this;
	}
	
	public void sayHello() {
		System.out.println("�ȳ�,���� " + name + "�̰� " + age + "�� �̾�.");
	}
}
public class p149ex {

	public static void main(String[] args) {
		Person person = new Person();
		person.setName("�α�").setAge(21).sayHello();
		//.setName().setAge().sayHello();  ����ȣ����.
	}

}
