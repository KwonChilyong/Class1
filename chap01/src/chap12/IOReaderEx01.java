package chap12;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;

public class IOReaderEx01 {

	public static void main(String[] args) throws Exception { // ����ó���� ���������� �ֻ��� exception ���ָ� ��
		String input = "D:\\workspace\\chap01\\data.txt";
		String output = "D:\\workspace\\chap01\\data-01.txt";
		
		FileReader fr = new FileReader(new FileInputStream(input));
		FileWriter fw = new FileWriter(output, "ASCII");
		
		int c;
		while((c = fr.read()) != -1) {
			fw.write(c);
		}
		fw.flush();
	}

}
