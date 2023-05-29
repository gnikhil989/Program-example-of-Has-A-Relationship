package com.jsp.HasARelationShip;

public class Book {
	private String name;
	private String genre;
	private double price;

	private Author author;

	public Book(String name, String genre, double price) {
		this.name = name;
		this.genre = genre;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public void printBookDetails() {
		System.out.println(" Name of the Book is:" + name);
		System.out.println("Genre of the Book is :" + genre);
		System.out.println("Price of the Book is:" + price);
		if (author != null) {
			author.printAuthorDetails();
		} else {
			System.out.println("No Author Details are provided");
		}
	}
}
