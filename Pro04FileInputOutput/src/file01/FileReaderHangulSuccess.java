package file01;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileReaderHangulSuccess {
	public static void main(String[] args) {
		InputStreamReader in = null;
		FileInputStream fin = null;
		
		try {
			fin = new FileInputStream("C:\\Windows\\system.ini");
			// fin객체변수는 "system.ini"파일을 카리키는데 그 데이터 charset은 UTF-8로 설정되어있다.
			in = new InputStreamReader(fin, "MS949");
			// fin가리키는 파일의 charset을 "MS949"형식으로 변환시킨 파일을 가리키는 in객체변수 생성
			int c;
			
			System.out.println("인코딩 문자 집합은 " + in.getEncoding());
			while((c=in.read()) != -1) {
				System.out.print((char)c);
			}
			in.close();// 객체생성이 역순으로 파일을 가리키는 객체변수를 파일(을 닫는다)과 연결을 차단
			fin.close();
		}catch (IOException e){
			System.out.println("입출력 오류");
		}
	}
}
