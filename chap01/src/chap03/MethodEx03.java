package chap03;

public class MethodEx03 {
	public static void echo(String s, int n) {
		for(int i = 0 ; i < n ; i++)
			prt(s);
	}
	
	public static void prt(String s) {
		System.out.println(s);              //이걸 해줌으로써 syso 안쓰고 prt 로 써도 됨
	}
	public static void main(String[] args) {
		String name = "홍길동";
		echo(name, 1);
		echo("안녕!", 3); // 매소드 호출
		prt("하하하하하하");
		
	}

}
