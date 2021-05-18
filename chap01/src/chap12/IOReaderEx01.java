package chap12;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;

public class IOReaderEx01 {

	public static void main(String[] args) throws Exception { // 예외처리로 보내버릴때 최상위 exception 써주면 끝
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
