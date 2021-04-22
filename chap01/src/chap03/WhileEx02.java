package chap03;

public class WhileEx02 {

	public static void main(String[] args) {
		int i = 1;
		int sum = 0;
		
		while(i <= 100) {
			sum = sum + i;  // sum += i;
			i++;
		}
		System.out.println("1 부터 100까지의 합은 : " + sum);
		i = 1;
		sum = 0;
		
		while(i <= 100) {
			if(i % 2 == 1)
			   sum = sum + i;  // sum += i;
						
			i++;
		}
		System.out.println("1 부터 100까지의 홀수 합은 : " + sum);
		
		
		
		
		
		
		
		
		
	}

}
