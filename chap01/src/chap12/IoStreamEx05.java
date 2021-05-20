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
		for(int i = 1; (line = br.readLine()) != null ; i++) { //버퍼를 이용하면 한 라인단위로 읽어낼수있다.
			System.out.println("[" + i + "]  " + line);
			bw.write(line);
			bw.write('\n'); // 강제 줄바꿈 해줘야 제대로 출력된다.
		}
		bw.flush();
		br.close();
		bw.close();
 
	}

}
