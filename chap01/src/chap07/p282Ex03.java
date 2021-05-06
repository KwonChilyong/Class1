package chap07;

import java.util.Arrays;

class Book implements Comparable{
	int price;
	
	public Book(int price) {
		this.price = price;
	}
	
	public int compareTo(Object o) {
		Book b = (Book) o;
		int re;
		if(this.price == b.price) {
			re = 0;
		}else if(this.price > b.price) {
			re = 1;
		}else {
			re = -1;
		}
		return re;
	}
	
	public String toString() {
		return "Book [price = " + price + "]";
	}
	
	
}

public class p282Ex03 {
	
	public static void main(String[] args) {
		Book[] books = { new Book(15000) , new Book(50000), new Book(20000)};
		
		
		System.out.println("정렬 전");
		for (Book book : books)
			System.out.println(book);

		Arrays.sort(books); // sort 사용하려면 compareTo 를 써야함

		System.out.println("정렬 후");
		for (Book book : books)
			System.out.println(book);
	}

}
