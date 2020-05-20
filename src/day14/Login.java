package day14;

import java.awt.Container;
import java.awt.Dimension;
import java.util.*;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.util.*;

class Login extends Win7 {
	private String userId = null, userPw = null;

	public int compare(String userId, String userPw) {
		if (getUserId() != null && getUserPw() != null)
			if (getUserId().equals(userId) && getUserPw().equals(userPw))
				return 0;
			else
				return 1;
		return 1;
	}

	public boolean out() {
		return false;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPw() {
		return userPw;
	}

	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}

	public void func() {
		Scanner input = new Scanner(System.in);
		int num = 0, result = 0;
		String inputId = null, inputPw = null;
		boolean flag = true;
		while (flag) {
			System.out.print("1.로그인  2.가 입  3.로그아웃 \n>>>");
			num = input.nextInt();
			switch (num) {
			case 1:
				System.out.print("아이디 입력 : ");
				inputId = input.next();
				System.out.print("비밀번호 입력 : ");
				inputPw = input.next();
				result = compare(inputId, inputPw);
				if (result == 0) {
					System.out.println("인증 통과");
					super.display();
					JFrame frame = new JFrame("Label Example");
					Container c = frame.getContentPane();
					JLabel label = new JLabel("Hello GUI");
					c.add(label);
					frame.setLocation(1000, 200);
					frame.setPreferredSize(new Dimension(500, 200));
					frame.pack();
					frame.setVisible(true);
					frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				} else
					System.out.println("인증 실패");
				break;
			case 2:
				System.out.print("가입 id : ");
				inputId = input.next();
				System.out.print("가입 pw : ");
				inputPw = input.next();
				setUserId(inputId);
				setUserPw(inputPw);
				System.out.println("저장 완료");
				break;
			case 3:
				flag = out();
				System.out.println("종료 합니다");
			}
		}
	}

}
