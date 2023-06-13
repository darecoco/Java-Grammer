package th01;

import javax.swing.JLabel;

public class TimerThread extends Thread{
	private JLabel timerLabel;

	public TimerThread (JLabel timerLabel) {
		this.timerLabel = timerLabel;
	}

	@Override
	public void run() {
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
