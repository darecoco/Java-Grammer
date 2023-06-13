package th02;

import javax.swing.JLabel;

public class TimerRunnable implements Runnable{
	//Runnable인터페이스를 가지고 클래스 구현하는데 run()메소드는 반드시 재정의 해야한다.
	private JLabel timerLabel;

	public TimerRunnable (JLabel timerLabel) {
		this.timerLabel = timerLabel;
	}

	@Override
	public void run() {// 동작하는 스레드 메소드
		int n = 0;
		while(true) {
			timerLabel.setText(Integer.toString(n)); //Label에 숫자 출력
			n++;
			try {
				Thread.sleep(1000); // 1000 = 1sec. 즉, 1초씩 지연.
			}catch (InterruptedException e) {
				return;
			}
		}
	}
	
	
}
