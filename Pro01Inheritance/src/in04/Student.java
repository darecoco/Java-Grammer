package in04;

public class Student extends Person{
	String grade;
	String department;
	
	public Student(String name) { //1. name = "이재문"
		super(name); //2. 상위클래스(Person)의 매개변수 1개를 갖는 생성자 호출
	}
}
