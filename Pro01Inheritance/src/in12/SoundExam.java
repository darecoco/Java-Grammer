package in12;

public class SoundExam {

	public static void main(String[] args) {
		//Sound tv = new Sound();  인터페이스는 객체 생성 불가
		Sound tv = new TV(); //업캐스팅
		//tv는 Sound인터페이스를 가리키는 객체변수이지만 TV클래스를 할당
		Sound radio = new Radio();
		//radio는 Sound인터페이스를 가리키는 객체변수이지만 TV클래스를 할당
		
		tv.SoundUP(5);
		tv.SoundDown(10);
		//tv객체변수는 TV클래스에 있는 재정의된 SoundUp()메소드를 호출
		
		radio.SoundUP(5);
		radio.SoundDown(10);
		//radio객체변수는 TV클래스에 있는 재정의된 SoundUp()메소드를 호출
	}

}
