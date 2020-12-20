package com.rubanlearning.springbootdb.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "BOOKS")
public class Book extends BaseEntity {

	private static final long serialVersionUID = -8302338464277404827L;

	@Column(name = "TITLE")
	private String title;

	@Column(name = "LANGUAGE")
	private String language;

	@Column(name = "AUTHOR")
	private String author;

	@Column(name = "PAGES")
	private Integer pages;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Integer getPages() {
		return pages;
	}

	public void setPages(Integer pages) {
		this.pages = pages;
	}

}