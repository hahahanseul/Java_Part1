package comment;
import java.util.Scanner;
class Practice122 {
	public static void main(String[] args) {
		try {
			// エラーが起きる可能性のある箇所をtryで囲う。

			// 入力値を読み込むScannerを作成
			Scanner sc = new Scanner(System.in);
			System.out.print("金額を入力してください > ");

			// 入力された値を整数値として取得、moneyに代入。
			int money = sc.nextInt(); //　エラーが発生する可能性のある箇所。

			// 例外発生時は、以降の処理は実行されない。

			// 入力値(money)を10000で割った値の余りを、remに代入。
			int rem = money % 10000;

			// 入力値(money)を10000で割った値を、billに代入。
			int bill = money / 10000;

			System.out.println("10000円紙幣：" + bill + "枚");
			System.out.println("残り：" + rem + "円");
			sc.close();
		} catch(Exception e) {
			// エラー発生時は、ここの処理を行う。
			System.out.println("エラーが発生しました！");
		}
	}
}
