package io.github.oliviercailloux.twod_library.Contract;

import java.awt.List;

public class BooksOnShelf {
	/**
	 * liste des livres sur une étagère
	 * not null, may be empty
	 */
	private List books;
	/**
	 * not null
	 */
	private int nbBooks;
	/**
	 * inclinaison d'un livre sur l'étagère
	 * 		Vertical ou Oblique
	 */


public List getBooks() {
	return books;
}

public void setBooks(List books) {
	this.books=new List();
	this.books = books;
}

public int getNbBooks() {
	return nbBooks;
}

public void setNbBooks(int nbBooks) {
	this.nbBooks=0;
	this.nbBooks = nbBooks;
}
/**
 * True: si le livre est rangé verticalement sinon oblique
 */
public boolean isTiltingVertical() {
	return true;
}

}

