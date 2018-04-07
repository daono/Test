package io.github.oliviercailloux.y2018.twod_library.Contract;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
// CLASSE QUI PERMET D'ECRIRE DES LIVRERS AU FORMATS CSV
public class BookWriter {
	
		//Delimiter used in CSV file
		private static final String COMMA_DELIMITER = ",";
		private static final String NEW_LINE_SEPARATOR = "\n";
		
		//CSV file header
		private static final String FILE_HEADER = "Title, Author, DateOfPublication";

		//c.createline("romeo et juliette","shakespare","1400")
		// writecsvfile(
		public static void writeCsvFile(Library l, String fileName) {
			
			
			
//			//Create new book objects
//			Livre l1 = new Livre("Hamlet","Shakespare",1400);
//				
//			//Create a new list of student objects
//			List books = new ArrayList();
//			books.add(l1);
		
			// FileWriter fileWriter = null;
					
			try (FileWriter fileWriter = new FileWriter(fileName)){
				

				//Write the CSV file header
				fileWriter.append(FILE_HEADER.toString());
				
				//Add a new line separator after the header
				fileWriter.append(NEW_LINE_SEPARATOR);
				
				//Write a new student object list to the CSV file
				for (Book book : l.getBooks()) {
					fileWriter.append(String.valueOf(book.getTitle()));
					fileWriter.append(COMMA_DELIMITER);
					fileWriter.append(String.valueOf(book.getAuthor()));
					fileWriter.append(COMMA_DELIMITER);
					fileWriter.append(String.valueOf(book.getDateOfPublication()));
					fileWriter.append(NEW_LINE_SEPARATOR);
				}

				
				
				System.out.println("CSV file was created successfully !!!");
				
			} catch (Exception e) {
				System.out.println("Error in CsvFileWriter !!!");
				e.printStackTrace();
//			} finally {
//				
//				try {
//					fileWriter.flush();
//					fileWriter.close();
//				} catch (IOException e) {
//					System.out.println("Error while flushing/closing fileWriter !!!");
//	                e.printStackTrace();
//				}
				
			}
		}
	}

