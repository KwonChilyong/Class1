package chap05;

public class p203Ex2 {

	public static void main(String[] args) {
		System.out.println(sum(1, 2, 3, 4));
		int arr[] = { 2, 3};
		System.out.println(sum(1, arr));  // arr int Ÿ���̶� ����
		System.out.println(sum(1, 2, 3, 4, 5));
		
	}
	public static int sum(int x,int ... v) { //  ����Ÿ���� �������� ���� ... ����
		                                     //  v��� ����迭 ���� 
		int sum = 0;
		for(int i: v) {  // 1�� �ȴ����� int x
			sum += i;
		}
		return sum;
	}   
	
	
}
