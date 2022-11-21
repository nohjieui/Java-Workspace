package com.kh.hw.shape.view;

import java.util.Scanner;
import com.kh.hw.shape.controller.SquareController;
import com.kh.hw.shape.controller.TriangleController;

public class ShapeMenu {
	
	Scanner sc = new Scanner(System.in);
	SquareController scr = new SquareController();
	TriangleController tc = new TriangleController();
	
	public void inputMenu() {
		System.out.println("==== 도형프로그램 ====");
		System.out.println("3. 삼각형");
		System.out.println("4. 사각형");
		System.out.println("9. 프로그램 종료");
		
		System.out.print("메뉴 번호 : ");
		int num = sc.nextInt();
		
		if(num == 3) {
			System.out.println("==== 삼각형 ====");
		} else if(num == 4) {
			System.out.println("==== 사각형 ====");
		} else if(num == 9) {
			System.out.println("프로그램을 종료합니다.");
		} else {
			System.out.println("잘못된 번호입니다. 다시 입력하세요");
		}
		
	}
	
	public void triangleMenu() {
		System.out.println("1. 삼각형 면적");
		System.out.println("2. 삼각형 색칠");
		System.out.println("3. 삼각형 정보");
		
		System.out.print("메뉴 번호 : ");
		int num = sc.nextInt();
		
		
			
	}
	
	public void sqareMenu() {
		
	}
	
	public void inputSize(int type, int menuNum) {
		
	}
	
	public void pringInformation(int type) {
		
	}
	

}
