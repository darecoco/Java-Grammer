package coll02;

import java.util.LinkedList;
import java.util.Collections;
import java.util.Iterator;

public class CollectionsEx {
	static void printList(LinkedList<String> l) {
		Iterator<String> iterator = l.iterator();
		while(iterator.hasNext()) {
			String e = iterator.next();
			String separator;
			if(iterator.hasNext())
				separator = "->";
			else
				separator = "\n";
			System.out.print(e+separator);
		}
	}
	public static void main(String[] args) {
		LinkedList<String> myList = new LinkedList<String>();
		myList.add("트랜스포머");
		myList.add("스타워즈");
		myList.add("매트릭스");
		printList(myList);
//		myList.add(0, "터미네이터"); //0번째 데이터 삽입
//		myList.add(2, "아바타"); //2번째 데이터 삽입
	
		printList(myList);
		Collections.sort(myList); // 오름차순 정렬(ascending sort)
		printList(myList);
		
		Collections.reverse(myList); // 요소의 데이터를 역순으로 정렬
		printList(myList);
		
		int index = Collections.binarySearch(myList, "터미네이터") + 1;
		System.out.println("스타워즈 " + index + "번 째 요소입니다.");
	}

}
