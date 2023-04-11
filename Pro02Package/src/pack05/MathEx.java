package pack05;

public class MathEx {

	public static void main(String[] args) {
		double a = 312.14;
		System.out.println(Math.PI);
		System.out.println(Math.ceil(a)); //올림
		System.out.println(Math.floor(a)); //내림
		System.out.println(Math.sqrt(9)); //제곱근(root)
		System.out.println(Math.exp(2)); //e(자연대수라고 하는데 2.718282의 2제곱
		System.out.println(Math.round(3.14)); //반올림
		
		//[1~45]의 정수형 난수 발생
		System.out.print("금주의 행운의 번호는 ");
		for(int i = 0 ; i < 5; i++) {
			System.out.print((int)(Math.random() * 45 + 1) + " ");
		}
	}

}
