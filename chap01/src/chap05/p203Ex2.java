package chap05;

public class p203Ex2 {

	public static void main(String[] args) {
		System.out.println(sum(1, 2, 3, 4));
		int arr[] = { 2, 3};
		System.out.println(sum(1, arr));  // arr int 타입이라 가능
		System.out.println(sum(1, 2, 3, 4, 5));
		
	}
	public static int sum(int x,int ... v) { //  같은타입이 연속으로 오면 ... 쓰고
		                                     //  v라는 가상배열 만듬 
		int sum = 0;
		for(int i: v) {  // 1은 안더해줌 int x
			sum += i;
		}
		return sum;
	}   
	
	
}
