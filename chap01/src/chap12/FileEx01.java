package chap12;

import java.io.File;

public class FileEx01 {

	public static void main(String[] args) {
		File file = new File("D:\\workspace\\chap01");
		File[] fs = file.listFiles();
		
		for(File f : fs) {
			if(f.isDirectory()) {
				System.out.printf("dir : %s\n", f.getName()); //.getName 하면 경로빼고 이름만 출력
			}else {
				System.out.printf("file: %s(%d bytes)\n", f.getName(), f.length());
			}
//		File 객체가 폴더면 폴더경로를 출력, 파일이면 파일경로를 출력하게끔 한것 (.getName 하면 경로 빠지고 이름만 출력됨)
		}

	}

}
