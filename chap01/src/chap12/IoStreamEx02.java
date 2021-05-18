package chap12;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IoStreamEx02 {

	public static void main(String[] args) {
		String input = "D:\\workspace\\chap01\\��ġ ����.mp4";
		String output = "D:\\workspace\\chap01\\��ġ ����-1.mp4";
		
//		String input = "D:\\workspace\\chap01\\data.txt";
//		String output= "D:\\workspace\chap01\\dataout.txt";
		
		try {
			FileInputStream fis = new FileInputStream(input);
			FileOutputStream fos = new FileOutputStream(output); //���Ͽ��� ������
			
			BufferedInputStream bis1 = new BufferedInputStream(fis,4096);
			BufferedInputStream bis = new BufferedInputStream(fis);
			BufferedOutputStream bos = new BufferedOutputStream(fos); //buffer�� �޸𸮿��� �о��
			BufferedOutputStream bos1 = new BufferedOutputStream(fos,4096); // ,���ڴ� �ѹ��� �������ִ� ����ũ��
			// ���۰� �ӵ��� ���� ������ ���� ���� 
			int c;
			long start, end, duration;
			start = System.nanoTime();
//			try {
//				while((c = bis.read()) != -1) {
//					fos.write(c);
//				}
//			try {
//				while((c = fis.read()) != -1) {
//					fos.write(c);
//				}
//				
//			System.out.println("���簡 �������ϴ�.");
//			end = System.nanoTime();
//			duration = end - start;
//			System.out.println("����ð� : " + duration );  // ���� ���� �ϴµ� �ɸ��� �ð�
//			
			start = System.nanoTime();
			try {
				while(bis.available() > 0) {
					c = bis.read();
					bos.write(c);
				}
				bos.flush();
				System.out.println("���簡 �������ϴ�.");
				end = System.nanoTime();
				duration = end - start;
				System.out.println("bis s����ð� : " + duration );  // ���� ���� �ϴµ� �ɸ��� �ð�
			
			} catch (IOException e) {

			}
			
			try {
				while(bis1.available() > 0) {
					c = bis1.read();
					bos1.write(c);
				}
				bos1.flush();
				System.out.println("���簡 �������ϴ�.");
				end = System.nanoTime();
				duration = end - start;
				System.out.println("bis1 ����ð� : " + duration );  // ���� ���� �ϴµ� �ɸ��� �ð�
			
			} catch (IOException e) {

			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//	} catch (FileNotFoundException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}

}

}
