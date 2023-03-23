package in04;

public class UpcastingEx {

	public static void main(String[] args) {
		Person p;
		Student s = new Student("이재문");
		p = s; //업캐스팅이라 p가 전체 객체를 할당한 것 처럼 보이지만 아니다.
		//p = Person클래스를 가리키는 객체변수이고,
		//s는 하위클래스(Stduent)를 가리키는 객체로
		//p는 s객체를 할당 받음
		
		//Person p = new Student(); ----- Upcasting이 된다.
		System.out.println(p.name);
		
		//p.grade = "A";
		//p.department = "Com";
	}

}
