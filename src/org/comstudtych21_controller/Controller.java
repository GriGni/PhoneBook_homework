package org.comstudtych21_controller;

import org.comstudtych21_res.Resource;

public class Controller implements Resource { //컨트롤러는 인터페이스와 연결. 인터페이스에는 상수와 추상메소드 선언가능. (일단 강의가 필요할 듯.)
	//컨트롤러는 어떻게 연결할것인지가 맞는 표현인듯
	public void service() {
		views[MENU].show(MENU);  //views[] 배열에서 MENU를 show(MENU)는 인터페이스에 0으로 초기화 되어있으니까 사용가능 show 함수에서도 int 매개변수다.
	}
}
