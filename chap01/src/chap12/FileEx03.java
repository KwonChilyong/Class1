package chap12;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileEx03 {

	public static void main(String[] args) {
		String currPath = "d:\\workspace\\chap01";
		File dir = new File(currPath);
		
		File[] files = dir.listFiles();
		int filesCnt =  0; // 파일 갯수 몇갠지 알려고 
		
		for(int i = 0 ; i < files.length ; i++) {
			File f = files[i];
			String name = f.getName(); //파일이름 가져오기
			long size = f.length(); // 크기
			String sep = "";
			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm"); // m은 대문자
			
			if(f.isDirectory()) { // 파일인지 폴더인지 구분
				sep = "Dir";
				
			}else {
				sep = "file";
				filesCnt++; // 파일 갯수 몇갠지 알려고 
			}
			
			System.out.printf("%-20s   [%5s] %13dBytes  %s\n", name, sep, size, df.format(new Date(f.lastModified())));
//			이름 , 파일인지 폴더인지, 크기, 설치한 시간  이렇게 차례로 출력하는 방법
			
		}
		System.out.println("Total files " + filesCnt); // 파일 갯수 몇갠지 알려고 
	}

}
