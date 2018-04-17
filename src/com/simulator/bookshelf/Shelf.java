package com.simulator.bookshelf;

import java.util.List;

public class Shelf {
	
	private List<Book> books;
	private String title;
	private String[] authors;
	private String category;
	
	protected void addBook(Book book) {
		// TODO
	}

	public List<Book> getBooks() { return books; }
	public String getTitle() { return title; }
	public String[] getAuthors() { return authors; }
	public String getCategory() { return category; }

	protected void setBooks(List<Book> books) { this.books = books; }
	protected void setTitle(String title) { this.title = title; }
	protected void setAuthors(String[] authors) { this.authors = authors; }
	protected void setCategory(String category) { this.category = category; }






	
	
}
