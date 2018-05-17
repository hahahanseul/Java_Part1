package comment;
import java.util.Scanner;

class Example141 {
	public static void main(String[] args) {
		System.out.print("パスワード（整数４桁）> ");
		Scanner sc = new Scanner(System.in);
		int id = 0000;
		int pass = sc.nextInt();

		// ()内がtrue（真）のときに{}内を実行
		if (pass == 7777) {
			if(id == 1000) {
				// pass == 7777かつid == 1000のときこのブロックを実行
			}
			// pass == 7777がtrueのとき
			System.out.println("認証OK");
		} else {
			// pass == 7777がfalseのとき（必須ではない）
			System.out.println("認証NG");
		}
		sc.close();

		// Stringオブジェクトを二つ作って、==演算子で比較（アドレスの比較）
		System.out.println(new String("Hello") == new String("Hello"));

		// equalsメソッド（二つのStringオブジェクトが持つ文字列を比較）
		System.out.println(new String("Hello").equals(new String("Hello")));
	}
}
