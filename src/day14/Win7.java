package day14;

import java.util.*;
import java.text.*;

class Win7 extends Thread {
	private String[] namee;
	private String[] info;

	public void function(String funcName) {
		String[] name = gettName();
		String[] info = getInfo();
		HashMap map = new HashMap();
		for (int i = 0; i < name.length; i++) {
			map.put(name[i], info[i]);
		}
		if (map.containsKey(funcName)) {
			System.out.println(map.get(funcName) + "��� �մϴ�");
		} else {
			System.out.println("���� ��� �Դϴ�");
		}
	}

	public void funcPrint() {
		System.out.print("[��밡��] : ");
		String[] namee = gettName();
		for (int i = 0; i < namee.length; i++) {
			System.out.print(namee[i] + "  ");
		}
		System.out.println();
	}

	public String[] gettName() {
		return namee;
	}

	public void setName() {
		namee = new String[2];
		namee[0] = "����";
		namee[1] = "�޸���";
	}

	public String[] getInfo() {
		return info;
	}

	public void setInfo() {
		info = new String[2];
		info[0] = "calc.exe";
		info[1] = "notepad.exe";
	}

	public void display() {
		setName();
		setInfo();
		Scanner input = new Scanner(System.in);
		System.out.println("===== ȯ �� �� �� �� =====");
		int sel = 0;
		String funcName = null;
		while (true) {
			System.out.println("1.�� ��");
			System.out.println("2.off");
			System.out.print("�Է� >>>> ");
			sel = input.nextInt();
			switch (sel) {
			case 1:
				funcPrint();
				System.out.print("����� ��� �Է� : ");
				funcName = input.next();
				function(funcName);
				break;
			case 2:
				return;
			}
		}
	}
}
