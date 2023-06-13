package th02;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class RunnableTimerEx extends JFrame{
	public RunnableTimerEx() {
		setTitle("Thread를 상속 받은 타이머 스레드 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 안쓰면 창 닫아도 main이 실행되고있음 (창 닫으면 스레드 종료)
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel timerLabel = new JLabel();
		timerLabel.setFont(new Font("Gothic", Font.ITALIC, 80));
		c.add(timerLabel); //컨테이너에 timerLabel을 더해줌. (이래야 Label이 보임)
		
		TimerRunnable runnable = new TimerRunnable(timerLabel);
//		Thread th = new Thread(runnable);
		Thread th = new Thread(new TimerRunnable(timerLabel));
		
		setSize(250, 150);//컨테이너 크기(화면 크기)
		setVisible(true); //컨테이너를 화면에 보이게 함(true / false)
		
		th.start(); //TimerThread클래스에 있는 run()메소드가 동작
	}
	public static void main(String[] agrs) {
		/* main() 메소드도 하나의 스레드다.
		 * main() 메소드가 종료되어도 다른 스레드는 종료되지 않을 수 있다.*/
		new RunnableTimerEx();
		for(int i = 0; i < 100; i++)
			System.out.println("main thread");
	}
}
