package day14;

class Ferrari{
	private int ye;
	public Ferrari(int ye) {
		this.ye = ye;
	}
	public int getYe() {
		return ye;
	}
	public void speed() {
		System.out.println(getYe() + "��� ��� �ӵ� : 300km");
	}
}

class NewFerrari extends Ferrari{

	public NewFerrari(int ye) {
		super(ye);
	}
	public void autosystem() {
		System.out.println("�ڵ� ���� ��带 �����մϴ�.");
	}
	public void	speed() {
		System.out.println(getYe() + "��� ��� �ӵ� : 400km");
	}
}
public class Test16 {

	public static void main(String[] args) {
		
		NewFerrari fe = new NewFerrari(2018);
		fe.speed();
		fe.autosystem();

	}

}