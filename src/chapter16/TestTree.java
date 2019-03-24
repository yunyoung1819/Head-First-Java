package chapter16;

import java.util.TreeSet;

/**
 * TreeSet에 관해 알아야할 것들... 
 * @author headfirst java
 *
 */
public class TestTree {
	public static void main(String[] args) {
		new TestTree().go();
	}
	
	public void go() {
		Book b1 = new Book("How Cats Work");
		Book b2 = new Book("Remix your Body");
		Book b3 = new Book("Finding Emo");
		
		TreeSet<Book> tree = new TreeSet<Book>();
		tree.add(b1);
		tree.add(b2);
		tree.add(b3);
		System.out.println(tree);
	}
}

class Book implements Comparable<Book> {
	String title;
	public Book(String t) {
		title = t;
	}
	@Override
	public int compareTo(Book b) {
		Book book = (Book) b;
		return title.compareTo(book.title);
	}

}
