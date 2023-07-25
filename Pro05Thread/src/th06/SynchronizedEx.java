package th06;

public class SynchronizedEx {

	public static void main(String [] args) {
		ShareBoard board = new ShareBoard();
		//board는 ShareBoard클래스의 객체(데이터)
		Thread th1 = new StudentThread("kitae", board);
		Thread th2 = new StudentThread("hyosoo", board);
		th1.start(); //th1 스레드의 이름은 "kitae"
		th2.start(); //th2 스레드의 이름은 "hyosoo"
		//2개의 스레드가 동작(실행)
	}
}
