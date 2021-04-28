package chap05;

public class p203Ex3 {

	public static void main(String[] args) {
		
		int a[] = {10,20,30,40,50,60,70,80,90};
		
		for(int i = 0 ; i < a.length ; i++) {
			System.out.println("i : " + i + ", a[i] : " + a[i]);
		}
		
		for(int i : a) { // 여기서 i 는 a에 있는 실제 값을 받아옴 i번째가 아님..
			             // a에는 연속데이터 가 와야함
			System.out.println("i : " + i);
		}
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
//		double[][] interests = { { 3.2, 3.1, 3.2 , 3.0 } ,
//				{ 2.9, 2.8, 2.7, 2.6 }, { 2.7, 2.6, 2.5, 2.7 }};
//		double[] sum1 = { 0.0 , 0.0 , 0.0 };
//		double sum2 = 0.0;
//		
//		for(int i = 0; i < interests.length ; i++) {
//			
////			for(int j = 0; j < interests[i].length ; j++) {
//			for(double j : interests[i]) {
////				sum1[i] += interests[i][j];
//				sum1[i] += j;
//			}
//			
//			
//			System.out.printf("%d차년도 평균 이자율 = %.2f%%\n", i+1, sum1[i]/4);
//			
//			sum2 += sum1[i];
//		}
//		System.out.printf("3년간 평균 이자율 = %.2f%%\n", sum2 /3);
//		
//		
//
//	}
//
//}
