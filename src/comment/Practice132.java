package comment;
import java.util.Scanner;
class Practice132 {
	public static void main(String[] args) {
		try {

			// int型の2次元配列型の変数priceを宣言。値を代入。
			int[][] price = {	{6500, 7000, 8000},
								{7500, 8500, 9500},
								{10000, 11500, 14000}};

			System.out.println("<レンタカー料金>");
			System.out.print("０：コンパクト, １：スタンダード, ２：プレミアム > ");

			// Scannerオブジェクトを生成
			Scanner sc = new Scanner(System.in);

			// Scannerに定義された、nextIntメソッドを呼び出して、入力値を取得
			int num = sc.nextInt();

			System.out.print("０：６時間, １：12時間, ２：24時間 > ");

			// Scannerに定義された、nextIntメソッドを呼び出して、入力値を取得
			int hour = sc.nextInt();
									// 2次元配列priceのnum行目のhour列目を取得
			System.out.println("料金：" + price[num][hour] + "円");

			// Scannerクラスに定義された、closeメソッドを呼び出して、入力受付を終了。
			sc.close();
		} catch(Exception e) {
			System.out.println("エラーが発生しました！");
		}
	}
}
