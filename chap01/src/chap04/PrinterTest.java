package chap04;
//class Printer {

//	int numOfPapers=0;
//	void print(int amount) {
//		if(amount <= numOfPapers) {
//		System.out.println(amount + "���� ����մϴ�.");
//		System.out.println("���� ������ : " + (numOfPapers - amount));
//		}else {
//			System.out.println("������ �����մϴ�.");
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
//}   //�������� 1�� ����

//class Printer {
//	private int numOfPapers=0;
//	
//	Printer(int numOfPapers){
//		this.numOfPapers = numOfPapers;        // ������ �ʱ�ȭ
//	}
//	void print(int amount) {
//		if(numOfPapers == 0) {
//			System.out.println("������ �����ϴ�.");
//			return;  // return ����� ���������� �Ʒ� if else �� �۵�����  
//		}
//		if(amount <= numOfPapers) {
//			System.out.print(amount + "���� ����߽��ϴ�. ");
//			numOfPapers -= amount;
//			System.out.println("���� " + numOfPapers + "�� ���� �ֽ��ϴ�");
//			}else {
//			System.out.print("��� ����Ϸ��� ������ "+ (amount - numOfPapers) + "�� �����մϴ�. ");
//			System.out.println(numOfPapers + "�常 ����մϴ�.");
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
//} // �������� 2�� ����

//class Printer {
//	private int numOfPapers = 0;
//	private boolean duplex;
//
//	public Printer(int numOfPapers, boolean duplex) {
//		this.numOfPapers = numOfPapers; // ������ �ʱ�ȭ
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
//	public boolean isDuplex() { // get �� �ƴ϶� is
//		return duplex;
//	}
//
//	public void setDuplex(boolean duplex) {
//		this.duplex = duplex;
//	}
//
//	void print(int amount) {
//		if (numOfPapers == 0) {
//			System.out.println("������ �����ϴ�.");
//			return; // return ����� ���������� �Ʒ� if else �� �۵�����
//		}
//
//		if (duplex) { // �̹� duplex ��ü�� true false �� ���� �־ duplex �� ����
//			int countPapers = amount % 2 == 0 ? amount / 2: amount % 2 + 1;
//			if (countPapers <= numOfPapers) {
//				System.out.print("������� "+ countPapers + "���� ����߽��ϴ�. ");
//				numOfPapers -= countPapers;
//				System.out.println("���� " + numOfPapers + "�� ���� �ֽ��ϴ�");
//			} else {
//				System.out.print("��� ����Ϸ��� ������ " + (countPapers - numOfPapers) + "�� �����մϴ�. ");
//				System.out.println(numOfPapers + "�常 ����մϴ�.");
//
//				numOfPapers = 0;
//			}
//		} else {
//
//			if (amount <= numOfPapers) {
//				System.out.print(amount + "���� ����߽��ϴ�. ");
//				numOfPapers -= amount;
//				System.out.println("���� " + numOfPapers + "�� ���� �ֽ��ϴ�");
//			} else {
//				System.out.print("�ܸ����� ��� ����Ϸ��� ������ " + (amount - numOfPapers) + "�� �����մϴ�. ");
//				System.out.println(numOfPapers + "�常 ����մϴ�.");
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
//} //���� ���� 3������.


