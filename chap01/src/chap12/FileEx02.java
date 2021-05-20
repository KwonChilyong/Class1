package chap12;

import java.io.File;
import java.io.IOException;

public class FileEx02 {

	public static void main(String[] args) throws IOException {
		File f = new File("d:\\workspace\\chap01\\src\\chap12\\FileEx01.java");
		String fileName = f.getName();
		int pos = fileName.lastIndexOf(".");
		
		System.out.println("파일명은 : " + f.getName());
		System.out.println("확장자를 제외한 파일명 : " + fileName.substring(0, pos));
//		                                               0부터 pos 까지 pos 가 . 까지니깐 
		
		System.out.println("확장자는 : " + fileName.substring(pos+1)); // pos+1 부터 끝까지 , 아무것도 안적으면 끝까지라는 의미
		System.out.println("경로를 포함한 파일 이름 : " + f.getPath());
		System.out.println("파일의 절대경로 : " + f.getAbsoluteFile()); 
		System.out.println("파일의 정규경로 : " + f.getCanonicalPath());
		System.out.println("파일이 속해있는 디렉토리 : " + f.getParent());
		System.out.println("경로 구분자 : " + File.separator);
	}

}
