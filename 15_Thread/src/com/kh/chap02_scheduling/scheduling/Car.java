package com.kh.chap02_scheduling.scheduling;

public class Car implements Runnable{

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()); // currentThread() : 현재 실행중인 Thread를 반환받고 getName()으로 그 이름을 알아올 수 있음
		
		for(int i = 0; i< 20; i++) {
			
			try {
				System.out.println("Car driving...");
				Thread.sleep(100); // 스레드를 지정된 시간(ms)만큼 지연시키는(일시정지시키는) 메서드
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
		}
	}
	
}
