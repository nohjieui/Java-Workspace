package com.kh.practice.chap01;

import java.util.Scanner;

public class ControlPractice {
	
	public void practice1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("7. 종료");
		
		System.out.print("메뉴 번호를 입력하세요 : ");
		int num = sc.nextInt();
		
		String menu = "";		
		
		switch(num) {
		case 1 : menu = "입력"; break;
		case 2 : menu = "수정"; break;
		case 3 : menu = "조회"; break;
		case 4 : menu = "삭제"; break;
		case 7 : menu = "종료"; break;
		}
		if (menu.equals("종료")) {
			System.out.println("프로그램이 종료됩니다.");
		} else {
			System.out.println(menu + " 메뉴입니다");
		}
		
	}
	
	public void practice2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 한 개 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num > 0 && num % 2 == 0) {
			System.out.println("짝수다.");
		} else if (num > 0 && num % 2 != 0) {
			System.out.println("홀수다.");
		} else {
			System.out.println("양수만 입력해주세요.");
		}
			
	}
	
	public void practice3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어점수 : ");
		int kor = sc.nextInt();

		System.out.print("수학점수 : ");
		int math = sc.nextInt();
		
		System.out.print("영어점수 : ");
		int eng = sc.nextInt();
		
		int sum = kor + math + eng;
		double avg = sum / 3.0;
		
		
		if (kor >= 40 && math >= 40 && eng >= 40 && avg >= 40) {
			System.out.println("국어 : " + kor);
			System.out.println("수학 : " + math);
			System.out.println("영어 : " + eng);
			System.out.println("합계 : " + sum);
			System.out.println("평균 : " + avg);
			System.out.println("축하합니다, 합격입니다!");
		} else {
			System.out.println("불합격입니다.");
		}
		
	}

	public void practice4() {
		
		Scanner sc = new Scanner(System.in);
		
		
		
	}
	
	public void practice5() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("아이디 : ");
		String id = sc.nextLine();
		
		System.out.print("비밀번호 : ");
		String pw = sc.nextLine();
		
		if (id.equals("shwldml")) {
			if(pw.equals("noh0000")) {
				System.out.println("로그인 성공");
			} else { 
				System.out.println("비밀번호가 틀렸습니다.");
			}
		} else {
			System.out.println("아이디가 틀렸습니다.");
		}
		
		
		
	}
	
	public void practice6() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("권한을 확인하고자 하는 회원 등급");
		String level = sc.nextLine();
		
		switch (level){
		case "관리자 " : System.out.println("회원관리, 게시글 관리, ");
		case "회원" : System.out.println("게시글 작성, 댓글 작성, ");
		case "비회원" : System.out.println("게시글 조회, ");
		}
		
		
		
	}
	
	public void practice7() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("키(m)를 입력해 주세요 : ");
		double m = sc.nextDouble();
		
		System.out.print("몸무게(kg)를 입력해 주세요 : ");
		double kg = sc.nextDouble();
		
		double bmi = kg / (m * m);
		
		System.out.println("BMI 지수 : " + bmi);
		
		if(bmi < 18.5) {
			System.out.println("저체중");
		} else if (bmi < 23) {
			System.out.println("정상체중");
		} else if(bmi < 25) {
			System.out.println("과체중");
		} else if(bmi < 30) {
			System.out.println("비만");
		} else {
			System.out.println("고도비만");
		}
		
		
		
	}
	
	public void practice8() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("피연산자1 입력 : ");
		int num1 = sc.nextInt();
		
		System.out.print("피연산자2 입력 : ");
		int num2 = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("연산자(+,-,*,/,%) : " ) ;
		char op = sc.nextLine().charAt(0);
		
		double result = 0;
		
		switch (op) {
		case '+' : result = (num1 + num2);
		case '-' : result = (num1 - num2);
		case '*' : result = (num1 * num2);
		case '/' : result = (num1 / num2);
		case '%' : result = (num1 % num2);
		default : System.out.println("잘못 입력하였습니다. 프로그램을 종료합니다.");
		}
		
		System.out.printf("%d %c %d = %f", num1, op, num2, result);
		
		
		
	}
	
	public void practice9() {
		
		Scanner sc = new Scanner(System.in);
		
		
		
	}
	
	public void practice10() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. 메뉴 출력");
		System.out.println("2. 짝수/홀수");
		System.out.println("3. 합격/불합격");
		System.out.println("4. 계절");
		System.out.println("5. 로그인");
		System.out.println("6. 권한 확인");
		System.out.println("7. BMI");
		System.out.println("8. 계산기");
		System.out.println("9. P/F");
		
		System.out.print("선택 : ");
		
		int num = sc.nextInt();
		
//		switch(num) {
//		case 1 : practice1(); 
//		case 2 : practice2(); 
//		case 3 : practice3();
//		case 4 : practice4(); 
// 		case 5 : practice5(); 
//		case 6 : practice6();
//		case 7 : practice7(); 
//		case 8 : practice8();
//		case 9 : practice9();
//		}
		
		
		
		
	}
	
	public void practice11() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("비밀번호 입력(1000~9999) : ");
		int pw = sc.nextInt();
		
		if(pw > 999 && pw < 9999) {	//자리수 체크
			int first = pw % 10; //일의자릿수 구하기
			int second = (pw / 10) % 10; //십의자릿수 구하기
			int third = (pw / 100) % 10; //백의자릿수 구하기
			int forth = (pw / 1000) % 10; //천의자릿수 구하기
			//중복값이 있는지 처리하기
			if((first != second) && (first != third) && (first != forth) && (second != third) && (second != forth) && (third != forth)) {
				System.out.println("성공");
			} else {
				System.out.println("중복 값 있음");
			}
		} else { //자리수가 3자리 이거나, 5자리 이상인 경우
			System.out.println("자리수 안맞음");//자리수 안맞음 출력
		}
		
	}
	

}
