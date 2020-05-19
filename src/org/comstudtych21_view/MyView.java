package org.comstudtych21_view;

import org.comstudtych21_res.Resource;

public abstract class MyView implements Resource{ // MyView 콘솔에 시각화하는 파트
	public static String[] items = {"INPUT","OUTPUT","SEARCH","MODIFY","DELETE","END"}; 
	public static String[] viewTitle = {":::: INPUT ::::", ":::: OUTPUT ::::", ":::: SEARCH ::::", ":::: MODIFY ::::", ":::: DELETE ::::", ":::: END ::::",};
		
	public void show(int index) { // 보여주는 메소드 구현. 시각화 파트.
		System.out.println(viewTitle[index]);
		display();
	}
	
	public abstract void display();

}
