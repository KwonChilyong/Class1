package chap10;

class Entry<K, V>{
	private K key;
	private V value;
	
	public Entry(K key, V value) {
		this.key = key;
		this.value = value;
	}

	public K getKey() {
		return key;
	}

	public void setKey(K key) {
		this.key = key;
	}

	public V getValue() {
		return value;
	}

	public void setValue(V value) {
		this.value = value;
	}
	
	
}
public class GenericClassEx03 {

	public static void main(String[] args) {
		Entry<String, Integer> e1 = new Entry<>("김선달", 20); // 뒤쪽 <> 생략가능
		Entry<String, String> e2 = new Entry("기타", "등등");
		
//		Entry<int, String> e3 = new Entry(30, "아무개");  int 는 기초타입으로 쓸수 없다. 정수는 Integer 를 써줘야함
		                                        //     double은 Double 대문자로 시작하면 됨 ㅇ
		
		System.out.println(e1.getKey() + " " + e1.getValue());
		System.out.println(e2.getKey() + " " + e2.getValue());

	}

}
