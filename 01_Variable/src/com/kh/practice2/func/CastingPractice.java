package com.kh.practice2.func;

import java.util.Scanner;

public class CastingPractice {
	
	public void test1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		double ko = sc.nextDouble();
		
		System.out.print("영어 : ");
		double eg = sc.nextDouble();
		
		System.out.print("수학 : ");
		double ma = sc.nextDouble();
		
		System.out.printf("총점 : %.0f \n", ko+eg+ma);
		System.out.printf("평균 : %.0f \n", (ko+eg+ma)/3);
		
	}

}
