package com.github.cristianbermejo.course.bookscrud.client.model;

public class Copy {
	private Long isbn;
	private String title;
	private String theme;
	
	public Copy(Long isbn, String title, String theme) {
		this.isbn = isbn;
		this.title = title;
		this.theme = theme;
	}

	public Copy() {
	}

	public Long getIsbn() {
		return isbn;
	}

	public void setIsbn(Long isbn) {
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTheme() {
		return theme;
	}

	public void setTheme(String theme) {
		this.theme = theme;
	}
}
