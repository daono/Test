package io.github.oliviercailloux.y2018.twod_library.Contract;


public class Book {
private String Title;
private String Author;
private Integer DateOfPublication;
	
public Book (String t, String a, Integer d) {
	this.Title = t;
	this.Author = a;
	this.DateOfPublication = d;
}

public String getTitle() {
	return Title;
}

public void setTitle(String title) {
	Title = title;
}

public String getAuthor() {
	return Author;
}

public void setAuthor(String author) {
	Author = author;
}

public Integer getDateOfPublication() {
	return DateOfPublication;
}

public void setDateOfPublication(Integer dateOfPublication) {
	DateOfPublication = dateOfPublication;
}
}

