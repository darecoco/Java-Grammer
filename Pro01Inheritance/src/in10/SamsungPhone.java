package in10;

public class SamsungPhone implements PhoneInterface{
	@Override
	public void sendCall() {
		System.out.println("뚜루르로롱");
	}
	@Override
	public void receiveCall() {
		System.out.println("전화가 왔습니다.");
	}
	
	//추가 메서드 작성(일반 메서드)
	public void flash() {
		System.out.println("불이 켜졌습니다.");
	}
}
