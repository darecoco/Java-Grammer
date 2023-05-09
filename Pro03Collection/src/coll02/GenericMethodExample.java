package coll02;

public class GenericMethodExample {
	public static <T> GStack<T> reverse(GStack<T> a) { // 4. a는 gs객체를 받음
		//<T>는 특정 메소드에 제네릭을 적용하겠다는 표시이다.
		//GStack<T>는 reverse메소드의 리턴(반환)타입
		//GStack<T> a에서 a는 GStack클래스의 매개변수
		GStack<T> s = new GStack<T>();
		// 1. s는 GStack클래스 객체변수 생성
		while (true) {
			T tmp;
			tmp = a.pop(); // 2. 객체변수 a에 있는 데이터를 읽어서 tmp에 저장
			if(tmp == null)
				break;
			else
				s.push(tmp); // 3. tmp에 저장되어 있는 데이터를 s객체에 데이터를 저장
		}//while
		return s;
	}

	public static void main(String[] args) {
		GStack<Double> gs = new GStack<Double>();
		for(int i = 0; i < 5; i++) {
			//참고 : new Double(i)도 되긴된다. (취소선이 생길 뿐)
			gs.push(Double.valueOf(i)); //0.0, 1.0, 2.0, 3.0, 4.0순으로 데이터 저장
			//Double.valueOf(i)는 정수 i 값을 실수형으로 변환
		}//for
		gs = reverse(gs);
		for(int i = 0; i < 5; i++) {
			System.out.println(gs.pop());
		}//for
	}

}
