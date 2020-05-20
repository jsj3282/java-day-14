package day14;

class A03 extends Thread{
	public void run() {
		for(int i = 0; i < 100; i++) {
			System.out.println("A01 : " + i);
		}
	}
}
public class Test04 {

	public static void main(String[] args) {
		
		A03 a = new A03();
		a.setDaemon(true);
		a.start();
		
		System.out.println("프로그램 종료");
		System.out.println("프로그램 종료");
		System.out.println("프로그램 종료");
	}

}
