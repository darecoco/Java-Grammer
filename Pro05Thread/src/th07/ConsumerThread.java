package th07;

class ConsumerThread extends Thread {
	MyLabel bar;
	
	ConsumerThread(MyLabel bar) {
		this.bar = bar;
	}
	
	//스레드가 동작하는 메소드
	public void run() {
		while(true) {
			try {
				sleep(200); //0.2초만큼 딜레이
				bar.consume(); 
			} catch (InterruptedException e)
			 { return; }
		}
	}
}
