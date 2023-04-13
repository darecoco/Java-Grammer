package coll01;

import java.util.Vector;

public class VectorEx {
	public static void main(String args[]) {
		Vector<Integer> v = new Vector<Integer>();
		//기본 생성자에 의해서 10개의 객체를 저장할 공간 할당
		
		v.add(5);  //5삽입
		v.add(4);
		v.add(-1);
		
		v.add(2,100); //인덱스 2번째에 100 삽입하고 2번째 이후의 데이터는 뒤로 한 칸씩 이동된다. 
		
		System.out.println("백터내의 요소 객체 수 : " + v.size());
		System.out.println("백터내의 현재 용량 : " + v.capacity());
		
//		for(int i = 0; i < v.size(); i++) {
//			int n = v.get(i);
//			System.out.println(n);
//		}
		
		for(int i = 0; i < v.size(); i++) {
			int n = v.get(i);
			System.out.print(n + " ");
		}
		int sum = 0;
		for(int i = 0; i < v.size(); i++) {
			int n = v.elementAt(i);
			sum += n;
		}
		
		System.out.println("벡터의 있는 모든 정수의 합 : " + sum);
	}
}
