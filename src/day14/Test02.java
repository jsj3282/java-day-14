package day14;

class A01 extends Thread{
	public void run() {
		for(int i = 0; i < 100; i++) {
			System.out.println("A01 : " + i);
		}
	}
}
class B01 extends Thread{
	public void run() {
		for(int i = 0; i < 100; i++) {
			System.out.println("B01 : " + i);
		}
	}
}
public class Test02 {

	public static void main(String[] args) {
		
		A01 a = new A01();
		B01 b = new B01();
		a.run();
		b.run();
		//a.start();
		//b.start();
		
		System.out.println("프로그램 종료");
		System.out.println("프로그램 종료");
		System.out.println("프로그램 종료");

	}

}
