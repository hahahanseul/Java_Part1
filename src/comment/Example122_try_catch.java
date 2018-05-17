package comment;
import java.util.Scanner;

class Example122_try_catch {
	public static void main(String[] args) {

		try {
			// 例外が発生する可能性のある箇所をtryで囲う。

			// スキャナーを作成（入力値を受け付ける機能を持つ）
			Scanner sc = new Scanner(System.in);
			System.out.print("チケット枚数を入力してください > ");

			// 入力された値をint型として、取得する。countに代入。
			int count = sc.nextInt();

//          ここから先は実行されない！

			// count * 600 の結果をmoneyに代入。
			int money = 600 * count;

			System.out.println
				("大人" + count + "人の料金：" + money + "円");

			// 入力を終了
			sc.close();
		}catch (Exception e) {
			// 例外が発生した場合の処理をcatch句に書く。

			System.out.println("整数値を入力して下さい。");
		}
		System.out.println("終了");
	}
}
