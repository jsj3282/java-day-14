package day14;

import java.util.Scanner;

class A04 extends Thread{
	public void run() {
		for(;;) {
			try {
				Thread.sleep(1000);
			}catch(Exception e) {}
			System.out.println("A01 : ");
		}
	}
}
public class Test05 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String str;
		A04 a = new A04();
		a.setDaemon(true);
		a.start();
		try {
			str = input.next();
			System.out.println("�Է� : " + str);
			throw new Exception("���� ����");
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("���α׷� �ڵ� ���� �Ϸ�");
		}

	}

}
