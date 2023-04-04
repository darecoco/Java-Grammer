package pack02;

public class EqualsEx {

	public static void main(String[] args) {
		Point a = new Point(2, 3); //a객체 생성
		Point b = new Point(2, 3); //b객체 생성
		Point c = new Point(3, 4); //c객체 생성
		
		if(a == b) //a객체, b객체, c객체는 각각의 다른 객체의 주소값을 가짐
			System.out.println("a == b"); //고로 false
		if(a.equals(b)) //a클래스의 내용과 b클래서의 내용을 비교함
			System.out.println("a is equal to b"); //고로 true
		if(a.equals(c))
			System.out.println("a is equal to c");
		//위 equals메소드는 Object에 있는 것이 아니고, Point클래스에 있는 equals메소드를 호출
	}

}
