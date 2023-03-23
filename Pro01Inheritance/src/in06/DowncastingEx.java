package in06;

public class DowncastingEx {

	public static void main(String[] args) {
		Person p = new Student("이재문"); //업캐스팅
		//p는 Person클래스를 가리키는 객체변수이지만, Student객체를 할당받아 Upcasting이 발생함.
		
		Student s; 
		//s는 Student클래스를 가리키는 객체 변수로 선언(메모리(기억공간)할당은 받지 못함)
		
		s = (Student)p; //다운캐스팅
		//s는 Upcasting된 p객체 변수를 가지고 Student클래스로 Downcasting하면 Student클래스의 객체를 할당 받는것과 같다.
		//따라서 Student s = new Student() 이 문장과 같은 효과를 가진다.
		//Downcasting은 반드시 Upcasting된 객체 변수를 가지고 해야한다.
		
		System.out.println(s.name);
		s.grade = "A";
		s.name = "B";
		
	}

}
