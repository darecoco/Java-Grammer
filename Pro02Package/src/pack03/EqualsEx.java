package pack03;

public class EqualsEx {

	public static void main(String[] args) {
		Rect a = new Rect(2, 3);
		Rect b = new Rect(3, 2);
		Rect c = new Rect(3, 4);
		
		if(a.equals(b)) //1
			System.out.println("a is equal to b");
		if(a.equals(c))//2
			System.out.println("a is equal to c");
		if(b.equals(c))//3
			System.out.println("b is equal to c");
	}

}
