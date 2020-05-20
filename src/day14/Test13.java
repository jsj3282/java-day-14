package day14;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Test13 {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Label Example");
		Container c = frame.getContentPane();
		JLabel label = new JLabel("Hello GUI");
		Font dukeFont = new Font("고딕", Font.ITALIC, 32);
		label.setFont(dukeFont);
		label.setHorizontalAlignment(JLabel.CENTER);
		c.add(label);
		frame.setLocation(1000, 200);	//화면 위치
		frame.setPreferredSize(new Dimension(500, 200));	//프레임 크기
		frame.pack(); 		//프레임 변경 적용하기
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		for(int i = 0; ; i++) {
			label.setText(i + " : 안녕하세요");
		}
	}

}
