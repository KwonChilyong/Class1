package chap12;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileEx04 {

	public static void main(String[] args) throws IOException {
		File file = new File("d:\\temp\\data");
		Path fout = file.toPath();
		if(file.exists()) {
			System.out.println("이미 존재 합니다.");
		}else {
			file.mkdir(); //폴더 생성
			System.out.println("폴더를 생성하였습니다.");
		}
		
		File f = new File("d:\\workspace\\chap01\\src\\chap12"); // 요기에 있는 파일들을 temp\\data 에 복사할려고 하는것
		
		File[] fa = f.listFiles();
		
		for(File flist : fa) {
			Path pathf = flist.toPath();
			Path patht = fout.resolve(flist.getName());
			Files.copy(pathf, patht);
			System.out.println(pathf);
		}
	}

}
