package com.kh.run;

import com.kh.variable.*;	//*을 사용하면 com.kh.variable.밑에 있는 클래스를 모두 가져오겠다는 의미

public class Run {

	public static void main(String[] args) {
		
		A_Variable av = new A_Variable();
//		av.printVariable();
//		av.declareVariable();
//		av.initVariable();
//		av.constantVariable();
		
		B_KeyboardInput bk = new B_KeyboardInput();
//		bk.inputTest1();
//		bk.inputTest2();
		
		C_Cast cc = new C_Cast();
//		cc.autoCasting();
//		cc.forceCasting();
		
		D_Printf dp = new D_Printf();
		dp.printFtest();
				
		
		
		
	}
	
}
