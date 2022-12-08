package com.kh.chap03_sync.sync;

// 1개의 계좌
// 2개의 ATM기
public class Account {

	private int balance = 1200; // 현재계좌의 잔고
	
	public int getBalance() {
		return balance;
	}
	
	// 출금메소드
	public /*synchronized -> 동기화방법 1*/ void withdraw(int money) {
		synchronized(this) { // 동기화방법 2
			                 // synchronized(this) 내가 격리시킬 객체 : this -> Account
			String thName = Thread.currentThread().getName();
			System.out.println("현재 잔액은 ? : "+ balance);
			if(money <= balance) { //1200원에서 100원만 출금하려고 할 때
				balance -= money;
				System.out.printf("[%s] %d원 출금 >>> 잔액 : %d원 남았습니다. \n", thName, money, balance);
			} else {
				System.out.printf("[%s] %d원 출금시도 >>> 잔액이 부족합니다, \n", thName, money);
			}
		}
	}
}
