package chap12;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IoStreamEx02 {

	public static void main(String[] args) {
		String input = "D:\\workspace\\chap01\\설치 영상.mp4";
		String output = "D:\\workspace\\chap01\\설치 영상-1.mp4";
		
//		String input = "D:\\workspace\\chap01\\data.txt";
//		String output= "D:\\workspace\chap01\\dataout.txt";
		
		try {
			FileInputStream fis = new FileInputStream(input);
			FileOutputStream fos = new FileOutputStream(output); //파일에서 가져옴
			
			BufferedInputStream bis1 = new BufferedInputStream(fis,4096);
			BufferedInputStream bis = new BufferedInputStream(fis);
			BufferedOutputStream bos = new BufferedOutputStream(fos); //buffer는 메모리에서 읽어옴
			BufferedOutputStream bos1 = new BufferedOutputStream(fos,4096); // ,숫자는 한번에 나를수있는 버퍼크기
			// 버퍼가 속도가 좀더 빠르니 버퍼 쓰자 
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
//			System.out.println("복사가 끝났습니다.");
//			end = System.nanoTime();
//			duration = end - start;
//			System.out.println("복사시간 : " + duration );  // 파일 복사 하는데 걸리는 시간
//			
			start = System.nanoTime();
			try {
				while(bis.available() > 0) {
					c = bis.read();
					bos.write(c);
				}
				bos.flush();
				System.out.println("복사가 끝났습니다.");
				end = System.nanoTime();
				duration = end - start;
				System.out.println("bis s복사시간 : " + duration );  // 파일 복사 하는데 걸리는 시간
			
			} catch (IOException e) {

			}
			
			try {
				while(bis1.available() > 0) {
					c = bis1.read();
					bos1.write(c);
				}
				bos1.flush();
				System.out.println("복사가 끝났습니다.");
				end = System.nanoTime();
				duration = end - start;
				System.out.println("bis1 복사시간 : " + duration );  // 파일 복사 하는데 걸리는 시간
			
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
