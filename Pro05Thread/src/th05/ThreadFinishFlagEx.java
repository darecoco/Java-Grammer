package th05;

import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;

public class ThreadFinishFlagEx  extends JFrame{
	private RandomThread th;
	
	public ThreadFinishFlagEx() {
		setTitle("ThreadFinishFlagEx 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null); //배치의 규정을 정하지 않음
		
		//마우스를 컨테이너에서 눌렀을 때 실행하는 코드
		c.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				//마우스를 눌렀을 때 발생하는 이벤트가 mousePressed
				th.finish();
			}
		});
		
		setSize(300,200);
		setVisible(true);
		
		th = new RandomThread(c);
		th.start();
	}
	public static void main(String[] args) {
		new ThreadFinishFlagEx();
	}

}
