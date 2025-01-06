package com.teomaik.demospring.books;

import java.util.ArrayList;
import java.util.List;

public class Book {

	private String title;
	private String author;
	private String publiser;
	private int publishYear;
	List<String> theme = new ArrayList<String>();
	
	public Book() {}
	
	public Book(String title, String author, String publiser, int publishYear, List<String> theme) {
		this.title = title;
		this.author = author;
		this.publiser = publiser;
		this.publishYear = publishYear;
		this.theme = theme;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPubliser() {
		return publiser;
	}
	public void setPubliser(String publiser) {
		this.publiser = publiser;
	}
	public int getPublishYear() {
		return publishYear;
	}
	public void setPublishYear(int publishYear) {
		this.publishYear = publishYear;
	}
	public List<String> getTheme() {
		return theme;
	}
	public void setTheme(List<String> theme) {
		this.theme = theme;
	}
	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", publiser=" + publiser + ", publishYear=" + publishYear
				+ ", theme=" + theme + "]";
	}
	
	
}
