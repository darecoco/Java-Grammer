package in07;

public class InstanceOfEx {
	static void print(Person p) { //Person p = new Student()와 같은 문장
		if(p instanceof Person)
			System.out.print("Person ");
		if(p instanceof Student)
			System.out.print("Student ");
		if(p instanceof Researcher)
			System.out.print("Resercher ");
		if(p instanceof Professor)
			System.out.print("Professor ");
		System.out.println();
	}

	public static void main(String[] args) {
		System.out.print("new Student() ->  "); print(new Student());
		//Person p = new Student()
		System.out.print("new Researcher() ->  "); print(new Researcher());
		//Person p = new Researcher()
		System.out.print("new Professor() ->  ");
		print(new Professor());
	}

}
