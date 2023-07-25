package th06;

public class ShareBoard {
	private int sum = 0;
	
	synchronized public void add() {
		//특정 스레드가 점유중일 경우 다른 스레드는 접근 불가
		//data를 여러 스레드가 공유할 경우 반드시 동기화(synchronized)를 해야한다.
		int n = sum;
		Thread.yield(); // 현재 실행중인 스레드 양보
		n += 10;
		sum = n;
		System.out.println(Thread.currentThread().getName() + ":" + sum);
		//Thread.currentThread().getName()는 현재 실행중인 스레드 이름
	}
	public int getSum() {
		return sum;
	}
}
