package th04;

import java.awt.Container;
import java.awt.Desktop.Action;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ThreadInterruptEx extends JFrame{
	private Thread th; // th 스레드 객체 생성
	public ThreadInterruptEx() {
		setTitle("Thread를 상속 받은 타이머 스레드 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//창을 닫을 때 프로그램 종료
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel timerLabel = new JLabel(); //레이블 객체 생성
		timerLabel.setFont(new Font("Gothic", Font.ITALIC, 80));
		
		TimerRunnable runnable = new TimerRunnable(timerLabel);
		th = new Thread(runnable); // runnable객체를 가지고 th 스레드 객체 생성, 생성자 호출
		c.add(timerLabel); //컨테이너 레이블 추가
		
		// 버튼을 생성하고 ACtionListener 등록
		JButton btn = new JButton("TimeKiller");
		// "TimeKiller"이름을 가진 btn 버튼 생성
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				th.interrupt(); //타이머 스레드를 강제종료
				//interrupt()메소드가 동작하면 강제적으로 InterruptedExceptiond예외를 방생시켜 catch문장을 실행한다.
				//따라서 스레드 종료(return)
				JButton btn = (JButton)e.getSource();
				btn.setEnabled(false); //버튼 비활성화
			}
		});
		c.add(btn);
		setSize(300, 400);
		setVisible(true);
		
		th.start();
	}
	public static void main(String[] args) {
		new ThreadInterruptEx();
	}

}
