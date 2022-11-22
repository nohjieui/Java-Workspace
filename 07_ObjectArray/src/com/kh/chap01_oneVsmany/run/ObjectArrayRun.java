package com.kh.chap01_oneVsmany.run;

import java.util.Scanner;

import com.kh.chap01_oneVsmany.model.vo.Book;

public class ObjectArrayRun {

	public static void main(String[] args) {

		// Book 객체 배열 선언하는 방법
		Book[] arr = new Book[3];
		
		Scanner sc = new Scanner(System.in);
		
		// 3개의 전체 도서 정보를 입력받은 후 각 객체 배열의 인덱스에 해당 객체를 생성하기.
		
		for(int i = 0; i< arr.length; i++) {
			System.out.print("제목 : ");
			String title =sc.nextLine();
			System.out.print("저자 : ");
			String author = sc.nextLine();
			System.out.print("가격 : ");
			int price = sc.nextInt();
			sc.nextLine();
			System.out.print("출판사 : ");
			String publisher = sc.nextLine();
			
			arr[i] = new Book(title, author, price, publisher);
			
		}
		
		// 전체 도서정보들 출력
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i].information());
		}
		
		//사용자에게 검색할 도서 제목을 입력받아 각 전체 도서들의 제목과 일일이 비교하여 일치하는 도서의 가격을 알려주는 메소드
		
		System.out.print("검색할 책 제목 : ");
		String searchTitle = sc.nextLine();
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i].getTitle().equals(searchTitle)) // arr 인덱스 반복진행 -> 그 안에 담겨있는 값은 주소값 담겨있음 이 주소값을 통해 각각의 초기화된 값을 알 수 있고 책의 제목을 알기위해 getTitle에서 책의값을 알 수 있고 equals를 이용해 제목이 일치하는지 알 수 있음
				System.out.println(arr[i].getPrice());
		}
		
	}

}
