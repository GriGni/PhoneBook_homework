package org.comstudtych21_view;

import org.comstudtych21_res.Resource;

public abstract class MyView implements Resource{ // MyView �ֿܼ� �ð�ȭ�ϴ� ��Ʈ
	public static String[] items = {"INPUT","OUTPUT","SEARCH","MODIFY","DELETE","END"}; 
	public static String[] viewTitle = {":::: INPUT ::::", ":::: OUTPUT ::::", ":::: SEARCH ::::", ":::: MODIFY ::::", ":::: DELETE ::::", ":::: END ::::",};
		
	public void show(int index) { // �����ִ� �޼ҵ� ����. �ð�ȭ ��Ʈ.
		System.out.println(viewTitle[index]);
		display();
	}
	
	public abstract void display();

}
