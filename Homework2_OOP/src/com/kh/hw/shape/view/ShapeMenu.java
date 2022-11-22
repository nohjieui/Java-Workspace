package com.kh.hw.shape.view;

import java.util.Scanner;
import com.kh.hw.shape.controller.SquareController;
import com.kh.hw.shape.controller.TriangleController;

public class ShapeMenu {
	
	private Scanner sc = new Scanner(System.in);
	private SquareController scr = new SquareController();
	private TriangleController tc = new TriangleController();
	
	//삼각형과 사각형을 선택하게 하는 메소드
	public void inputMenu() {
		while(true) {
			System.out.println("==== 도형프로그램 ====");
			System.out.println("3. 삼각형");
			System.out.println("4. 사각형");
			System.out.println("9. 프로그램 종료");
			
			System.out.print("메뉴 번호 : ");
			int num = sc.nextInt();
			
			switch(num) {
			case 3 : triangleMenu(); break;
			case 4 : sqareMenu(); break;
			case 9 : System.out.println("프로그램이 종료되었습니다."); return;
			default : System.out.println("잘못된 번호입니다. 다시 입력하세요");
			}
		}
	}
	
	//삼각형 메뉴 출력 메소드
	public void triangleMenu() {
		while(true) {

			System.out.println("==== 삼각형 ====");
			System.out.println("1. 삼각형 면적");
			System.out.println("2. 삼각형 색칠");
			System.out.println("3. 삼각형 정보");
			System.out.println("9. 메인으로");
			
			System.out.print("메뉴 번호 : ");
			int num = sc.nextInt();
			
			switch(num) {
			case 1 : inputSize(3, 1); break;
			case 2 : inputSize(3, 2); break;
			case 3 : printInformation(3); break;
			case 9 : System.out.println("메인으로 돌아갑니다."); return;
			default : //없어도됨
			}
		}
		
	}
	
	//사각형 메뉴 출력 메소드
	public void sqareMenu() {
		while(true) {
			
			System.out.println("==== 사각형 ====");
			System.out.println("1. 사각형 둘레");
			System.out.println("2. 사각형 면적");
			System.out.println("3. 사각형 색칠");
			System.out.println("4. 사각형 정보");
			System.out.println("9. 메인으로");
			
			System.out.print("메뉴 번호 : ");
			int num = sc.nextInt();
			
			switch(num) {
			case 1 : inputSize(4, 1); break;
			case 2 : inputSize(4, 2); break;
			case 3 : inputSize(4, 3); break;
			case 4 : printInformation(4); break;
			case 9 : System.out.println("메인으로 돌아갑니다.");return;
			default : //없어도됨
			}
		}
	}
	
	//너비와 높이를 받아 요청사항을 처리하거나 색깔을 받아 요청사항을 처리하는 메소드
	public void inputSize(int type, int menuNum) {
		double d = 0.0;
		if(type == 3) { // 삼각형일때
			if(menuNum == 1) {
				System.out.print("높이 : ");
				int height = sc.nextInt();
				System.out.print("너비 : ");
				int width = sc.nextInt();
				System.out.print("삼각형의 면적 : ");
				d = tc.calcArea(height, width);
				System.out.println(d);
			} else {
				sc.nextLine();
				System.out.print("색깔을 입력하세요 : ");
				String color = sc.nextLine();
				tc.paintColor(color);
				System.out.println("색이 수정되었습니다.");
			}
		} else { // 사각형일때
			if(menuNum == 3) {
				sc.nextLine();
				System.out.print("색깔을 입력하세요 : ");
				String color = sc.nextLine();
				scr.paintColor(color);
				System.out.println("색이 수정되었습니다.");

			} else {
				System.out.print("높이 : ");
				int height = sc.nextInt();
				System.out.print("너비 : ");
				int width = sc.nextInt();
				if(menuNum == 1) {
					System.out.print("사각형의 둘레 : ");
					d = scr.calcPerimeter(height, width);
				} else {
					System.out.print("사각형의 면적 : ");
					d = scr.calcArea(height, width);
				}
				System.out.println(d);
			}
		}
	}
	
	//매개변수에 따라 삼각형/사각형의 정보를 출력하는 메소드
	public void printInformation(int type) {
		String result = "";
		if(type == 3) {
			result = tc.print();
		} else {
			result = scr.print();
		}
		System.out.println(result);
	}

}
