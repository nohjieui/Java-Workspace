package practice3.controller;

import practice3.model.vo.*;

public class AnimalManager {

	public static void main(String[] args) {
		
		Animal[] a = new Animal[5];
		
		a[0] = new Dog("도행", "말티즈", 5);
		a[1] = new Cat("키키", "키키", "집", "검정");
		a[2] = new Cat("지지", "지지", "숲", "바둑");
		a[3] = new Dog("익돌", "비숑", 7);
		a[4] = new Cat("나비", "나비", "나무", "하양");
		
		for(int i = 0; i <a.length; i++) {
			a[i].speak();
		}

	}

}
