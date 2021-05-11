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
		Entry<String, Integer> e1 = new Entry<>("�輱��", 20); // ���� <> ��������
		Entry<String, String> e2 = new Entry("��Ÿ", "���");
		
//		Entry<int, String> e3 = new Entry(30, "�ƹ���");  int �� ����Ÿ������ ���� ����. ������ Integer �� �������
		                                        //     double�� Double �빮�ڷ� �����ϸ� �� ��
		
		System.out.println(e1.getKey() + " " + e1.getValue());
		System.out.println(e2.getKey() + " " + e2.getValue());

	}

}
