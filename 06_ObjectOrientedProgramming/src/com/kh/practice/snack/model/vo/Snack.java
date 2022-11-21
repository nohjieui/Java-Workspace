package com.kh.practice.snack.model.vo;

public class Snack {
	
	//필드부
	private String kind;
	private String name;
	private String flavor;
	private int numOf;
	private int price;
	
	//생성자부
	public Snack() {
		
	}
	
	public Snack(String kind, String name, String flavor, int numOf, int price) {
		this.kind = kind;
		this.name = name;
		this.flavor = flavor;
		this.numOf = numOf;
		this.price = price;
	}
	
	//메소드부
	public void setKind(String kind) {
		this.kind = kind;
	}
	
	public void setNamd(String name) {
		this.name = name;
	}
	
	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}
	
	public void setNumOf(int numOf) {
		this.numOf = numOf;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String getKind() {
		return kind;
	}
	
	public String getName() {
		return name;
	}
	
	public String getFlavor() {
		return flavor;
	}
	
	public int getNumOf() {
		return numOf;
	}
	
	public int getPrice() {
		return price;
	}
	
	//빵(케이크 - 블루베리) 1개 15000원
	public String information() {
		return kind + "("+ name + " - " + flavor + ") "+ numOf + "개 " + price+ "원"; //출력하는 부분x, 문자열로 돌려서 return 해주는 부분 작성
	}
	




















}
