package coll02;

public class MyStack {
	public static void main(String[] args) {
		GStack<String> stringStack = new GStack<String>();
		stringStack.push("seoul");
		stringStack.push("busan");
		stringStack.push("LA");
		
		for(int n = 0; n < 3; n++)
			System.out.println(stringStack.pop());
		// LA -> busan -> seoul : LIFO형 구조. 즉, 스택알고리즘
		
		GStack<Integer> intStack = new GStack<Integer>();
		intStack.push(1);
		intStack.push(2);
		intStack.push(3);
		
		for(int n = 0; n <3 ; n++)
			System.out.println(intStack.pop());
	}
}
