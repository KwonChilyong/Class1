package chap11;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortDemo {

	public static void main(String[] args) {
		String[] s = {"����","����","���ѹα���","����մϴ�"};
		List<String> list = Arrays.asList(s);
		
		System.out.println(list); // list�� ������ �����ϱ� �� �״�� ����.
		
		Collections.sort(list);
		System.out.println(list); // ��,��,��,�� ������ ���ĵǼ� ��µ�.
		
		Collections.sort(list, Collections.reverseOrder());
		System.out.println(list);  // �������� ����.
		
		Collections.reverse(list);
		System.out.println(list); // �׳� reverse �� �ٷ��ص� �������� �ȴ�.
		
		
		
		

	}

}
