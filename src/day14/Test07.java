package day14;

class 가족 extends Thread{
	private 화장실 wr;
	private String 누구;
	가족(String name, 화장실 wr){
		누구 = name;
		this.wr  = wr;
	}
	
	public void run() {
		wr.openDoor(누구);
	}
}
class 화장실{
	public synchronized void openDoor(String name) {
		System.out.println(name + "님이 사용합니다.");
		try {
			Thread.sleep(5000);
		}catch(Exception e) {}
		System.out.println(name + "님이 사용을 마치셨습니다.");
	}
}
public class Test07 {

	public static void main(String[] args) {
		
		화장실 wr = new 화장실();
		가족 아빠 = new 가족("아빠", wr);
		가족 엄마 = new 가족("엄마", wr);
		가족 누나 = new 가족("누나", wr);
		가족 동생 = new 가족("동생", wr);
		가족 나 = new 가족("나", wr);
		
		아빠.start();
		엄마.start();
		누나.start();
		동생.start();
		나.start();
	

	}

}
