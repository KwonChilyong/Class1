package chap12;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IoStreamEx03 {

	public static void main(String[] args) throws IOException {
		DataOutputStream dos = new DataOutputStream(new FileOutputStream("D:\\workspace\\chap01\\data00.dat"));
		
		dos.writeInt(123);
		dos.writeUTF("abc");
		dos.writeInt(89);
		dos.writeDouble(15.34);
		dos.flush();
		
		DataInputStream dis = new DataInputStream(new FileInputStream("D:\\workspace\\chap01\\data00.dat"));
		
		System.out.println(dis.readInt());
		System.out.println(dis.readUTF());
		System.out.println(dis.readInt());
		System.out.println(dis.readDouble());
		

	}

}
