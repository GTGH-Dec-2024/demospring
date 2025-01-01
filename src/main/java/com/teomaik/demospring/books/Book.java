package com.teomaik.demospring.books;

import java.util.ArrayList;
import java.util.List;

import com.teomaik.demospring.themes.Theme;


public class Book {

	private String title;
	private String author;
	private String publiser;
	private int publishYear;
	private String description;
	List<Theme> theme = new ArrayList<Theme>();
	
	public Book(String title, String author, String publiser, int publishYear, String description, List<Theme> theme) {
		super();
		this.title = title;
		this.author = author;
		this.publiser = publiser;
		this.publishYear = publishYear;
		this.theme = theme;
		this.description = description;
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
	public List<Theme> getTheme() {
		return theme;
	}
	public void setTheme(List<Theme> theme) {
		this.theme = theme;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", publiser=" + publiser + ", publishYear=" + publishYear
				+ ", description=" + description + ", theme=" + theme.toString() + "]";
	}

	
	
}
