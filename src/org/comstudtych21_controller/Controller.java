package org.comstudtych21_controller;

import org.comstudtych21_res.Resource;

public class Controller implements Resource { //��Ʈ�ѷ��� �������̽��� ����. �������̽����� ����� �߻�޼ҵ� ���𰡴�. (�ϴ� ���ǰ� �ʿ��� ��.)
	//��Ʈ�ѷ��� ��� �����Ұ������� �´� ǥ���ε�
	public void service() {
		views[MENU].show(MENU);  //views[] �迭���� MENU�� show(MENU)�� �������̽��� 0���� �ʱ�ȭ �Ǿ������ϱ� ��밡�� show �Լ������� int �Ű�������.
	}
}
