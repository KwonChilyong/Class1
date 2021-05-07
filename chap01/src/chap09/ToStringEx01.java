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
//		System.out.println(d); 이것만 하면 주소가 출력
//		System.out.println(d.toString()); // 그냥 이것만 쓰면 위에꺼랑 똑같음 toString이 생략되있다고 보면되는듯.. class 에 오버라이딩 해서 쓰면 아래랑 똑같음 
//		System.out.println(d.no + " " + d.name);
//		System.out.println(d.hashCode()); // 주소값 출력
//		Demo d1 = new Demo(1, "abc");
//		System.out.println(d1.hashCode()); 
//		System.out.println(d1);
//		
//		System.out.println(d.hashCode() == d1.hashCode());
//		System.out.println(d.equals(d1)); // equals 도 오버라이딩 해줘야..
		
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
		s2.append("java");  // hi 뒤에 이어서 들어가고 주소값은 같다.
		System.out.println(s2);
		System.out.println(s2.hashCode());
		
		System.out.println(s2.capacity());
		
		StringBuilder s3 = new StringBuilder("hi");
		StringBuilder s4 = new StringBuilder("hi java");
		StringBuilder s5 = new StringBuilder("");
		
//		capacity() 버퍼의 크기
		
		System.out.println(s3.capacity());
		System.out.println(s4.capacity());
		System.out.println(s5.capacity()); // 버퍼의 기본크기 16
		
		s4.delete(0, 3); // 문자열 일부분을 버퍼에서 제거
		System.out.println(s4);
		
		s4.replace(0, 4, "abc"); // 문자열의 일부분을 "" 문자열로 대체
		System.out.println(s4);
		
		StringBuffer ss = new StringBuffer("abc");
		System.out.println(ss);
		
	}

}
