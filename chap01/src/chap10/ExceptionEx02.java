package chap10;

public class ExceptionEx02 {

	public static void main(String[] args) {
		int[] array = {0, 1, 2};
		
		try {
		System.out.println(array[0]);
		System.out.println(array[3]);
		}catch(ArrayIndexOutOfBoundsException e) { //�������� e �־��ֱ�
			e.printStackTrace();
		}
		

	}

}
