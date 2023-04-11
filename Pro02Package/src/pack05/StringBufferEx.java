package pack05;

public class StringBufferEx {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("This");
		
		sb.append(" is pencil");	//sb의 문자열 뒤에 붙이기
		System.out.println(sb);		//sb = "This is pencil"
		
		sb.insert(7, " my");		//sb의 문자열에 인덱스 7번째(0부터 출발) 위치에 " my"삽입
		System.out.println(sb);		//sb = "This is my pencil"
		
		sb.replace(8, 10, "your");	//sb의 문자열의 인덱스 8번째 부터 10번째 전까지의 문자열을 "your"로 교체
		System.out.println(sb);		//sb = "This is your pencil"
		
		sb.delete(8, 13);			//sb가 가리키는 8번째 문자열에서 13-1의 문자열을 삭제
		System.out.println(sb);		//sb = "This is pencil"
		
		sb.setLength(4);			//현sb의 길이는 14 인데, 4로 설정하면 앞 4글자만 남겨두고 뒤의 문자열이 삭제됨
		System.out.println(sb);		//sb = "This"
	}

}
