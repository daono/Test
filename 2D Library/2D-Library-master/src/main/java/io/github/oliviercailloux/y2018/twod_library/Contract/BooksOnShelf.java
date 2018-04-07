package io.github.oliviercailloux.y2018.twod_library.Contract;
import java.awt.List;
public class BooksOnShelf {
	/**
	 * Cette classe permet de stocker les préférences d'affichage de la bibliothèque 
	 * On peut choisir le nombre de livres par étagère 
	 * La manière dont les livres sont posés (Droit ou oblique/incliné)
	 */
	/**
	 *  liste des livres sur une étagère
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
	private String bookCategory;
	private String bookLanguage;

	public BooksOnShelf(List books,int nbBooks, String bookCategory){
		this.books = books;
		this.nbBooks = nbBooks;
		this.bookCategory = bookCategory;
	}
	public List getBooks() {
		return books;
	}

	public void setBooks(List books) {
		this.books = books;
	}

	public int getNbBooks() {
		return nbBooks;
	}

	public void setNbBooks(int nbBooks) {
		this.nbBooks = nbBooks;
	}
	/**
	 * True: si le livre est rangé verticalement sinon oblique
	 */
	public boolean isTiltingVertical() {
		return true;
	}
	public String getBookCategory(){
		return bookCategory;
	}
	public void setBookCategory(String bookCategory){
		this.bookCategory = bookCategory;
	}
	public String getBookLanguage(){
		return bookLanguage;
	}
	public void setBookLanguage (String bookLanguage) {
		this.bookLanguage = bookLanguage;
	}
}	
