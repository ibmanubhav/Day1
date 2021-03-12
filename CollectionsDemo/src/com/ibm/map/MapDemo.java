package com.ibm.map;

import java.util.HashMap;
import java.util.Map;

import com.ibm.set.Book;

public class MapDemo {
	public static void main(String[] args) {
		createMapofBooks();
	}

	private static void createMapofBooks() {
		// TODO Auto-generated method stub
		Map<String, Book> books = new HashMap<String, Book>();
	//	System.out.println(books.size());
		Book book1 = new Book("java");
		books.put("Book1", book1);
	//	System.out.println(books.size()); // ENTRY = KEY + VALUE
		
		for (int i = 1; i < 10; i++) {
			Book book = new Book("JAVA");
			books.put("book"+i, book1);
			
		}
		//books.clear();
		books.remove("book2");
		
		System.out.println(books.size());
	}

}
