import java.util.Scanner;

/*
 *@author Kim (キム)
 *
 */
class Practice142_自分用 {

	public static void main(String[] args) {
//	テキストの内容にしたがって作成したコード
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

	/*	Scanner sc = new Scanner(System.in);
		System.out.println("＜パスワード登録＞");
		System.out.println("整数４桁以上８桁以下");
		String str = sc.next();
		if (isNumber(str)) {
			// 入力された文字列strが数字のとき
			if (str.length() >= 4 && str.length() <= 8) {
				// 数字で、4桁以上8桁以下のとき
				System.out.println("パスワードを登録しました。");
			} else {
				// 桁数が足りないか、範囲を超えるとき
				System.out.println("もう一度やり直してください。");
			}
		} else {
			// 入力された文字列に数字以外の文字が混ざっているとき
			System.out.println("入力値は誤りです。");
		}
		sc.close();*/
	}

	/*static boolean isNumber(String str) {
		// 入力された文字列strを文字配列charsに変更する。
		char[] chars = str.toCharArray();

		// 判断した結果を代入する変数resultを用意、初期化
		boolean result = false;


		// 入力された文字列の中に、数字ではないものの数を代入する変数ch
		int ch = 0;

		// 文字配列charsの要素が「０～９」に該当するかを確認
		for (int i = 0; i < chars.length; i++) {
			if (!(chars[i] >= 48 && chars[i] <= 57)) {
				ch++;
				// もし、配列の中に「０～９」に該当しない文字があったら、chをインクリメントさせる。
			}
		}

		// 文字配列が数字の場合、resultにtrueを代入
		if (ch == 0) {
			result = true;
		}
		return result;
	}*/
}
