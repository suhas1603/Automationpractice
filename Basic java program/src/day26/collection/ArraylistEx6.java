package day26.collection;

import java.util.ArrayList;
import java.util.List;

class Book {
	int id;
	String name, auther, publisher;
	int quantity;

	public Book(int id, String name, String auther, String publisher, int quantity) {
		this.id = id;
		this.name = name;
		this.auther = auther;
		this.publisher = publisher;
		this.quantity = quantity;
	}
}

public class ArraylistEx6 {

	public static void main(String[] args) {
		// creating the list of book
		List<Book> list = new ArrayList<Book>();
		// Creating Books
		Book b1 = new Book(101, "Let us C", "Yashwant Kanetkar", "BPB", 8);
		Book b2 = new Book(102, "Data Communications and Networking", "Forouzan", "Mc Graw Hill", 4);
		Book b3 = new Book(103, "Operating System", "Galvin", "Wiley", 6);
		// Adding Books to list
		list.add(b1);
		list.add(b2);
		list.add(b3);
		list.add(new Book(104, "Let us Code it", "xyz", "pqr", 5));

		System.out.println("list of book element: " + list);
		System.out.println(list.get(0).name);
		System.out.println(list.get(0).id);
		System.out.println(list.get(0).publisher);
		System.out.println(list.get(0).auther);
		System.out.println(list.get(0).quantity);

		System.out.println(list.get(1).name);
		System.out.println("================================");

		// Traversing list
		for (Book b : list) {
			System.out.println(b.id + " " + b.name + " " + b.auther + " " + b.publisher + " " + b.quantity);
		}

	}

}
