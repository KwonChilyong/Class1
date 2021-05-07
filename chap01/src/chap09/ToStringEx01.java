package chap09;

class Demo{
	int no;
	String name;
	
	Demo(int no , String name){
		this.no = no;
		this.name = name;
	}
//	public String toString() {
//		return no + " " + name;
//	}
//	public int hashCode() {
//		String result;
//		result = no + name;
//		return result.hashCode();
//	}
//	public boolean equals(Object o) {
//		if(this.hashCode() == o.hashCode()) {
//			return true;
//		}else {
//			return false;
//		}
//	}
}

public class ToStringEx01 {

	public static void main(String[] args) {
		Demo d = new Demo(1, "abc");
//		System.out.println(d); �̰͸� �ϸ� �ּҰ� ���
//		System.out.println(d.toString()); // �׳� �̰͸� ���� �������� �Ȱ��� toString�� �������ִٰ� ����Ǵµ�.. class �� �������̵� �ؼ� ���� �Ʒ��� �Ȱ��� 
//		System.out.println(d.no + " " + d.name);
//		System.out.println(d.hashCode()); // �ּҰ� ���
//		Demo d1 = new Demo(1, "abc");
//		System.out.println(d1.hashCode()); 
//		System.out.println(d1);
//		
//		System.out.println(d.hashCode() == d1.hashCode());
//		System.out.println(d.equals(d1)); // equals �� �������̵� �����..
		
		String s1;
		s1="abc";
		System.out.println(s1.hashCode());
		s1="abc1";
		System.out.println(s1.hashCode());
		s1="ddd";
		System.out.println(s1.hashCode());
		s1="abc";
		System.out.println(s1.hashCode());
		
		StringBuilder s2 = new StringBuilder("hi");
		System.out.println(s2);
		System.out.println(s2.hashCode());
		s2.append("java");  // hi �ڿ� �̾ ���� �ּҰ��� ����.
		System.out.println(s2);
		System.out.println(s2.hashCode());
		
		System.out.println(s2.capacity());
		
		StringBuilder s3 = new StringBuilder("hi");
		StringBuilder s4 = new StringBuilder("hi java");
		StringBuilder s5 = new StringBuilder("");
		
//		capacity() ������ ũ��
		
		System.out.println(s3.capacity());
		System.out.println(s4.capacity());
		System.out.println(s5.capacity()); // ������ �⺻ũ�� 16
		
		s4.delete(0, 3); // ���ڿ� �Ϻκ��� ���ۿ��� ����
		System.out.println(s4);
		
		s4.replace(0, 4, "abc"); // ���ڿ��� �Ϻκ��� "" ���ڿ��� ��ü
		System.out.println(s4);
		
		StringBuffer ss = new StringBuffer("abc");
		System.out.println(ss);
		
	}

}
