package com.kh.example.practice6.model.vo;

public class Book {

	// 필드부
	private String title;
	private String publisher;
	private String author;
	private int price;
	private double discountRace;

	// 생성자부
	public Book() {

	}

	public Book(String title, String publisher, String author) {
		this.title = title;
		this.publisher = publisher;
		this.author = author;
	}

	public Book(String title, String publisher, String author, int price, double discountRace) {
		this(title, publisher, author);
		this.price = price;
		this.discountRace = discountRace;
	}

	public void inform() {
		System.out.println(title + ", " + publisher + ", " + author + ", " + price + ", " + discountRace);
	}

}
