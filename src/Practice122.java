import java.util.Scanner;

/*
 *@author Kim (キム)
 *
 */

public class Practice122 {
	public static void main(String[] args) {
		try {
			//スキャナーを作成(入力値を受け付ける機能を持つ)
			Scanner sc = new Scanner(System.in);
			System.out.print("金額を入力してください＞");

			//入力された値をint型として、取得する。countに代入。
			int money = sc.nextInt();
			int rem = money % 10000;
			int bill = money / 10000;
			System.out.println("10000円紙幣：" + bill + "枚");
			System.out.println("残り：" + rem + "円");

			//入力を終了
			sc.close();
		} catch (Exception e) {
			System.out.println("エラーが発生しました！");
		}
	}
}
