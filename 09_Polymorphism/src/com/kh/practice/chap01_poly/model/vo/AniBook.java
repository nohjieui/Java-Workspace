package com.kh.practice.chap01_poly.model.vo;

public class AniBook extends Book {
	
	private int acceccAge;

	public AniBook() {
		super();
	}

	public AniBook(String title, String author, String publisher, int acceccAge) {
		super(title, author, publisher);
		this.acceccAge = acceccAge;
	}

	public int getAcceccAge() {
		return acceccAge;
	}

	public void setAcceccAge(int acceccAge) {
		this.acceccAge = acceccAge;
	}

	@Override
	public String toString() {
		return "AniBook " + super.toString() + ", acceccAge=" + acceccAge;
	}
	
}
