package chap03;

public class MethodEx03 {
	public static void echo(String s, int n) {
		for(int i = 0 ; i < n ; i++)
			prt(s);
	}
	
	public static void prt(String s) {
		System.out.println(s);              //�̰� �������ν� syso �Ⱦ��� prt �� �ᵵ ��
	}
	public static void main(String[] args) {
		String name = "ȫ�浿";
		echo(name, 1);
		echo("�ȳ�!", 3); // �żҵ� ȣ��
		prt("������������");
		
	}

}
