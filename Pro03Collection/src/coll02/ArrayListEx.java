package coll02;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx {

	public static void main(String[] args) {
		//문자열 데이터를 담는 ArrayList객체변수 a를 만들고, 생성자도 호출하는데
		//기억공간이 10개 만들어진다.
		ArrayList<String> a = new ArrayList<String>();
		
		//키보드로부터 4개의 이름을 입력받아서 ArrayList객체에 저장
		Scanner scanner = new Scanner(System.in);
		for(int i = 0; i < 4; i++) {
			System.out.print("이름을 입력하세요 >> ");
			String s = scanner.next();
			a.add(s);
		}
		
		//ArrayList에 있는 데이터를 모두 출력
		for(int i = 0; i < a.size(); i++) {
			String name = a.get(i);
			System.out.print(name + " ");
		}
		
		//가장 긴 이름을 출력
		//입력예제 : Mike Jane Ashely Helen
		//문자열의 길이를 구한 후, 그 길이의 최대값을 구하는 알고리즘
		int longestIndex = 0;
		for(int i = 1; i < a.size(); i++) {
			if(a.get(longestIndex).length() < a.get(i).length())
				longestIndex = i; //2로 변경
		}
		System.out.println("\n가장 긴 이름은 \'" + a.get(longestIndex) + "\' 입니다.");
	}

}
