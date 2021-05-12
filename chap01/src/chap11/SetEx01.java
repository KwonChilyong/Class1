package chap11;

import java.util.HashSet;
import java.util.Set;

public class SetEx01 {

	public static void main(String[] args) {
		Set s = new HashSet();
		s.add(10);
		s.add(25);
		s.add(40);
		s.add(8);
		s.add(25);
		
		
		System.out.println(s); // set은 중복 안되니 중복피하고 싶을때 써라.
		

	}

}
