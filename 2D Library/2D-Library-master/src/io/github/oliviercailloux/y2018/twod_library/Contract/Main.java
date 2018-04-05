package io.github.oliviercailloux.y2018.twod_library.Contract;

	public class Main {

		public static void main(String[] args) {
//			SearchData s = new SearchData();
//			s.searchTitle();
//			s.searchAuthor();
//			s.searchDatePublication();
			
			Library l = new Library();
			Book b1 = new Book("Romeo et Juliette", "Shakespeare",1597);
			Book b2 = new Book("harry potter a l'ecole des sorciers", "J.K Rowling",1997);
			l.getBooks().add(b1);
			l.getBooks().add(b2);
			// System.out.println(l.getBooks().get(0).getTitle());
//			BookWriter bw= new BookWriter();
			BookWriter.writeCsvFile(l,"test.csv");
			
			
		}
	}


