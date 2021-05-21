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
			System.out.println("�̹� ���� �մϴ�.");
		}else {
			file.mkdir(); //���� ����
			System.out.println("������ �����Ͽ����ϴ�.");
		}
		
		File f = new File("d:\\workspace\\chap01\\src\\chap12"); // ��⿡ �ִ� ���ϵ��� temp\\data �� �����ҷ��� �ϴ°�
		
		File[] fa = f.listFiles();
		
		for(File flist : fa) {
			Path pathf = flist.toPath();
			Path patht = fout.resolve(flist.getName());
			Files.copy(pathf, patht);
			System.out.println(pathf);
		}
	}

}
