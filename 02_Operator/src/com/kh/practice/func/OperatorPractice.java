package com.kh.practice.func;

import java.util.Scanner;

public class OperatorPractice {
	
	public void practice1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("인원 수 : ");
		int num = sc.nextInt();
		
		System.out.print("사탕 개수 : ");
		int candy = sc.nextInt();
		
		System.out.println("1인당 사탕 개수 : "+ (candy / num));
		System.out.println("남는 사탕 개수 : "+ (candy % num));
		
	}
	
	public void practice2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("학년(숫자만) : ");
		int grade = sc.nextInt();
		
		System.out.print("반(숫자만) : ");
		int group = sc.nextInt();
		
		System.out.print("번호(숫자만) : ");
		int num = sc.nextInt();

		sc.nextLine();
		
		System.out.print("성별(M/F) : ");
//		sc.nextLine();
//		String gender = sc.nextLine().charAt(0) == 'M' ? " 남학생 " : " 여학생 ";
		char gender = sc.nextLine().charAt(0);
		
		System.out.print("성적(소수점 아래 둘째자리까지) : ");
		double result = sc.nextDouble();
		
//		System.out.println(grade + "학년 " + group +"반 " + num + "번 " + name + gender + "성적은 " + result + "이다.");
		System.out.printf("%d학년 %d반 %d번 %s %s의 성적은 %.2f이다.", grade, group, num, name, (gender == 'M' ? "남학생" : "여학생"), result);
		
	}
	
	public void practice3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		System.out.println(age <=13 ? "어린이" : (age > 19 ? "성인" : "청소년"));
		
	}
	
	public void practice4() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		int kor = sc.nextInt();
		
		System.out.print("영어 : ");
		int eng = sc.nextInt();
		
		System.out.print("수학 : ");
		int math = sc.nextInt();
		
		int sum = kor + eng + math;
		double ave = sum / 3.0;
		
		String result = ((kor >= 40 && eng >= 40 && math >= 40) && (ave >=60)) ? "합격" : "불합격";

		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + ave);
		System.out.println(result);
		
	}
	
	public void practice5() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주민번호를 입력하세요(- 포함) : ");
		
//		char gender = sc.nextLine().charAt(7); //012345-7
//		String result = (gender == '1' && gender =='3') ? "남자" : "여자";
		
		String resNo = sc.nextLine(); //012345-7
		char gender = resNo.charAt(7);
		
		String result = (gender == '1' || gender =='3') ? "남자" : "여자";
		
		System.out.println(result);
		
	}
	
	public void practice6() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("정수2 : ");
		int num2 = sc.nextInt();
		
		System.out.print("입력 : ");
		int num3 = sc.nextInt();
		
		boolean result = (num3 <= num1) || (num3 > num2);
		
		System.out.println(result);
		
	}
	
	public void practice7() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("입력2 : ");
		int num2 = sc.nextInt();
		
		System.out.print("입력3 : ");
		int num3 = sc.nextInt();
		
		boolean result = (num1 == num2) && (num2 == num3);
		
		System.out.println(result);
		
	}
	
	public void practice8() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("A사원의 연봉 : ");
		int a = sc.nextInt();
		
		System.out.print("B사원의 연봉 : ");
		int b = sc.nextInt();
		
		System.out.print("C사원의 연봉 : ");
		int c = sc.nextInt();
		
		double ai = a * 1.4;
		double bi = b;
		double ci = c * 1.15;
		
		System.out.println("A사원 연봉/연봉+a : " + a + "/" + ai);
		System.out.println((ai >= 3000) ? "3000 이상" : "3000 미만");
		
		System.out.println("B사원 연봉/연봉+a : " + b + "/" + bi);
		System.out.println((bi >= 3000) ? "3000 이상" : "3000 미만");
		
		System.out.println("C사원 연봉/연봉+a : " + c + "/" + ci);
		System.out.println((ci >= 3000) ? "3000 이상" : "3000 미만");
		
	}
	
}
