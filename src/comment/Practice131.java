package comment;
import java.util.Scanner;
class Practice131 {
	public static void main(String[] args) {
		try {

			// int型配列型の変数ticketを宣言。int型の要素を代入
			int[] ticket = {1800, 1200, 600};
			System.out.print("０：大人, １：高校生, ２：中学生 > ");

			// 入力値を読み込むScannerオブジェクトを作成
			Scanner sc = new Scanner(System.in);

			// Scannerから入力値を取得。int型変数numに代入。
			int num = sc.nextInt();

								// int型配列ticketのnum番目を取得。
			System.out.println("料金：" + ticket[num] + "円");
			sc.close();
		} catch(Exception e) {
			System.out.println("エラーが発生しました！");
		}
	}
}
