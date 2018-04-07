package io.github.oliviercailloux.y2018.twod_library.Contract;
/**
 * nbOfPages not null
 * author not null
 * 
 * 
 * @author Julia
 *
 */
public class Book {


	private String nbOfPages;
	private String author;
	private String publishingDate;
	private String title;
	private String genre;

	public Book(String title, String author, String genre, String publishingDate, String nbOfPages2) {
		this.setTitle(title);
		this.setGenre(genre);
		this.setAuthor(author);
		this.setpublishingDate(publishingDate);
		this.setNbOfPages(nbOfPages2);
	}

	public String getpublishingDate() {
		return publishingDate;
	}

	public void setpublishingDate(String publishingDate) {
		this.publishingDate = publishingDate;
	}

	public String getNbOfPages() {
		return nbOfPages;
	}

	public void setNbOfPages(String nbOfPages2) {
		this.nbOfPages = nbOfPages2;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}
}
