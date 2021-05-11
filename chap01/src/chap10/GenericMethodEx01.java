package chap10;

public class GenericMethodEx01 {
	public static <T> void showArray(T[] a) {
		for(T t : a) {
			System.out.printf("%s", t);
		}
		System.out.println();
	}
	public static <T> T getLast(T[] a) {
			return a[a.length - 1];
	}
	
	public static void main(String[] args) {
		Integer[] ia = {1, 2, 3, 4, 5 };
		Character[] ca = { 'H', 'E', 'L', 'L', 'O' };
		
		GenericMethodEx01.showArray(ia);
		GenericMethodEx01.<Character>showArray(ca);
		System.out.println(GenericMethodEx01.getLast(ia));

	}

}
