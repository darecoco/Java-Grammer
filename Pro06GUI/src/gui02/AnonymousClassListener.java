package gui02;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class AnonymousClassListener extends JFrame{
	public AnonymousClassListener() {
		setTitle("Action 이벤트, 리스너 예제3");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JButton btn = new JButton("Action");
		
		//익명의 액션리스너 작성
		btn.addActionListener(new MyActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton b = (JButton)e.getSource();
				if("Action".equals(b.getText()))
					b.setText("액선");
				else
					b.setText("Action");
				setTitle(b.getText());
			}
		});
		
		c.add(btn);
		
		setSize(350, 150);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new AnonymousClassListener();
	}
}