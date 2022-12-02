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
			System.out.print("메뉴번호 : ");
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
		
		// “ex끝it”를 입력할 때까지 사용자가 입력하게 하고 그 값들을 StringBuilder에 저장
		
		// 저장할 파일 명을 입력해주세요(ex. myFile.txt) :
		// 저장할 파일 명을 사용자에게 받는데 이 때 이미 존재하는 파일 명이라면
		// “이미 존재하는 파일입니다. 덮어쓰시겠습니까?(y/n)”가 출력됨
		// y를 입력하면 FileController(fc)에 fileSave() 메소드로 파일 명과 StringBuilder 넘김
		// n를 입력하면 “저장할 파일 명을 입력해주세요 ~”가 다시 나오게끔 반복
		// 만일 저장할 파일 명이 존재하지 않는 파일 명이었다면
		// 파일 명과 내용을 fc에 fileSave 메소드로 넘김
		StringBuilder sb = new StringBuilder(); // while문 안에서 선언하지 않는 이유는 안쪽에 선언시 반복진행 되면서 계속해서 객체가 생성되기 때문
		
		while(true) {
			System.out.println("파일에 저장할 내용을 입력하세요.");
			System.out.println("ex끝it 이라고 입력하면 종료됩니다.");
			System.out.print("내용 : ");
			String str = sc.nextLine();
			if(str.equals("ex끝it")) {
				break;
			}
			sb.append(str + "\n");// append메서드의 매개변수로 내용 : 에 입력받은 문자를 계속 입력받음
		}
		while(true) {
			System.out.print("저장할 파일 명을 입력해주세요(ex.myFile.txt) : ");
			String file = sc.nextLine();
			
			if(fc.checkName(file)) { // file이라는 이름이 이미 존재하는 경우
				System.out.println("이미 존재하는 파일입니다. 덮어쓰시겠습니까?(y/n) : ");
				char yes = sc.nextLine().charAt(0);
				if(yes == 'y' || yes == 'Y') { // 덮어씌우기
					fc.fileSave(file, sb);
				}else { //이어쓰기
					System.out.println("파일명을 다시 입력해주세요.");
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
		if(fc.checkName(file)) { // 파일이 있음.
			System.out.println(fc.fileOpen(file));
		}else { // 파일이 없음.
			System.out.println("없는 파일입니다.");
		}
	}
	
	public void fileEdit() {
		System.out.print("수정할 파일 명 : ");
		String editfile = sc.nextLine();
		// 받은 파일 명을 fc에 checkName()의 매개변수로 넘겨 반환 값에 따라 나뉨
		// 반환 값이 false일 경우 “없는 파일입니다.” 출력 후 mainMenu()로 돌아감
		// 반환 값이 true일 경우 fileSave()처럼 안내문 출력 후 내용에 대해 받음
		// ex끝it를 입력하면 반복문 종료 후 fc의 fileEdit()에 파일 명과 StringBuilder 전달

	}
	
}
