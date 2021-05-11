package chap10;

public class ExceptionEx03 {

	public static void main(String[] args) {
		int dividend= 10;
		
		try { //try 실행부에서 예외가 발생시 catch 로 해결
		int divisor= Integer.parseInt(args[0]);
		System.out.println(dividend / divisor);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("원소가 존재하지 않습니다.");
		}catch(NumberFormatException e) { // Run configurations 에 argument에 abc 입력했을때 나온 오류
			System.out.println("숫자가 아닙니다.");
		}catch(ArithmeticException e) { // argument에 0 입력시
			System.out.println("0으로는 나눌 수 없습니다.");
		}catch(Exception e) {
			System.out.println("기타 알 수 없는 에러 입니다.");
		}finally {
			System.out.println("항상 실행됩니다.");
		}
		
	}

}
