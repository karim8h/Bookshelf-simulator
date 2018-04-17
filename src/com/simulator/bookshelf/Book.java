package com.simulator.bookshelf;

public class Book {
	
	private String title;
	private String[] authors;
	private String category;
	private String description;
	private String[] reviws;
	private String coverUrl;
	
	public Book(String title, String[] authors, String coverUrl) {
		// TODO Auto-generated constructor stub
	}

	public String getTitle() { return title; }
	public String[] getAuthors() { return authors; }
	public String getCategory() { return category; }
	public String getDescription() { return description; }
	public String[] getReviws() { return reviws; }
	public String getCoverUrl() { return coverUrl; }

	protected void setTitle(String title) { this.title = title; }
	protected void setAuthors(String[] authors) { this.authors = authors; }
	protected void setCategory(String category) { this.category = category; }
	protected void setDescription(String description) { this.description = description; }
	protected void setReviws(String[] reviws) { this.reviws = reviws; }
	protected void setCoverUrl(String coverUrl) { this.coverUrl = coverUrl; }










	
	
}
