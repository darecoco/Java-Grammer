package file01;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriterEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// sc객체 생성---키보드로부터 입력하기 위함
		FileWriter fout = null;
		// fout출력파일 객체변수 선언
		int c;
		try {
			fout = new FileWriter("C:\\Temp\\test.txt");
			// fout은 "test.txt"파일을 가리키는 파일 객체변수
			while(true) {// 무한반복
				String line = sc.nextLine(); // 줄 단위로 데이터 입력
				if(line.length() == 0)
					break; // 입력하지 않고 Enter키를 누르면 while문을 빠져나온다
				fout.write(line, 0, line.length());
				// line의 0번째 데이터 부터 입력된 데이터의 길이 만큼
				// fout이 가리키는 "test.txt"파일에 출력한다.
				fout.write("\r\n", 0, 2);// test.txt파일에 한 줄 띄기 위해 "\r\n"를 저장 (write()는 줄바꿈까지 포함시키지 않는다.)
				// "\r" : 커서 맨 앞, "\n" : 줄바꿈
			}
			fout.close();
		}catch (IOException e) {
			System.out.println("입출력 오류");
		}
	}
}
