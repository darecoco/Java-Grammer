package th03;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class FlickeringLabelEx extends JFrame{
	public FlickeringLabelEx() {
		setTitle("FlickeringLabelEx 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane(); //Container c = new Container(); ------------ 잘못된 예제
		c.setLayout(new FlowLayout());
		//컨테이너에 오브젝트를 어떻게 배치할 것인가.
		
		//깜빡이는 레이블 생성
		FlickeringLabel fLabel1 = new FlickeringLabel("깜빡", 500);
		//FlickringLabel클래스의 fLabel1 객체생성시 생성자 호출
		
		//깜빡이지 않는 레이블 생성
		JLabel label = new JLabel("안깜빡");
		
		//깜빡이는 레이블 생성2
		FlickeringLabel fLabel2 = new FlickeringLabel("여기도 깜빡", 300);
		
		c.add(fLabel1); //컨테이너에 fLabel1이라는 객체를 배치
		c.add(label); //컨테이너에 label이라는 객체를 배치
		c.add(fLabel2); //컨테이너에 fLabel2이라는 객체를 배치
		
		setSize(300,150); //컨테이너의 사이즈
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new FlickeringLabelEx(); //익명의 객체가 생성되고 생성자 호출
	}

}
