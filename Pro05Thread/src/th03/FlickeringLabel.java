package th03;

import java.awt.Color;

import javax.swing.JLabel;

public class FlickeringLabel extends JLabel implements Runnable{
	private long delay;
	
	public FlickeringLabel(String text, long delay) {
		//1. flabel1 객체생성시 생성자 호출 할때 text="깜빡", delay=500
		//2. flabel1 객체생성시 생성자 호출 할때 text="여기도 깜빡", delay=300
		super(text);
		// 지정된 텍스트("깜빡")로 레이블 인스턴슬르 만든다. 레이블 생성
		this.delay = delay;
		setOpaque(true); //배경색을 설정(true)
		Thread th = new Thread(this); // 1. this는 fLabel1을 나타냄
										// 2. this는 fLabel2를 나타냄
		th.start();//4. 스레드 실행
	}
	
	@Override
	public void run() {
		int n = 0;
		while(true) {
			if(n==0)
				this.setBackground(Color.CYAN);
			else
				setBackground(Color.orange);
			if(n==0) n = 1;
			else n = 0;
			try {
				Thread.sleep(delay); // delay = 5000 -> 0.5초 지연
			}catch(InterruptedException e) {
				return;
			}
		}
	}
}
