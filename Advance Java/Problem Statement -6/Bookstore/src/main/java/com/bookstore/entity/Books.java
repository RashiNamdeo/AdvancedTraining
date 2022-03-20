package com.bookstore.entity;

public class Books {
	String Book_id;
	String Book_name;
	String Author;
	Double Price;

	public Books() {
	}

	public Books(String book_id, String book_name, String author, Double price) {
		super();
		Book_id = book_id;
		Book_name = book_name;
		Author = author;
		Price = price;
	}

	public String getBook_id() {
		return Book_id;
	}

	public void setBook_id(String book_id) {
		Book_id = book_id;
	}

	public String getBook_name() {
		return Book_name;
	}

	public void setBook_name(String book_name) {
		Book_name = book_name;
	}

	public String getAuthor() {
		return Author;
	}

	public void setAuthor(String author) {
		Author = author;
	}

	public Double getPrice() {
		return Price;
	}

	public void setPrice(Double price) {
		Price = price;
	}

	@Override
	public String toString() {
		return "Books [Book_id=" + Book_id + ", Book_name=" + Book_name + ", Author=" + Author + ", Price=" + Price
				+ "]";
	}

}
