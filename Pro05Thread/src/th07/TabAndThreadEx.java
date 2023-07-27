package th07;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;

public class TabAndThreadEx  extends JFrame {
	MyLabel bar = new MyLabel(100); 	//bar의 길이
	TabAndThreadEx(String title) {
		super(title); //컨테이너(프레임)의 제목
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //창을 닫으면 프로그램 종료
		Container c = getContentPane();
		c.setLayout(null);
		bar.setBackground(Color.ORANGE);
		bar.setOpaque(true);
		bar.setLocation(20,  50);
		bar.setSize(300, 20); 
		c.add(bar);
		
		//키보드의 어떤 키를 누르면 keyPressed란 이벤트가 발생.
		//어떤 키를 누르고 있을 때 bar.fill() 메소드 호출
		c.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) 
			{
				bar.fill(); 
			}
		});
		setSize(350,200);
		setVisible(true);
		
		c.requestFocus(); 
		ConsumerThread th = new 
			//실해하자마자 포커스를 컨테이너가 동작할 수 있도록 한다.
			ConsumerThread(bar); 
		th.start(); // 스레드 시작
	}

	public static void main(String[] args) {
		new TabAndThreadEx(
			"아무키나 빨리 눌러 바 채우기");
	}
}
