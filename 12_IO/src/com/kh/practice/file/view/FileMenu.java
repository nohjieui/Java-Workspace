package com.kh.practice.file.view;

import java.util.Scanner;

import com.kh.practice.file.controller.FileController;

public class FileMenu {
	
	Scanner sc = new Scanner(System.in);
	FileController fc = new FileController();
	
	public void mainMenu() {
		while(true) {
			System.out.println("***** My Note *****");
			System.out.println("1. 노트 새로 만들기");
			System.out.println("2. 노트 열기");
			System.out.println("3. 노트 열어서 수정하기");
			System.out.println("9. 끝내기");
			System.out.print("메뉴 번호 : ");
			int num = Integer.parseInt(sc.nextLine());
			
			switch(num) {
			case 1 : fileSave(); break;
			case 2 : fileOpen(); break;
			case 3 : fileEdit(); break;
			case 9 : System.out.println("프로그램을 종료합니다."); return;
			default : System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
			}
		}
	}
	
	public void fileSave() {
		StringBuilder sb = new StringBuilder(); // while문 밖에 정의해두는 이유 : while문 안에 정의해두면 반복을 진행할 때마다
		                                        //                          StringBuilder 객체를 생성하기 때문
		while(true) {
			System.out.println("파일에 저장할 내용을 입력하세요");
			System.out.println("ex끝it 이라고 입력하면 종료됩니다.");
			System.out.print("내용 : ");
			String str = sc.nextLine();
			if(str.equals("ex끝it")) {
				break;
			}
			sb.append(str + "\n"); // append : 특정 문자열을 StringBuilder 안에 넣는다. 
			                       // append()메소드 안에 넣은 문자열을 변환시키고 싶을 때는 toString()메소드 사용
			                       // ex) append("aaa").append("bbb").toString()
		}
		
		while(true) {
			System.out.print("저장할 파일 명을 입력해주세요(ex. myFile.txt) : ");
			String file = sc.nextLine();
			if(fc.checkName(file)) { // file이라는 이름이 이미 존재하는 경우
				System.out.print("이미 존재하는 파일입니다. 덮어쓰시겠습니가?(y/n) : ");
				char yes = sc.nextLine().charAt(0);
				if(yes == 'y' || yes == 'Y') { //덮어씌우기
					fc.fileSave(file, sb);
				} else { // 이어쓰기
					System.out.println("저장할 파일 명을 입력해주세요.");
					continue;
				}
			} else { // file의 파일명이 없는 경우
				fc.fileSave(file, sb);
			}
		break;
		}
		
		
	}
	
	public void fileOpen() {
		// 받은 파일 명을 fc에 checkName()의 매개변수로 넘겨 반환 값에 따라 나뉨
		// 반환 값이 true일 경우 fc의 fileOpen() 메소드의 매개변수로 넘겨 반환 값 출력
		// 반환 값이 false일 경우 “없는 파일입니다.” 출력 후 mainMenu()로 돌아감
		System.out.print("열 파일명 : ");
		String file = sc.nextLine();
		if(fc.checkName(file)) {
			System.out.println(fc.fileOpen(file));
		} else {
			System.out.println("없는 파일입니다.");
			mainMenu();
		}
	}
	
	public void fileEdit() {
		// 받은 파일 명을 fc에 checkName()의 매개변수로 넘겨 반환 값에 따라 나뉨
		// 반환 값이 false일 경우 “없는 파일입니다.” 출력 후 mainMenu()로 돌아감
		// 반환 값이 true일 경우 fileSave()처럼 안내문 출력 후 내용에 대해 받음
		// ex끝it를 입력하면 반복문 종료 후 fc의 fileEdit()에 파일 명과 StringBuilder 전달
		System.out.print("수정할 파일명 : ");
		String file = sc.nextLine();
		if(!fc.checkName(file)) {
			System.out.println("없는 파일입니다.");
		}else {
			StringBuilder sb = new StringBuilder();
			while(true) {
				System.out.println("파일에 저장할 내용을 입력하세요");
				System.out.println("ex끝it 이라고 입력하면 종료됩니다.");
				System.out.print("내용 : ");
				String str = sc.nextLine();
				if(str.equals("ex끝it")) {
					break;
				}
				sb.append(str + "\n");
			}
		}
	}
	
}
