package org.comstudtych21_app;

import static org.comstudtych21_res.Resource.*; // 인터페이스안에 상수를 참조하기 위해 가져온다.

import org.comstudtych21_controller.Controller;

public class MainDriver {
	public static void main(String[] args) {
		
		System.out.println(phoneBookTitle); // 인터페이스의 상수화를 통해서 타이틀 출력
		controller.service(); // 컨트롤러 객체에 생성된것
	}
}
