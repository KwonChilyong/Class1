package chap12;

import java.io.File;
import java.nio.file.Files;

public class PathInterfaceEx {

	public static void main(String[] args) {
		File f1 = new File("d:\\temp\\org.txt"); // 파일을 생성할수있고
		File f2 = new File("d:\\temp"); // 디렉토리만 생성할수도 있다.
		
		System.out.println("org.txt는 폴더? " + Files.isDirectory(f1.toPath()));
		System.out.println("org.txt는 폴더? " + f1.isDirectory()); // 위 아래 똑같은 의미 
		
		
		
		

	}

}
