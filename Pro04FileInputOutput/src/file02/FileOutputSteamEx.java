package file02;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputSteamEx {

	public static void main(String[] args) {
		byte b[] = {7, 51, 3, 4, -1, 24};
		try {
			FileOutputStream fout = new FileOutputStream("C:\\Temp\\test.out");
			// fout 출력파일 객체변수는 "test.out"파일을 가리킨다.
			for(int i = 0; i < b.length; i++)
				fout.write(b[i]); // 파일(test.out)에 b[i]의 정수 값(2진수)을 그대로 기록한다.
			//텍스트 형식이 아님
			fout.close();
		}catch (IOException e) {
			System.out.println("C:\\Temp\\test.out에 저장할 수 없습니다. 경로명을 확인해주세요");
			return;
		}
		System.out.println("C:\\Temp\\test.out에 저장했습니다.");
		// test.out파일에 있느 내용을 메모장에 불러오게 되면 데이터가 깨어진 것 처럼 보인다.
		// 왜냐하면 텍스트 파일이 아니기 때문
	}

}
