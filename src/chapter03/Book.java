package chapter03;

public class Book {
	public static void main(String[] args) {
		Book b = new Book();
		Book c = new Book();
		Book d = c;
		c = b;
	}
}
