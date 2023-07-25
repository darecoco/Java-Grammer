package th05;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JLabel;

public class RandomThread extends Thread{
	private Container contentPane;
	private boolean flag = false;
	
	public RandomThread(Container contentPane) {
		this.contentPane = contentPane;
	}
	
	void finish() {
		flag = true;
	}
	
	@Override
	public void run() {
		while(true) {
			int x = ((int)(Math.random()*contentPane.getWidth())); //컨테이너 너비보다 작은 어떤 값
			int y = ((int)(Math.random()*contentPane.getHeight())); //컨테이너 높이보다 작은 어떤 값
			JLabel label = new JLabel("Java");
			label.setSize(80,30);
			label.setLocation(x, y);
			contentPane.add(label);
			contentPane.repaint(); //강제로 컴포넌트를 다시 그리도록 하는 메소드
			try {
				Thread.sleep(300);
				if(flag==true) {
					contentPane.removeAll();
					label = new JLabel("finish");
					label.setSize(80, 30);
					label.setLocation(100, 100);
					label.setForeground(Color.RED);
					contentPane.add(label);
					contentPane.repaint(); // 실제적으로 화면에 출력
					return;
				}
			}catch(InterruptedException e){
				System.out.println("오류발생");
				return;
			}
		}
	}
}
