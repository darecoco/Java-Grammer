package gui02;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class InnerClassListenerEx extends JFrame{
	public InnerClassListenerEx() {
		setTitle("Action 이벤트, 리스너 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JButton btn = new JButton("Action");
		btn.addActionListener(new MyActionListener());
		c.add(btn);
		
		setSize(350, 150);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new InnerClassListenerEx();
	}
	
	private class MyActionListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			JButton b = (JButton)e.getSource();
			if("Action".equals(b.getText()))
				b.setText("액선");
			else
				b.setText("Action");
			
			InnerClassListenerEx.this.setTitle(b.getText()); //현재 클래스 내 setTitle객체를 바꿈
		}
	}
}

