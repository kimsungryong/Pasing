import java.util.Scanner;
import java.util.StringTokenizer;

public class CalParsing {

	public static void main(String[] args) {
		// ������ �Ľ�
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		System.out.println(input);

		StringTokenizer st = new StringTokenizer(input, "+-*/=()", true);

		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());

		}
	}

}
