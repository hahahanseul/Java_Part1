import java.util.Scanner;

/*
 *@author Kim (キム)
 *
 */
class Practice142 {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("＜パスワード登録＞");
			System.out.println("整数４桁以上８桁以下");

			int pass = sc.nextInt();
			if (pass >= 1000 && pass <= 99999999) {
				System.out.println("パスワードを登録しました。");
			} else {
				System.out.println("もう一度やり直してください。");
			}
			sc.close();

		} catch (Exception e) {
			System.out.println("入力値は誤りです。");
		}
	}
}
