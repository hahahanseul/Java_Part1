import java.util.Scanner;

class Example142 {

	public static void main(String[] args) {
		System.out.println("誕生日（西暦４桁）＞");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		if (year >= 1989) {
			System.out.println("平成生まれです。");
		} else if (year >= 1926) {
			System.out.println("昭和生まれです。");
		}
		sc.close();
	}

}
