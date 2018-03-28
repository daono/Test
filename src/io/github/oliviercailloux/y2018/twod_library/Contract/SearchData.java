package io.github.oliviercailloux.y2018.twod_library.Contract;

import java.util.Scanner;


/** Contract 2
 * 
 * SearchData allows you to store data from a research.
 * It stores the information about:
 * the book's title that has been searched
 * the book's author that has been searched
 * the book's publications dates that have been searched.
 * 
 *
 *
 * @author CatherineCAROU & daono
 * @version 2
 * @date 24/03/18
 */

public class SearchData {

	private String dataTitles;
	private String dataAuthors;
	private int dataFirstDatePublication;
	private int dataSecondDatePublication;

	public SearchData() {
		this.dataTitles = "";
		this.dataAuthors = "";
		this.dataFirstDatePublication = 0;
		this.dataSecondDatePublication = 0;
	}

	/**
	 * searchTitle allows the user to search for a book's title
	 */
	public void searchTitle(){
		System.out.println("What is the title of the book you are looking for ?");
		String input = TextIO.getlnString();
		while (input.isEmpty()){
			input = TextIO.getlnString();
		}
		this.setDataTitles(input);
		//System.out.println(input);	test	 
	}

	/**
	 * searchAuthor allows the user to search for a book's author
	 */
	public void searchAuthor(){
		System.out.println("What is the author of the book you are looking for ?");
		String input = TextIO.getlnString();
		while (input.isEmpty()){
			input = TextIO.getlnString();
		}
		this.setDataAuthors(input);
		//System.out.println(input);		test	
	}

	/**
	 * searchDatePublication allows the user to search for a book's date of publication
	 */
	public void searchDatePublication() {
		System.out.println("Give the period of publication of the book you are looking for (two dates)");

		// FOR THE FIRST DATE
		System.out.println("Give the first date");
		int input1 = TextIO.getlnInt();
		System.out.println((input1));
		if (input1 <= 0) {
			throw new NumberFormatException("Your date of publication must be strictly positive");
		}	
		this.setFirstDataDatePublication(input1);

		// FOR THE SECOND DATE
		System.out.println("Give the second date");
		int input2 = TextIO.getlnInt();
		System.out.println((input2));
		if (input2 <= 0) {
			throw new NumberFormatException("Your date of publication must be strictly positive");
		}	
		this.setSecondDataDatePublication(input2);
	}


	public String getDataTitles() {
		return dataTitles;
	}

	public void setDataTitles(String dataTitles) {
		this.dataTitles = dataTitles;
	}

	public String getDataAuthors() {
		return dataAuthors;
	}

	public void setDataAuthors(String dataAuthors) {
		this.dataAuthors = dataAuthors;
	}

	public int getDataFirstDatePublication() {
		return dataFirstDatePublication;
	}

	public void setDataFirstDatePublication(int dataFirstDatePublication) {
		this.dataFirstDatePublication = dataFirstDatePublication;
	}

	public int getDataSecondDatePublication() {
		return dataSecondDatePublication;
	}

	public void setDataSecondDatePublication(int dataSecondDatePublication) {
		this.dataSecondDatePublication = dataSecondDatePublication;
	}

	public void setFirstDataDatePublication(int dataDatePublication) {
		this.setDataFirstDatePublication(dataDatePublication);

	}

	public void setSecondDataDatePublication(int dataDatePublication) {
		this.setDataSecondDatePublication(dataDatePublication);

	}
}
