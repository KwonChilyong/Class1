package chap04;

// 162-1
//class triangle {
//	double l;
//	double h;
//	
//	triangle(double l, double h){
//		this.l = l;
//		this.h = h;
//	}
//	
//	double findArea() {
//		
//		return l * h / 2;
//		
//	}
//
//	public double getL() {
//		return l;
//	}
//
//	public void setL(double l) {
//		this.l = l;
//	}
//
//	public double getH() {
//		return h;
//	}
//
//	public void setH(double h) {
//		this.h = h;
//	}
//
//	
//}
//
//public class TriangleTest {
//
//	public static void main(String[] args) {
//				
//		triangle t = new triangle(10.0 , 5.0);
//		System.out.println(t.findArea());
//		
//		
//	}
//
//}

// 161-2

class triangle {
	double l;
	double h;
	
	triangle(double l, double h){
		this.l = l;
		this.h = h;
	}
	
	double findArea() {
		
		return l * h / 2;
		
	}
	public boolean isSameArea(triangle t) {
		double t1=findArea();
		double t2=t.findArea();
		
		if(t1==t2) {
			return true;
			
		}else {
			return false;
		}
	}

	public double getL() {
		return l;
	}

	public void setL(double l) {
		this.l = l;
	}

	public double getH() {
		return h;
	}

	public void setH(double h) {
		this.h = h;
	}

	
}

public class p162ex1 {

	public static void main(String[] args) {
				
		triangle t1 = new triangle(10.0 , 5.0);
		triangle t2 = new triangle(5.0 , 10.0);
		triangle t3 = new triangle(8.0 , 8.0);
		
		System.out.println(t1.isSameArea(t2));
		System.out.println(t1.isSameArea(t3));

		
		
	}

}


