package coll02;

import java.util.*;

public class IteratorEx {

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		v.add(5);
		v.add(4);
		v.add(-1);
		v.add(2, 100);
		
		int sum = 0;
		Iterator<Integer> it = v.iterator(); //v벡터에 5, 4, 100, -1가 저장
		//it 객체변수는 v객체의 데이터를 순차적으로 접근할 수 있다.
		while(it.hasNext()) { //첫 번째 실행 it.hasNext()는 5를 가리키기 때문에 true값을 리턴
			int n = it.next(); //5를 n에게 점겨주고 난 후에 it은 그 다음 데이터를 가리키게 된다.
			sum += n;
			System.out.print(n + " ");
		}//while
		System.out.println("\n백터 데이터 합 : " + sum);
	}

}