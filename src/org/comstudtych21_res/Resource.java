package org.comstudtych21_res;

import java.util.Hashtable;

import org.comstudtych21_controller.Controller;
import org.comstudtych21_model.Dao;
import org.comstudtych21_view.Delete;
import org.comstudtych21_view.End;
import org.comstudtych21_view.Input;
import org.comstudtych21_view.Menu;
import org.comstudtych21_view.Modify;
import org.comstudtych21_view.MyView;
import org.comstudtych21_view.Output;

public interface Resource {
	// 자주 쓰일 상수와 객체를 인터페이스에서 구현.
	// 번호를 누르면 선택되게 만드는 것.
	int MENU = 1;
	int INPUT = 2;
	int OUTPUT = 3;
	int MODIFY= 4;
	int DELETE = 5;
	int END = 6;
	String phoneBookTitle = ":::: 전화번호부 프로그램 :::: ";
	// 해쉬테이블로 request라는 참조변수의 헤쉬테이블 타입 객체를 만들어준다  input할 때 정보를 꺼내기 위해서도 쓰고 output 결과물 출력할 때도 쓰인다.
	Hashtable<String, Object> request = new Hashtable<String, Object>(); //request의 용도 
	// MyView 클래스에 필요한 마이뷰 배열 타입의 인스턴스들 각각 객체이다. 배열 0번지에 menu객체가 있는것.
	MyView[] views = {new Menu(), new Input(), new Output(), new Modify(), new Delete(), new End()}; // 실질적으로 보이는 것들.
	
	Dao dao = new Dao();  // 아직 모르겠다.
	
	Controller controller = new Controller(); // 
	
}
