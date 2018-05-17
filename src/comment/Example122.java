package comment;
import java.util.Scanner;

class Example122 {
	public static void main(String[] args) {

		// スキャナーを作成（入力値を受け付ける機能を持つ）
		Scanner sc = new Scanner(System.in);
		System.out.print("チケット枚数を入力してください > ");

		// 入力された値をint型として、取得する。countに代入。
		int count = sc.nextInt();

		// count * 600 の結果をmoneyに代入。
		int money = 600 * count;

		System.out.println
			("大人" + count + "人の料金：" + money + "円");

		// 入力を終了
		sc.close();
	}
}
