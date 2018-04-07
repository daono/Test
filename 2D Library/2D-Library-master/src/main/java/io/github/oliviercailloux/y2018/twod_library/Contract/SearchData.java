package io.github.oliviercailloux.y2018.twod_library.Contract;

import java.awt.font.NumericShaper.Range;
import java.time.Instant;
import java.time.temporal.ValueRange;
import java.util.Scanner;

// ENLEVER TOUT LES SCANNERS RAJOUTER RANGE RAJOUTER TYPE INSTANT PROTEGER CONTRE NULL ET AUTRES

/** Contract 2
 * 
 * SearchData allows you to store data from a research.
 * It stores the information about:
 * the book's title that has been searched
 * the book's author that has been searched
 * the book's publications dates that have been searched.
 * 
 * @author CatherineCAROU & daono
 * @version 3
 * @date 29/03/18
 */

public class SearchData {

	private String title;
	private String author;
	private Range period;
	public SearchData() {
		this.title = "";
		this.author = "";
//		this.firstDatePublication = null;
//		this.secondDatePublication = null;
		this.setPeriod(null);
	}

	/**
	 * searchTitle allows the user to search for a book's title
	 */

	public void searchTitle(){
		//System.out.println("What is the title of the book you are looking for ?");
		
		try(Scanner scannerTitle = new Scanner (System.in)){
			if(scannerTitle.hasNext()) {
				String input = scannerTitle.nextLine();
				this.setDataTitles(input);
				System.out.println(input);		 // test
			} scannerTitle.close();
		} 
	}
	

	/**
	 * searchAuthor allows the user to search for a book's author
	 */

	public void searchAuthor() {
		System.out.println("What is the author of the book you are looking for ?");
		
		try(Scanner scannerAuthor = new Scanner (System.in)){
			System.out.println("testttttttttt");
			if (scannerAuthor.hasNext()) {
				String input = scannerAuthor.nextLine();
				this.setDataAuthors(input);
				System.out.println(input); // test
			} scannerAuthor.close();
		}
	}


	/**
	 * searchDatePublication allows the user to search for a book's date of publication
	 */
	public void searchDatePublication() {
		System.out.println("Give the period of publication of the book you are looking for (two dates)");
		
		// FOR THE FIRST DATE
		System.out.println("Give the first date");
		try(Scanner scannerDate1 = new Scanner(System.in)){
			while(scannerDate1.hasNext()) {
				Instant input1 = scannerDate1.next();
				System.out.println((input1));
				if (input1 <= 0) {
					throw new NumberFormatException("Your date of publication must be strictly positive");
				}	
				this.setFirstDataDatePublication(input1);
			} scannerDate1.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		// FOR THE SECOND DATE
		System.out.println("Give the second date");
		try(Scanner scannerDate2 = new Scanner(System.in)){
			while(scannerDate2.hasNext()) {
				int input2 = scannerDate2.nextInt();
				if (input2 <= 0) {
					throw new NumberFormatException("Your date of publication must be strictly positive");
				}	
				this.setSecondDataDatePublication(input2);
			} scannerDate2.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
		

	public String getDataTitles() {
		return title;
	}

	public void setDataTitles(String dataTitles) {
		this.title = dataTitles;
	}

	public String getDataAuthors() {
		return author;
	}

	public void setDataAuthors(String dataAuthors) {
		this.author = dataAuthors;
	}

	public int getDataFirstDatePublication() {
		return firstDatePublication;
	}

	public void setDataFirstDatePublication(int dataFirstDatePublication) {
		this.firstDatePublication = dataFirstDatePublication;
	}

	public int getDataSecondDatePublication() {
		return secondDatePublication;
	}

	public void setDataSecondDatePublication(int dataSecondDatePublication) {
		this.secondDatePublication = dataSecondDatePublication;
	}

	public void setFirstDataDatePublication(int dataDatePublication) {
		this.setDataFirstDatePublication(dataDatePublication);

	}

	public void setSecondDataDatePublication(int dataDatePublication) {
		this.setDataSecondDatePublication(dataDatePublication);

	}

	public ValueRange getPeriod() {
		return period;
	}

	public void setPeriod(ValueRange period) {
		this.period = period;
	}
}
