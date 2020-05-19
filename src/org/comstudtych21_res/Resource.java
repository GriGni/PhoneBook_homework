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
	// ���� ���� ����� ��ü�� �������̽����� ����.
	// ��ȣ�� ������ ���õǰ� ����� ��.
	int MENU = 1;
	int INPUT = 2;
	int OUTPUT = 3;
	int MODIFY= 4;
	int DELETE = 5;
	int END = 6;
	String phoneBookTitle = ":::: ��ȭ��ȣ�� ���α׷� :::: ";
	// �ؽ����̺�� request��� ���������� �콬���̺� Ÿ�� ��ü�� ������ش�  input�� �� ������ ������ ���ؼ��� ���� output ����� ����� ���� ���δ�.
	Hashtable<String, Object> request = new Hashtable<String, Object>(); //request�� �뵵 
	// MyView Ŭ������ �ʿ��� ���̺� �迭 Ÿ���� �ν��Ͻ��� ���� ��ü�̴�. �迭 0������ menu��ü�� �ִ°�.
	MyView[] views = {new Menu(), new Input(), new Output(), new Modify(), new Delete(), new End()}; // ���������� ���̴� �͵�.
	
	Dao dao = new Dao();  // ���� �𸣰ڴ�.
	
	Controller controller = new Controller(); // 
	
}
