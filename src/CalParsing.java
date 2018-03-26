import java.util.Scanner;
import java.util.StringTokenizer;

public class CalParsing {

	public static void main(String[] args) {
		// 데이터 파싱

		System.out.println("0~100 이내의 정수를 사칙연산하시오");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		System.out.println(input);

		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			System.out.println("input.charAt(" + i + ") : " + ch);
		}

		char[] chArr = input.toCharArray();

		System.out.println(chArr);

		StringTokenizer st = new StringTokenizer(input, "+-*/=()", true);

		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());

		}
	}

}
