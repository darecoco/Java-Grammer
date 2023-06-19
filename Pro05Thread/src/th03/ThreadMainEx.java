package th03;

public class ThreadMainEx {

	public static void main(String[] args) {
		long id = Thread.currentThread().getId(); // 현재 스레드 id값
		String name = Thread.currentThread().getName(); // 현재 스레드는 main메소드만 존재, main메소드도 스레드임.
		int priority = Thread.currentThread().getPriority(); // 스레드 우선순위의 default값은 5로 설정된다.
		Thread.State s = Thread.currentThread().getState(); // 스레드 상태 값
		System.out.println("현재 스레드 ID : " + id);
		System.out.println("현재 스레드 이름 : " + name);
		System.out.println("현재 스레드 우선순위 : " + priority);
		System.out.println("현재 스레드 상태 : " + s);
	}

}
