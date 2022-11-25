package com.kh.practice.chap01_poly.view;

import java.util.Scanner;

import com.kh.practice.chap01_poly.controller.LibraryController;
import com.kh.practice.chap01_poly.model.vo.*;

public class LibraryMenu {
	
	private LibraryController lc = new LibraryController();
	private Scanner sc = new Scanner(System.in);
	
	public void mainMenu() {
		
		// 이름, 나이, 성별을 키보드로 입력 받은 후 Member 객체 생성
		// LibraryController의 insertMember() 메소드에 전달
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("나이 : ");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.print("성별 : ");
		char gender = sc.nextLine().charAt(0);
		
		Member mem = new Member();
		mem.setAge(age);
		mem.setName(name);
		mem.setGender(gender);
		lc.insertMember(mem);
		
		while(true) {
			System.out.println();
			System.out.println("==== 메뉴 ===="); 
			System.out.println("1. 마이페이지");		// LibraryController의 myInfo() 호출하여 출력
			System.out.println("2. 도서 전체 조회");	// LibraryMenu의 selectAll() 호출
			System.out.println("3. 도서 검색");		// LibraryMenu의 searchBook() 호출
			System.out.println("4. 도서 대여하기");		// LibraryMenu의 rentBook() 호출
			System.out.println("9. 프로그램 종료하기");
			System.out.print("메뉴 번호 : ");
			int MenuNum = sc.nextInt();
			
			switch(MenuNum) {
			case 1 : System.out.println(lc.myinfo()); break;
			case 2 : selectAll(); break;
			case 3 : searchBook(); break;
			case 4 : rentBook(); break;
			case 9 : System.out.println("프로그램을 종료합니다."); return;
			}
		}
	}
	
	public void selectAll() {
		Book[] bList = lc.selectAll();
		for(int i = 0; i < bList.length; i++) {
			System.out.println(i+"번도서 : "+bList[i]);
		}
	}
	
	public void searchBook() {
		sc.nextLine();
		
		System.out.print("검색할 제목 키워드 : ");
		String keyword = sc.nextLine();
		Book[] searchList = lc.searchBook(keyword);
		
		for(int i = 0; i < searchList.length; i++) { // null
			if(searchList[i] != null) {
				System.out.println(i+"번도서 : "+searchList[i]);
			}
		}

	}
	
	public void rentBook() {
		selectAll();
		System.out.print("대여할 도서 번호 선택 : ");
		int index = sc.nextInt();
		int result = lc.rentBook(index);
		
		if(result == 0) {
			System.out.println("성공적으로 대여되었습니다");
		} else if(result == 1) {
			System.out.println("나이 제한으로 대여 불가능입니다.");
		} else {
			System.out.println("성공적으로 대여되었습니다. 요리학원 쿠폰이 발급되었으니 마이페이지에서 확인하세요.");
		}
	}

}
