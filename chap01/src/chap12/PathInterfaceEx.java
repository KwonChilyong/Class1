package chap12;

import java.io.File;
import java.nio.file.Files;

public class PathInterfaceEx {

	public static void main(String[] args) {
		File f1 = new File("d:\\temp\\org.txt"); // ������ �����Ҽ��ְ�
		File f2 = new File("d:\\temp"); // ���丮�� �����Ҽ��� �ִ�.
		
		System.out.println("org.txt�� ����? " + Files.isDirectory(f1.toPath()));
		System.out.println("org.txt�� ����? " + f1.isDirectory()); // �� �Ʒ� �Ȱ��� �ǹ� 
		
		
		
		

	}

}
