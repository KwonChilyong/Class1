package chap12;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class IoStreamEx05 {

	public static void main(String[] args) throws Exception {
		String input = "src\\chap12\\IoStreamEx01.java";
		String output = "D:\\workspace\\chap01\\javasource.java";
		
		FileReader fr = new FileReader(input);
		FileWriter fw = new FileWriter(output);
		
		BufferedReader br = new BufferedReader(fr);
		BufferedWriter bw = new BufferedWriter(fw);
		
		String line = "";
		for(int i = 1; (line = br.readLine()) != null ; i++) { //���۸� �̿��ϸ� �� ���δ����� �о���ִ�.
			System.out.println("[" + i + "]  " + line);
			bw.write(line);
			bw.write('\n'); // ���� �ٹٲ� ����� ����� ��µȴ�.
		}
		bw.flush();
		br.close();
		bw.close();
 
	}

}
