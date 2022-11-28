package com.kh.hw.member.view;

import java.util.Scanner;

import com.kh.hw.member.controller.MemberController;

public class MemberMenu {
	
	private Scanner sc = new Scanner(System.in);
	private MemberController mc = new MemberController();
	
	public MemberMenu() {
		super();
	}
	
	public void mainMenu() {
		while(true) {
			System.out.printf("최대 등록 가능한 회원 수는 %d명입니다.\n", MemberController.SIZE);
			int existNum = mc.existMemberNum();
			System.out.printf("현재 등록된 회원 수는 %d명입니다.\n",existNum);
			
			if(existNum != mc.SIZE) {
				System.out.println("1. 새 회원 등록");
			}
			System.out.println("2. 회원 검색");
			System.out.println("3. 회원 정보 수정");
			System.out.println("4. 회원 삭제");
			System.out.println("5. 모두 출력");
			System.out.println("9. 끝내기");
			System.out.print("메뉴번호 : ");
			int num = sc.nextInt();
			
			switch(num) {
			case 1 : 
				if(existNum != mc.SIZE) {
					insertMember();
				} else {
					System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				}
				break;
			case 2 : searchMember(); break;
			case 3 : updateMember(); break;
			case 4 : deleteMember(); break;
			case 5 : printAll(); break;
			case 9 : System.out.println("프로그램을 종료합니다."); return;
			default : System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}
		
	}
	
	public void insertMember() {
		// 회원 등록에 필요한 아이디, 이름, 비밀번호, 이메일, 성별, 나이를 사용자에게 직접 입력 받되 
		// 아이디의 경우 기존 회원의 아이디와 중복되지 않도록 mc의 checkId()메소드를 통해서 중복 검사를 함
		// 중복 검사를 한 결과 값에 따라 중복 값이 없으면 다음으로 넘어가고 있으면 “중복된 아이디입니다. 다시 입력해주세요.”라는 문구를 출력 후 다시 아이디를 받도록 함
		// 성별의 경우 M이나 m, F나 f가 아니면 “성별을 다시 입력하세요.”를 출력 후 다시 성별을 입력하도록 함
		// 아이디부터 나이까지 모든 데이터를 받았으면 mc의 insertMember메소드의 매개변수로 넘김
		System.out.println("새 회원을 등록합니다.");
		sc.nextLine();
		System.out.print("아이디 : ");
		String id = sc.nextLine();
		if(mc.checkId(id)) {
			System.out.println("중복된 아이디입니다. 다시 입력해주세요.");
			System.out.print("아이디 : ");
			id = sc.nextLine();
		}
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("비밀번호 : ");
		String password = sc.nextLine();
		System.out.print("이메일 : ");
		String email = sc.nextLine();
		System.out.print("성별 : ");
		char gender = sc.nextLine().charAt(0);
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		mc.insertMember(id, name, password, email, gender, age);
		
	}
	
	public void searchMember() {
		
	}
	public void searchId() {
		System.out.println("1. 아이디로 검색하기");
		System.out.println("2. 이름으로 검색하기");
		System.out.println("3. 이메일로 검색하기");
		System.out.println("9. 메인으로 돌아가기");
		System.out.print("메뉴 번호 : ");
		int num = sc.nextInt();
		
		switch(num) {
		case 1 : searchId(); break;
		case 2 : searchName(); break;
		case 3 : searchEmail(); break;
		case 9 : 
		}
	}
	public void searchName() {
		
	}
	public void searchEmail() {
		
	}
	
	public void updateMember() {
		
	}
	public void updatePassword() {
		
	}
	public void updateName() {
		
	}
	public void updateEmail() {
		
	}
	
	public void deleteMember() {
		
	}
	public void deleteOne() {
		
	}
	public void deleteAll() {
		
	}
	
	public void printAll() {
		
	}

	
}
