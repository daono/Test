package io.github.oliviercailloux.y2018.twod_library.Contract;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class BookReader {

	public static void readCsvFileClasspath(String booksFilePath, Library l) {
		File booksFile = new File(booksFilePath);

		List<Book> liste = new ArrayList<>();

		// this gives you a 2-dimensional array of strings
		List<List<String>> lines = new ArrayList<>();
		Scanner inputStream;

		try {
			inputStream = new Scanner(booksFile);

			while (inputStream.hasNextLine()) {
				String line = inputStream.nextLine();
				// inputStream.useDelimiter(",");
				String[] values = line.split(",");
				// this adds the currently parsed line to the 2-dimensional
				// string array
				if (!line.isEmpty()) {
					lines.add(Arrays.asList(values));
				}
			}

			inputStream.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		// the following code lets you iterate through the 2-dimensional array
		int lineNo = 0;
		for (List<String> line : lines) {

			int columnNo = 0;
			if (lineNo == 0) {
				lineNo++;
				continue;
			}
			Book book = new Book();
			Author author = new Author("", "");
			book.setAuthor(author);

			for (String value : line) {

				if (value == "" || value.isEmpty()) {
					value = "";
				}
				// LOGGER.info("bla : " + value);
				book.setBookAttribute(columnNo, value);
				columnNo++;

			}
			liste.add(book);
			lineNo++;
		}
		return liste;

	}

	public static void readCsvFileMainProject() {
		
	}

}
