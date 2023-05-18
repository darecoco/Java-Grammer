package file02;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

// C:\Temp\test.txt 파일을 이용해서 testout.txt로 복사하는 프로그램을 작성하시오
// FileReader클래스와 FileWrit클래스를 이용해서 작성하시오

public class FileCopyEx {

	public static void main(String[] args) {
//		File src = new File("C:\\Temp\\test.txt");
//		File dest = new File("C:\\Temp\\testout.txt");
		String src = "C:\\Temp\\test.txt";
		String dest = "C:\\Temp\\testout.txt";
		int c;
		try {
			FileReader fr = new FileReader(src);
			FileWriter fw = new FileWriter(dest);
			
			while((c=fr.read()) != -1) { //fr은 "test.txt"에 있는 데이터를 한 문자씩읽음
				fw.write((char)c); //fw가 가리키는 "testout.txt"파일에 출력한다.
			}
			fr.close();
			fw.close();
			System.out.println("잘 되었음!");
		}catch (IOException e) {
			System.out.println("파일 복사 오류");
		}
	}

}
