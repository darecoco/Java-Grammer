package coll02;
/*
 해시맵을 이용하여 학생의 이름과 자바 점수를 기록, 관리하는 프로그램을 작성하라 
 */
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class HashMapScoreEx {

	public static void main(String[] args) {
		//dic객체변수는 HashMap타입이고 key 값은 String, value값도 String
		HashMap<String, Integer> javaScore = new HashMap<String, Integer>();

		//5개의 점수를 저장
		javaScore.put("김성동", 97);
		javaScore.put("김인호", 88);
		javaScore.put("김소희", 98);
		javaScore.put("김예향", 100);
		javaScore.put("김지우", 99);
		
		System.out.println("HashMap의 요소의 갯수는 : " + javaScore.size());
		
		//모든 사람의 점수를 출력
		//javaScore에 저장되어 있는 (key, value)를 출력하는데
		//keySet()는 key의 집합이고 문자열을 가진 집합을 Set콜렉션 keys객체변수에 넘겨준다
		Set<String> keys = javaScore.keySet();
		
		//key값들을 순차적으로 접근할 수 있는 iterator객체변수를 생성
		Iterator<String> it = keys.iterator();
		//it은 "김성동", "김인호", "김소희", "김예향", "김지우"
		while(it.hasNext()) {
			String name = it.next();
			int score = javaScore.get(name); //"김성동"에 해당하는 점수값을 score에 넘겨준다.
			System.out.println(name + " : " + score);
		}//while
	}//main

}
