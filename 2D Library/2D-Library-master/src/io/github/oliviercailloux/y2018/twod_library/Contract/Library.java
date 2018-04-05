package io.github.oliviercailloux.y2018.twod_library.Contract;

import java.util.ArrayList;

public class Library {
private ArrayList<Book>books;
public Library () {
	this.books = new ArrayList<>();
	
}
public ArrayList<Book> getBooks() {
	return books;
}
}
