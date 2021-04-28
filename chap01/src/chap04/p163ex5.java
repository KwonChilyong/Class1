package chap04;

class Line {
	int len;
	
	Line(int len) {
		this.len = len;
	}
	public boolean isSameLine(Line b) {
		boolean ret;
		
		if(len == b.len) {
			ret = true;
		}else {
			ret = false;
		}
		
		return ret;
	}
}
public class p163ex5 {

	public static void main(String[] args) {
		Line a = new Line(1);
		Line b = new Line(1);
		
		System.out.println(a.isSameLine(b));
		System.out.println(a==b);

	}

}
