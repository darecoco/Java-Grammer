package file03;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BlockBinaryCopy {

	public static void main(String[] args) {
		File src = new File("./src/file03/forest.jpg");
		File dest = new File("./src/file03/copy3_forest.jpg");
		try {
			FileInputStream fi = new FileInputStream(src);
			FileOutputStream fo = new FileOutputStream(dest);
			byte[] buf = new byte[1024 * 10]; // 1024가 1KB, ---> 10KB 버퍼(임시기억공간)
			while(true) {
					int n = fi.read(buf); // fi가 가리키는 파일(forest.jpg)에서 데이터를 읽어서
					// 데이터를 배열 buf에 저장하고, 그 길이의 값을 n에 대입한다. 
					
					fo.write(buf, 0, n); // buf임시기억공간에 있는 데이터를 0번째 인덱스부터 
					// 시작하여 n길이 만큼을 fo가 가리키는 파일(copy3_forest.jpg)에 출력
					
					//System.out.println("n=" + n + ", buf.length=" + buf.length ); //아래 if문을 이해하기 위한 코드
					
					if(n < buf.length) //반복해서 10240byte를 읽어서 n에 저장되었기 때문에
						//false가 되었는데 마지막에 읽은 데이터는 9129를 n에 저장되었기 때문에 true발생.
						//따라서 while문은 종료된다.
						break;
					/*그러니깐, buf는 10240개의 방이있고 하나의 방마다 int c의 값 하나만큼을 넣어서 한번에 10240개가 출력되도록 했다.
					  그렇게 반복하다보면 마지막의 데이터의 수는 0~10239일 것이다. 즉, 끝난 것이니 이를 감지하여 while문을 끝낸것.*/
			}
			fo.close();
			fi.close();
			System.out.println("복사가 잘 됨(버퍼용)");
		}catch (IOException e) {
			System.out.println("파일 오류");
		}//catch
		
	}

}
