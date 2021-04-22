package chap02;

public class Ex03 {

	public static void main(String[] args) {
		int i;
		double d;
		byte b;
		
		i = 7 / 4;
		System.out.println(i);
		d = 7 / 4;
		System.out.println(d);
		d = 7 / (double)4;
		System.out.println(d);
		
		i =(int) (7 / (double)4);
		
		i = 100;
		if(i < Byte.MIN_VALUE || i > Byte.MAX_VALUE)
			System.out.println("byte 타입으로 변환 불가");
		else
			b = (byte)i;
	}

}
