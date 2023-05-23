package file04;

import java.io.IOException;

public class sungDatasMain {
	public static void main(String[] args) {
		sungDatasExam wd = new sungDatasExam();
		try {
			wd.readingData("c:\\Temp\\writed.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}