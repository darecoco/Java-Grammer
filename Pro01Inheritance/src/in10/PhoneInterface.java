package in10;

interface PhoneInterface {
	int TIMEOUT = 10000; //상수(public static final이 생략)
	void sendCall();  //추상 메서드로 인식(abstract키워드 생략)
	void receiveCall();  //추상 메서드로 인식(abstract키워드 생략)
	default void printLogo() {  //개발자들의 요청에 의해 오라클에서 기능추가
		System.out.println("** phone **");
	}
}
