package myProject;
/**
 * object Livre
 * @author CatherineCAROU & daono
 * @version 1
 */
public class Livre {

	private String title;
	private String author;
	private int datePublication;

	/**
	 * Constructor of Livre
	 * @param title
	 * @param author
	 * @param datePublication
	 */
	public Livre(String title, String author, int datePublication) {
		this.title = title;
		this.author = author;
		this.datePublication = datePublication;
	}
	/**
	 * Getter of the book's title
	 * @return title of the book
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * Getter of the book's author
	 * @return name of the author
	 */
	public String getAuthor() {
		return author;
	}
	/**
	 * Getter of the book's date of publication
	 * @return date of publication
	 */
	public int getDatePublication() {
		return datePublication;
	}


}
