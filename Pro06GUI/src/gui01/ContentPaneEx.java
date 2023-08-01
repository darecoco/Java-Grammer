package gui01;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ContentPaneEx extends JFrame{
	public ContentPaneEx() {
//		setTitle("ContentPane과 JFrame");
		super("ContentPane과 JFrame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//윈도우 창을 닫으 때 응용프로그램(모든 스레드)가 종료 된다.
		Container contentPane = getContentPane();
		contentPane.setBackground(Color.orange);
		contentPane.setLayout(new FlowLayout()); // 컨테이너 위에 오브젝트를 배치하는 방법
		
//		JButton ok = new JButton("OK");
		contentPane.add(new JButton("OK")); //익명의 JButton
		//'ok'버튼을 만들어서 컨테이너 위에 더해준다.
		contentPane.add(new JButton("Cancle")); 
		contentPane.add(new JButton("Ignore"));
		
		setSize(300, 300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new ContentPaneEx();
	}

}
