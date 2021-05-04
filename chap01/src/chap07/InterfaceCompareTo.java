package chap07;

class St implements Comparable {
	int no;
	String name;
	St(int no, String name){
		this.no = no;
		this.name = name;
	}
	public String toString() {
		return no + " : " + name;
	}
	public int compareTo(Object o) {
		St s = (St) o;
		if(this.no == s.no && this.name.equals(s.name)) {
			return 0;
		}else 
			return -1;
	}
}




public class InterfaceCompareTo {

	public static void main(String[] args) {
		St s1 = new St(1, "abc");
		St s2 = new St(1, "abc");
		
		if(s1.compareTo(s2) == 0)
			System.out.println("같다. s1 : " + s1 + ", s2 : " + s2);
		else
			System.out.println("같지않다. s1 : " + s1 + ", s2 : " + s2);

	}

}
