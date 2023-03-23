package in03;

public class ColorPoint extends Point{
	private String color; //점의 색
	
	public ColorPoint(int x, int y, String color) { //x = 5, y = 6, color = "blue"
		super(x, y); //x = 5, y = 6
		//super()메소드는 한 개만 존재
		this.color = color; //멤버변수에 color="blue"값을 저장
		//super(x, y); ----이 메소드는 반드시 첫 번째 라인에 위치
	}
	
	public void showColorPoint() {
		System.out.print(color);
		showPoint();
	}
	
}
