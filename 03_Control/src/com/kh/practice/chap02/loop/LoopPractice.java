package com.kh.practice.chap02.loop;

import java.util.Scanner;

public class LoopPractice {
	
	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num >= 1) {
			
			for(int i = 1; i <= num; i++) {
				System.out.print(i + " ");
			}
			
		} else {
			System.out.println("1 이상의 숫자를 입력해주세요.");
			practice1();
		}
		
	}
	
	public void practice2() {
		
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num >= 1) {
			for(int i = num; i > 0; i--) {
				System.out.print(i + " ");
			}
		} else {
			System.out.println("1 이상의 숫자를 입력해주세요");
			practice2();
		}
		
	}

	
	public void practice3() {
		
		System.out.print("정수를 하나 입력하세요 : ");
		int num = sc.nextInt();
		
		int sum = 0;
		
		for(int i = 1; i <= num; i++) {
			if(i == num) {
				System.out.print(i);
			} else {
				System.out.print(i + " + ");
			}
			sum += i;
		}
		System.out.print(" = " +sum);
		
	}
	
	
	public void practice4() {
		
		System.out.print("첫 번째 숫자 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두 번째 숫자 : ");
		int num2 = sc.nextInt();
		
		if(num1 > 0 && num2 > 0) {
			if(num1 <= num2) {
				for(int i = num1; i <= num2; i++) {
					System.out.print(i + " ");
				}
			} else if(num1 > num2) {
				for(int i = num2; i <= num1; i++) {
					System.out.print(i + " ");
				}
			}
		} else {
			System.out.println("1 이상의 숫자를 입력해주세요");
			practice4();
		}
		
		
		
	}
	
	
	public void practice5() {
		
		System.out.print("숫자 : ");
		int dan = sc.nextInt();
		
		
		if(dan > 1 && dan < 10) {
			System.out.printf("===== %d단 ===== \n", dan);
			for(int i = 1; i <= 9; i++) {
				System.out.printf("%d X %d = %d \n", dan, i, dan*i);
			}
		
		} else {
			System.out.println("9 이하의 숫자를 입력해주세요");
			practice5();
		}
		
	}	
	
	
	public void practice6() {
//		사용자로부터 시작 숫자와 공차를 입력 받아
//		일정한 값으로 숫자가 커지거나 작아지는 프로그램을 구현하세요.
//		단, 출력되는 숫자는 총 10개입니다.
		
		System.out.print("시작 숫자 : ");
		int num = sc.nextInt();
		
		System.out.print("공차 : ");
		int gong = sc.nextInt();
		
		for(int i = 1; i <=10; i++) { //10번 반복
			System.out.print(num + " ");
			num += gong;
		}
		
	}
	
	
	public void practice8() {
//		*\n
//		**\n
//		***\n
//		****\n

		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for(int i = 1; i<=num; i++) { // 1 2 3 4
			
			for(int j = 0; j<i; j++) { //* 1 2 3 4
				System.out.print("*");
			}
			System.out.println();
		}
		
//		for(int j = 0; j<1; j++) { //*
//			System.out.print("*");
//		}
//		System.out.println();
//		
//		for(int j = 0; j<2; j++) { //**
//			System.out.print("*");
//		}
//		System.out.println();
//
//		for(int j = 0; j<3; j++) { //***
//			System.out.print("*");
//		}
	}
	
	
	public void practice9() {
		//****
		//***
		//**
		//*
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt(); //4
		
		for(int i = num; i >= 1; i--) { // 1 2 3 4 -> 4 3 2 1
			
			for(int j = 1; j <= i; j++) {
				System.out.print("*"); 
			}
			System.out.println();
		}
		
//		//****
//		for(int j = 1; j <5; j++) {
//			System.out.print("*"); 
//		}
//		System.out.println();
//		
//		//***
//		for(int j = 1; j <4; j++) {
//			System.out.print("*"); 
//		}
//		System.out.println();
//		
//		//**
//		for(int j = 1; j <3; j++) {
//			System.out.print("*"); 
//		}
//		System.out.println();
//		
//		//*
//		for(int j = 1; j <2; j++) {
//			System.out.print("*"); 
//		}
//		System.out.println();
	}
	
	
	public void practice10() {
		//   *
		//  **
		// ***
		//****
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for(int i = 0; i<num; i++) { // 0 1 2 3
			
			for(int j = 1; j < num - i; j++) { // 1 2 3
				System.out.print(" "); //   ;
			}
			for(int j = 1; j < 2 + i; j++) { // 1
				System.out.print("*"); // *
			}
			System.out.println(); //   *\n
		}
		
		
		
		
//		//   *
//		for(int j = 1; j < 4; j++) { // 1 2 3
//			System.out.print(" "); //   ;
//		}
//		for(int j = 1; j<2; j++) { // 1
//			System.out.print("*"); // *
//		}
//		System.out.println(); //   *\n
//
//		//  **
//		for(int j = 1; j < 3; j++) { // 1 2
//			System.out.print(" "); //  ;
//		}
//		for(int j = 1; j<3; j++) { // 1 2
//			System.out.print("*"); // **
//		}
//		System.out.println(); //   *\n
//		
//		// ***
//		for(int j = 1; j < 2; j++) { // 1 
//			System.out.print(" "); // ;
//		}
//		for(int j = 1; j < 4; j++) { // 1 2 3
//			System.out.print("*"); // ***
//		}
//		System.out.println(); //   *\n
	}
	
	
	public void practice11() {
		//****
		// ***
		//  **
		//   *
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt(); //4
	
		for(int i = 0; i < num; i++) {
			for(int j = 0; j < i; j++) {
			System.out.print(" ");
			}
			for(int j = 0; j < num-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
//		//****
//		for(int j = 0; j<4; j++) {
//			System.out.print("*");
//		}
//		System.out.println();
//		
//		// ***
//		for(int j = 0; j<1; j++) {
//			System.out.print(" ");
//		}
//		for(int j = 0; j < 3; j++) {
//			System.out.print("*");
//		}
//		System.out.println();
//
//		//  **
//		for(int j = 0; j<2; j++) {
//			System.out.print(" ");
//		}
//		for(int j = 0; j < 2; j++) {
//			System.out.print("*");
//		}
//		System.out.println();
//		
//		//   *
//		for(int j = 0; j<3; j++) {
//			System.out.print(" ");
//		}
//		for(int j = 0; j < 1; j++) {
//			System.out.print("*");
//		}
//		System.out.println();
		
		
	}
	
	
	public void practice12() {
		//   *
		//  ***
		// *****
		//*******
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt(); // 4
		
		for(int i = 0; i < num; i++) { // 0 1 2 3
			for(int j = 0; j < num - (1 + i); j++) { // 3 2 1 0
				System.out.print(" ");
			}
			for(int j = 0; j < 1+(2*i); j++) { // 1 3(1+2) 5(1+4) 7(1+6)
				System.out.print("*");
			}
			System.out.println();
		}
		
		
//		//   *   
//		for(int j = 0; j < 3; j++) {
//			System.out.print(" ");
//		}
//		for(int j = 0; j < 1; j++) {
//			System.out.print("*");
//		}
//		System.out.println();
//		
//		//  ***   
//		for(int j = 0; j < 2; j++) {
//			System.out.print(" ");
//		}
//		for(int j = 0; j < 3; j++) {
//			System.out.print("*");
//		}
//		System.out.println();
//		
//		// *****   
//		for(int j = 0; j < 1; j++) {
//			System.out.print(" ");
//		}
//		for(int j = 0; j < 5; j++) {
//			System.out.print("*");
//		}
//		System.out.println();
//		
//		//*******  
//		for(int j = 0; j < 0; j++) {
//			System.out.print(" ");
//		}
//		for(int j = 0; j < 7; j++) {
//			System.out.print("*");
//		}
//		System.out.println();
		
	}
	
	public void practice14() {
//		2부터 사용자가 입력한 수까지의 소수를 모두 출력하고 소수의 개수를 출력하세요.
//		단, 입력한 수가 2보다 작은 경우 “잘못 입력하셨습니다.”를 출력하세요.
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		
		if(num < 2) {
			System.out.println("잘못 입력하였습니다.");
			return;
		}
		
		int count = 0;

		for(int i = 2; i <= num; i++) {
			boolean isPrime = true;
			// i 값이 소수인지 아닌지 검사를 함.
			for(int j = 2; j < i; j++) {
				if(i % j == 0) {
					isPrime = false;
					break;
				}
			}
			
			if(isPrime) {
				System.out.print(i + " ");
				count++;
			}
			// i 값이 소수라면 출력을 하고, 값을 1 증가시킴.
		}
		
		System.out.printf("\n2부터 %d까지의 소수의 개수는 %d개 입니다.", num, count);
			
		
	}
	
	public void practice18() {
		//  *
		// ***
		//*****
		// ***
		//  *
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt(); //3
		
		
		for(int i = 0; i < num; i++) {
			for(int j = 0; j < num - (1 + i); j++) {
				System.out.print(" ");
			}
			for(int j = 0; j < 1 + (i*2); j++) {
				System.out.print("*");
			}
			System.out.println();
			} 
		for(int i = 0; i < num-1; i++) {
			
			for(int j = 0; j < 1+i; j++) {
			System.out.print(" ");
			}
			for(int j = 0; j < (num-1)*2-3; j++) {
				System.out.print("*");
			}
			System.out.println();

		
		}
		
		
//		//  *
//		for(int j = 0; j < 2; j++) {
//			System.out.print(" ");
//		}
//		for(int j = 0; j < 1; j++) {
//			System.out.print("*");
//		}
//		System.out.println();
//		
//		// ***
//		for(int j = 0; j < 1; j++) {
//			System.out.print(" ");
//		}
//		for(int j = 0; j < 3; j++) {
//			System.out.print("*");
//		}
//		System.out.println();
//		
//		//*****
//		for(int j = 0; j < 0; j++) {
//			System.out.print(" ");
//		}
//		for(int j = 0; j < 5; j++) {
//			System.out.print("*");
//		}
//		System.out.println();
//		
//		// ***
//		for(int j = 0; j < 1; j++) {
//			System.out.print(" ");
//		}
//		for(int j = 0; j < 3; j++) {
//			System.out.print("*");
//		}
//		System.out.println();
//		
//		//  *
//		for(int j = 0; j < 2; j++) {
//			System.out.print(" ");
//		}
//		for(int j = 0; j < 1; j++) {
//			System.out.print("*");
//		}
//		System.out.println();
//		
	}
	
	
}
