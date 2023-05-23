package file04;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class sungDatasExam {
	public void readingData(String fname) throws IOException { //fname = "c:\\Temp\\writed.txt"
		try {
			FileReader fr = new FileReader(new File(fname));
			//fr은 writed.txt를 가리키고
			BufferedReader br = new BufferedReader(fr);
			//버퍼 클래스를 이용해서 데이터를 읽는다. br은 wrted.txt를 가리킴
			String csvStr = "";
			String tmpStr = "";
			do {
				tmpStr = br.readLine(); // writed.txt파일에서 한 줄씩 읽어서 tmpStr에 대입.
				if (tmpStr != null) {
					csvStr += (tmpStr + "\t");
					// 사이에 "\t"를 넣으머 한 줄씩 점점 추가된다.
					// 최종적으로 파일의 모든 데이터가 문자열로 csvStr에 저장되어 있다.
				}
			} while (tmpStr != null);
			StringTokenizer parse = new StringTokenizer(csvStr, "\t"); // 토큰의 구분자가 "\t" ("\t"를 기준으로 나눈다)
			//parse는 csStr의 문자열을 탭을 구분자로 하여 새로운 문자열 객체 생성 ("Kim", "관악구", "100".....)
			int length = parse.countTokens() / 4;
			//parse.countTokens()는 parse가 가리키는 토큰의 갯수(16). 따라서 lenfth는 4이다.
			
			//각각의 기억공간 4개 생성
			String[] name = new String[length];		// 이름
			String[] address = new String[length];	// 주소
			double[] math = new double[length];		// 수학점수
			double[] english = new double[length];	// 영어점수
			double[] total = new double[length];	// 총점
			double[] avg = new double[length];		// 점수평균
			
			//한줄의 데이터를 각 배열에 넣음
			for (int i = 0; i < length; i++) {
				name[i] = parse.nextToken(); // 첫 번째 실행할 때, "Kim"을 name[0]에 저장 후 parse는 다음 토큰을 가리킨다.
				address[i] = parse.nextToken();
				math[i] = Double.valueOf(parse.nextToken()).doubleValue(); 
				// parse.nextToken()은 "100"데이터를 실수형 객체타입의 데이터로 변환하고 .doubleValue()에 의해서 기본형 실수형식으로 변환하여 
				// math[0]에 넘겨주고 parse는 그 다음 토큰을 가리킨다.
				english[i] = Double.valueOf(parse.nextToken()).doubleValue(); // 윗문장과 같음
				total[i] = math[i] + english[i]; // 배열의 0번째 방의 데이터를 가지고 총점 구함
				avg[i] = total[i] / 2.0; // 배열의 0번째 방의 데이터를 가지고 평균 구함
			}
			for (int j = 0; j < length; j++) { // 콘솔(화면) 출력
				System.out.println(name[j] + "\t" + address[j] + "\t" + math[j] + "\t" + english[j] 
						+ "\t" + total[j] + "\t" + avg[j]);
			}
		} catch (FileNotFoundException e) {
			System.out.println("잘못된 파일 이름을 입력했습니다");
		}
	}
}