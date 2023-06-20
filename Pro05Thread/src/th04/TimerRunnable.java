package th04;

import javax.swing.JLabel;

class TimerRunnable implements Runnable{
	private JLabel timerLabel;
	public TimerRunnable(JLabel timerLabel) {
		this.timerLabel = timerLabel;
	}
	
	@Override
	public void run() {
		int n = 0;
		while(true) {//무한반복
			timerLabel.setText(Integer.toString(n)); // 레이블에 정수 숫자 출력
			n++;
			try {
				Thread.sleep(1000);//1초지연
			}catch (InterruptedException e) {
				return;// 예외가 발생하면 해당 스레드 종료.
			}
		}
	}
}
