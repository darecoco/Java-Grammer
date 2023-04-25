package coll02;

//(영어, 한글) 단어를 쌍으로 헤시맵에 저장하고 영어로 한글을 검색하는 프로그램을 작성하여라.
//"exit"이 입력되면 프로그램을 종료하는 프로그램 작성

import java.util.HashMap;
import java.util.Scanner;
public class HashMapEx {

	public static void main(String[] args) {
		//dic객체변수는 HashMap타입이고 key 값은 String, value값도 String
		HashMap<String, String> dic = new HashMap<String, String>();
		
		//HashMap 객체인 dic에 3개의 (key, vlaue)데이터를 저장
		dic.put("baby", "아기"); //key : "baby" , value : "아기"
		dic.put("love", "사랑");
		dic.put("apple", "사과");
		
		Scanner sc = new Scanner(System.in); //키보드로부터 입력받기 위한 객체 생성
		while(true) {//무한반복
			System.out.print("찾고 싶은 단어 입력 : ");
			String eng = sc.next(); //키보드로부터 키값 문자열 입력 받음
			if(eng.equals("exit")) {//입력받은 문자열이 "exit"이면 true반환
				System.out.println("종료됩니다.");
				break;//while반복문을 빠져나간다.
			}
			String kor = dic.get(eng); //eng는 키값에 해당하는 value를 kor에 저장
			//만약에 입력된 키 값이 dic객체에 없는 키 값이면 null을 반환
			if(kor == null)
				System.out.println(eng + "는 없는 단어입니다.");
			else
				System.out.println(kor);
		}//while
	}

}
