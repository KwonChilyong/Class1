package chap08;

interface Negative {
	int neg(int x); // �߻� �޼ҵ�
}

//class Neg implements Negative {
//	public int neg(int i) {
//		return -i;
//	}
//}
public class LamdaDemo {

	public static void main(String[] args) {
//		Neg n = new Neg();
//		System.out.println("5* (-1)  : " + n.neg(5));
		
		Negative nn;
		
		nn = (int x) -> -x;
		
		System.out.println(nn);
		
		
	}

}
