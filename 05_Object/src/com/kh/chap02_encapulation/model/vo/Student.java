package com.kh.chap02_encapulation.model.vo;

public class Student {
	//필드부
	/*
	 * 필드 == 멤버변수 == 인스턴스 변수
	 * 
	 * 접근제한자 [예약어] 자료형 필드명;
	 */
	private String name;
	private int age;
	private double height;
	
	// 생성자부
	
	// 메소드부
	/*
	 * 각 기능을 구현하는 부분
	 * 
	 * 접근제한자 반환형 메소드명([매개변수]) {
	 *  	// 기능 구현
	 * }
	 * ex)
	 * public void practice1() {
	 * 
	 * }
	 */
	// setter -> 메소드의 형태 : setXXX , setXXX
	// 해당필드에 대입하고자하는 값을 전달받아 해당필드에 대입시켜주는 기능의 메소드
	// 이 때, 이 메소드는 접근 가능하도록 해야하기 때문에 public 접근제한자를 사용
	
	// 이름값을 기록 및 수정할 수 있는 기능의 메소드(name필드에 값을 넣기위한 용도)
	// set+필드명=> 두단어를 이어줄 때 카멀케이스(낙타등표기법)활용하여 메서드명 선언
	public void setName(String name) {
		// 매개변수 : 해당 메소드 호출 시 전달되는 값을 받아주기 위한 변수
		
		// name = name;
		// 왜? 필드명과 매개변수명이 동일한 경우{} 영역 내에서는 해당역역에서 만들어진 변수가 좀 더 우선순위가 높기때문.
		// 객체의 name에 접근하려면 this를 사용해야함.
		// this에는 생성된 객체의 "주소값"이 담겨있음.
		this.name = name;
	}
	
	// 나이값을 기록 및 수정할 수 있는 기능의 메소드 (age필드에 값을 대입하기 위한 용도)
	public void setAge(int age) {
		this.age = age;
	}
	
	// 키값을 기록 및 수정할 수 있는 기능의 메소드(height필드에 값을 대입하기 위한 용도)
	public void setHeight(double height) {
		this.height = height;
		
	}
	
	// 데이터를 반환해주는 기능의 메소드 : getter 메소드
	// name필드에 담긴 값을 돌려주는 용도의 메소드
	// get+필드명(카멀케이스적용)
	public String getName() { //void : 반환하는 값이 없을 경우에 작성
		
		return name; // return 반환값; -> 반환값을 나를호출한 메소드의 위치에 전달하겠다.
	}
	
	// age필드에 담긴 값을 돌려주는 용도의 메소드
	public int getAge() {
		
		return age;
	}
	
	// height필드에 담긴 값을 돌려주는 용도의 메소드
	public double getHeight() {
		return height;
	}
	
	// 모든 필드값을 하나의 문자열로 합쳐서 돌려주는 용도의 메소드
	public String information() {
		//xxx님의 나이는 xxx살이고, 키는 xxcm 입니다.
		return name+"님의 나이는 "+age+"살이고, 키는 "+height+"cm 입니다.";
	}
	
	
}

