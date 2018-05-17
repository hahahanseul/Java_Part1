import java.util.Scanner;

class Example141 {

	public static void main(String[] args) {
		System.out.print("パスワード（整数４桁）＞");
		Scanner sc = new Scanner(System.in);
		int pass = sc.nextInt();
		if(pass == 7777) {
			System.out.println("認証OK");
		}
		sc.close();
	}
}
