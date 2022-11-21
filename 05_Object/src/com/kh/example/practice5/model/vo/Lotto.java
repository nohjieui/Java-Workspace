package com.kh.example.practice5.model.vo;

import java.util.Arrays;

public class Lotto {
	
	//필드부
	private int[] lotto = new int[6];
	
	//초기화 블럭 사용
	{
		for(int i = 0; i<lotto.length; i++) {
			int random = (int)(Math.random()*45+1); // 현재 인덱스 기준으로 반복시 중복되는 값이 없도록 해야함
			lotto[i] = random;
			for(int j = 0; j < i; j++) {
				if(lotto[j] == random) {
					i--;
					break;
				}
			}
		}
	}
	//생성자부
	public Lotto() {
		
	}
	
	//메소드부
	public void setLotto(int[] lotto) {
		this.lotto = lotto;
	}
	
	public int[] getLotto() {
		return lotto;
	}
	
	public void infomation() {
		
		System.out.println(Arrays.toString(lotto));
//		for(int i = 0; i<lotto.length; i++) {
//			System.out.print(lotto[i] + " ");
//		}
	}

	
}
