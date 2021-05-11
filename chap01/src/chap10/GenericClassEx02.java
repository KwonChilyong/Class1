package chap10;

class Demo<T>{
	T parameter;
	
	Demo(T parameter){
		this.parameter = parameter;
	}
	public void print() {
		System.out.println(parameter);
	}
}

public class GenericClassEx02 {

	public static void main(String[] args) {
		Demo<Integer> d = new Demo<Integer>(10);      // <> 생략가능
//		d.parameter = 10;
		d.print();
		Demo<String> d1 = new Demo("abc");
//		d1.parameter = "abc";
		d1.print();
	}

}
