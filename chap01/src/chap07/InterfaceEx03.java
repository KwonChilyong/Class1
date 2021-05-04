package chap07;

class Circle1 implements Comparable{
	double radius;
	
	public Circle1(double radius) {
		this.radius = radius;
	}
	
	public int compareTo(Object o) {
		Circle1 c = (Circle1) o;
		if(this.radius > c.radius)
			return 1;
		else if (this.radius == c.radius)
			return 0;
		else 
			return -1;
	}
}
public class InterfaceEx03 {

	public static void main(String[] args) {
		Circle1 c1 = new Circle1(5.0);
		Circle1 c2 = new Circle1(6.0);
		
		if (c1.compareTo(c2) > 0) 
			System.out.println("첫 번째 원이 두 번째 원보다 크다.");
		else if (c1.compareTo(c2)==0)
			System.out.println("두 원이 크기가 같다.");
		else 
			System.out.println("첫 번째 원이 두 번째 원보다 작다.");

	}

}
