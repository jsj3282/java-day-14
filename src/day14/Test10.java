package day14;

import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Test10 {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Label Example");
		Container c = frame.getContentPane();
		JLabel label = new JLabel("Hello JUI");
		c.add(label);
		frame.setLocation(1000, 200);  		//ȭ�� ��ġ
		frame.setPreferredSize(new Dimension(500, 200));    //������ ũ��
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
