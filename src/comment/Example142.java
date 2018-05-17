package comment;
import java.util.Scanner;
class Example142 {
	public static void main(String[] args) {
		System.out.print("誕生年（西暦４桁）> ");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		if(year >= 1989) {
			// year >= 1989がtrueのとき
			System.out.println("平成生まれです。");
		} else if(year >= 1926) {
			// year >= 1989がfalseかつ、year >= 1926がtrueのとき
			System.out.println("昭和生まれです。");
		}
		sc.close();
	}
}
