package io.github.oliviercailloux.y2018.twod_library.Contract;

	public class Main {

		public static void main(String[] args) {
//			SearchData s = new SearchData();
//			s.searchTitle();
//			s.searchAuthor();
//			s.searchDatePublication();
			
			Library l = new Library();
			
			// For File2
			
			Book b1 = new Book("Romeo et Juliette", "Shakespeare",1597);
			Book b2 = new Book("Harry Potter à l'école des sorciers", "J.K Rowling",1997);
			l.getBooks().add(b1);
			l.getBooks().add(b2);
			
			//test
			// System.out.println(l.getBooks().get(0).getTitle());
			
			BookWriter.writeCsvFile(l,"src/io/github/oliviercailloux/y2018/twod_library/Resources/books-file2.csv");
			
			
			// For Resource2
			//by file in the classpath
			
			//by file in the main project
		}
	}


