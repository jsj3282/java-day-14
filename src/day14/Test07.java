package day14;

class ���� extends Thread{
	private ȭ��� wr;
	private String ����;
	����(String name, ȭ��� wr){
		���� = name;
		this.wr  = wr;
	}
	
	public void run() {
		wr.openDoor(����);
	}
}
class ȭ���{
	public synchronized void openDoor(String name) {
		System.out.println(name + "���� ����մϴ�.");
		try {
			Thread.sleep(5000);
		}catch(Exception e) {}
		System.out.println(name + "���� ����� ��ġ�̽��ϴ�.");
	}
}
public class Test07 {

	public static void main(String[] args) {
		
		ȭ��� wr = new ȭ���();
		���� �ƺ� = new ����("�ƺ�", wr);
		���� ���� = new ����("����", wr);
		���� ���� = new ����("����", wr);
		���� ���� = new ����("����", wr);
		���� �� = new ����("��", wr);
		
		�ƺ�.start();
		����.start();
		����.start();
		����.start();
		��.start();
	

	}

}
