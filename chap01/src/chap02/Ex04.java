package chap02;

public class Ex04 {

	public static void main(String[] args) {
		int x = 123;
		double y = 12345.567;
		
		System.out.println(x);
		System.out.println(y);

//		System.out.printf("format",data);
		System.out.println("**************");
		System.out.printf("%d\n",x);
		System.out.printf("%f\n",y);
		System.out.println("**************");
		System.out.printf("%5d\n",x);
		System.out.printf("%10.2f\n",y);
		System.out.println("**************");
		System.out.printf("%-5d\n",x);
		System.out.printf("%-10.2f\n",y);
		System.out.println("**************");
		System.out.printf("%05d\n",x);
		System.out.printf("%010.2f\n",y);
		
		String name = "ȫ�浿";
		System.out.println("**************");
		System.out.printf("%s\n",name);
		System.out.printf("%10s\n",name);
		System.out.printf("%-10s\n",name);
		
		
		
		
		
	}

}
