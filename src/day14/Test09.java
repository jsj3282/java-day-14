package day14;

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Test09 {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Label Example");
		Container c = frame.getContentPane();
		JLabel label = new JLabel("Hello GUI");
		c.add(label);
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
