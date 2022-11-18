package com.kh.example.practice3.model.vo;

public class Circle {
	
	//필드부
	private final static double PI = 3.14; //PI는 상수필드로 만들어야함
	private int redius = 1;
	
	//초기화 블럭 => 초기화블럭 사용시 필드부의 private int redius = 1; -> private int redius;로 작성후 초기화 블럭 안에서 값 초기화
//	{
//		redius = 5;
//	}
	
	//생성자부
	public Circle() {
		getAreaOfCircle();
		getSizeOfCicle();

	}
	
	//메소드부
	public void setRedius(int redius) {
		this.redius = redius;
	}
	
	public int getRedius() {
		return redius;
	}
	
	// incrementRadius() : void
	public void incrementRadius() {
		redius++;
		getAreaOfCircle();
		getSizeOfCicle();

	}
	
	// getAreaOfCircle() : void => 원의 둘레 : 2 * 원주율 * 반지름
	public void getAreaOfCircle() {
		
		System.out.println(2 * PI * redius);
	}
	
	// getSizeOfCircle() : void => 원의 넓이 : 반지름 * 반지름 * 원주율
	public void getSizeOfCicle() {
		
		System.out.println(redius * redius * PI);
	}
	
	
}
