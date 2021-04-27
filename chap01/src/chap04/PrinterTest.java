package chap04;
//class Printer {

//	int numOfPapers=0;
//	void print(int amount) {
//		if(amount <= numOfPapers) {
//		System.out.println(amount + "장을 출력합니다.");
//		System.out.println("남은 용지는 : " + (numOfPapers - amount));
//		}else {
//			System.out.println("용지가 부족합니다.");
//		}
//	}
//}
//public class PrinterTest {
//
//	public static void main(String[] args) {
//		Printer prt = new Printer();
//		prt.numOfPapers = 100;
//		prt.print(70);
//	}
//
//}   //도전과제 1번 까지

//class Printer {
//	private int numOfPapers=0;
//	
//	Printer(int numOfPapers){
//		this.numOfPapers = numOfPapers;        // 생성자 초기화
//	}
//	void print(int amount) {
//		if(numOfPapers == 0) {
//			System.out.println("용지가 없습니다.");
//			return;  // return 해줘야 용지없을때 아래 if else 가 작동안함  
//		}
//		if(amount <= numOfPapers) {
//			System.out.print(amount + "장을 출력했습니다. ");
//			numOfPapers -= amount;
//			System.out.println("현재 " + numOfPapers + "장 남아 있습니다");
//			}else {
//			System.out.print("모두 출력하려면 용지가 "+ (amount - numOfPapers) + "매 부족합니다. ");
//			System.out.println(numOfPapers + "장만 출력합니다.");
//			
//			numOfPapers = 0;
//		}
//	}
//}
//public class PrinterTest {
//
//	public static void main(String[] args) {
//		Printer p = new Printer(10);
//		p.print(2);
//		p.print(20);
//		p.print(10);
//
//	}
//
//} // 도전과제 2번 까지

//class Printer {
//	private int numOfPapers = 0;
//	private boolean duplex;
//
//	public Printer(int numOfPapers, boolean duplex) {
//		this.numOfPapers = numOfPapers; // 생성자 초기화
//		this.duplex = duplex;
//	}
//
//	public int getNumOfPapers() {
//		return numOfPapers;
//	}
//
//	public void setNumOfPapers(int numOfPapers) {
//		this.numOfPapers = numOfPapers;
//	}
//
//	public boolean isDuplex() { // get 이 아니라 is
//		return duplex;
//	}
//
//	public void setDuplex(boolean duplex) {
//		this.duplex = duplex;
//	}
//
//	void print(int amount) {
//		if (numOfPapers == 0) {
//			System.out.println("용지가 없습니다.");
//			return; // return 해줘야 용지없을때 아래 if else 가 작동안함
//		}
//
//		if (duplex) { // 이미 duplex 자체가 true false 를 갖고 있어서 duplex 만 써줌
//			int countPapers = amount % 2 == 0 ? amount / 2: amount % 2 + 1;
//			if (countPapers <= numOfPapers) {
//				System.out.print("양면으로 "+ countPapers + "장을 출력했습니다. ");
//				numOfPapers -= countPapers;
//				System.out.println("현재 " + numOfPapers + "장 남아 있습니다");
//			} else {
//				System.out.print("모두 출력하려면 용지가 " + (countPapers - numOfPapers) + "매 부족합니다. ");
//				System.out.println(numOfPapers + "장만 출력합니다.");
//
//				numOfPapers = 0;
//			}
//		} else {
//
//			if (amount <= numOfPapers) {
//				System.out.print(amount + "장을 출력했습니다. ");
//				numOfPapers -= amount;
//				System.out.println("현재 " + numOfPapers + "장 남아 있습니다");
//			} else {
//				System.out.print("단면으로 모두 출력하려면 용지가 " + (amount - numOfPapers) + "매 부족합니다. ");
//				System.out.println(numOfPapers + "장만 출력합니다.");
//
//				numOfPapers = 0;
//			}
//		}
//	}
//}
//
//public class PrinterTest {
//
//	public static void main(String[] args) {
//		Printer p = new Printer(20, true);
//		p.print(25);
//		p.setDuplex(false);
//		p.print(10);
//
//	}
//
//} //도전 과제 3번까지.


