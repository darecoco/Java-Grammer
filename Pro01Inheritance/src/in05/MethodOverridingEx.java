package in05;

public class MethodOverridingEx {
	
	static void paint(Shape p) {
		p.draw(); //paint(Line);에서 호출 되었을 때 draw()메소드는 Line클래스에 있는 메소드
	}

	public static void main(String[] args) {
		Line line = new Line();
		Shape p = line;  //p는 Shape클래스를 가리키는 객체변수인데 line객체를 할당받아서 업캐스팅
		p.a = 234;
		p.b = 345.22;
		p.shpedraw();
		p.draw();
		//p는 shape클래스의 모든 멤버에 접근할 수 있는데, 오버라이딩(재정의)된 메소드는 하위클래스의 메소드를 호출한다.
		
		
		
		//paint(line);  // paint(Shape p)메소드를 호출하는데 Shape = line문장과 같다.
//		paint(new Shape());
//		paint(new Line());
//		paint(new Rect());
//		paint(new Circle());
	}

}
