package chap13;


public class ThreadEx01 {

	public static void main(String[] args) {
		Thread t = new Thread(new MyRunnable());
		t.start();
		
		for(int i = 0 ; i<5 ; i++) {
			System.out.print("�ȳ�. ");
			
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
		}
	}

}
class MyRunnable implements Runnable{
	public void run() {
		for(int i = 0 ; i<5 ; i++) {
			System.out.print("�߰�. ");
			
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
			
			}
		}
	}

