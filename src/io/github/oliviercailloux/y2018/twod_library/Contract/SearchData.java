package io.github.oliviercailloux.y2018.twod_library.Contract;

import java.util.Scanner;

/**
 * Contract 2
 * 
 * SearchData allows you to store data from a research. It stores the
 * information about: the book's title that has been searched,
 *  the book's author that has been searched
 *  and the book's publications dates that have been searched.
 * 
 * @author CatherineCAROU & daono
 * @version 2
 * @date 23/03/18
 */

public class SearchData {

	private String dataTitles;
	private String dataAuthors;
	private int dataFirstDatePublication;
	private int dataSecondDatePublication;
	private Scanner scannerTitle;
	private Scanner scannerAuthor;
	private Scanner scannerDate1;
	private Scanner scannerDate2;


	public void setFirstDataDatePublication(int dataDatePublication) {
		this.dataFirstDatePublication = dataDatePublication;

	}

	public void setSecondDataDatePublication(int dataDatePublication) {
		this.dataSecondDatePublication = dataDatePublication;

	}

	public SearchData() {
		this.dataTitles = "";
		this.dataAuthors = "";
		this.dataFirstDatePublication = 0;
		this.dataSecondDatePublication = 0;

	}

	/**
	 * searchTitle allows the user to search for a book's title
	 */

	public void searchTitle() {
		System.out.println("What is the title of the book you are looking for ?");
		scannerTitle = new Scanner(System.in);
		String input = scannerTitle.nextLine();
		this.dataTitles = input;
System.out.println(input);
		scannerTitle.close();
	}

	/**
	 * searchAuthor allows the user to search for a book's author
	 */

	public void searchAuthor() {
		System.out.println("What is the author of the book you are looking for ?");
		scannerAuthor = new Scanner(System.in);
		String input = scannerAuthor.nextLine();
		this.dataTitles = input;

		scannerAuthor.close();
	}

	/**
	 * searchDatePublication allows the user to search for a book's date of
	 * publication
	 */
	public void searchDatePublication() {
		System.out.println("Give the period of publication of the book you are looking for (two dates)");
		
		System.out.println("Give the first date");
		
		scannerDate1 = new Scanner(System.in);
		int input1 = scannerDate1.nextInt();
		
		if (input1 <= 0) {
			throw new NumberFormatException("Your date of publication must be strictly ypositive");

		}	
		this.setFirstDataDatePublication(input1);

	
		System.out.println("Give the second date");
		scannerDate2 = new Scanner(System.in);
		int input2 = scannerDate2.nextInt();

		if (input2 <= 0) {
			throw new NumberFormatException("Your date of publication must be strictly positive");

		}

		this.setSecondDataDatePublication(input2);
		scannerDate1.close();
		scannerDate2.close();
		
	}
}
