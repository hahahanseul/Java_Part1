package comment;
import java.util.Scanner;
class Practice152 {
	public static void main(String[] args) {
		try{
			int[] sales = new int[3];
			Scanner sc = new Scanner(System.in);

			// 3回分（配列の要素数分）値を入力する。
			for(int i = 0; i < sales.length; i++) {
				System.out.print("データ入力" + (i + 1) + "件目 > ");
				sales[i] = sc.nextInt();
			}

			// 合計値用の変数を宣言
			int total = 0;

			// 3回分（配列の要素数分）値を表示
			for(int i = 0; i < sales.length; i++) {
				System.out.println((i + 1) + "件目："+ sales[i]);
				// 合計値用の変数に加算&代入
				total = total + sales[i];
			}

			// 合計値を出力
			System.out.println("合計：" + total);
			sc.close();
		} catch(Exception e) {
			System.out.println("入力値は不正です。");
		}
	}
}
