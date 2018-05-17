package comment;
import java.util.Scanner;
class Example151 {
	public static void main(String[] args) {
		System.out.print("カウント数 > ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int i = 0; // カウンタ変数（0である必要はないが、配列など0のほうが扱いやすい）
		while(i < num) {
			// 継続条件（i < num）がtrueの間のみ、{}内を実行する
			System.out.println("カウント：" + i);

			// カウンタ変数をカウントアップ（インクリメントする）
			i++;

			// 以下、breakの例
			if(i == 5) {
				// iが5になった時点でbreak
				break;
			}

			// 以下、continueの例
			if((i % 2) == 0) {
				// 偶数のときのみ、continue
				continue;
			}
			System.out.println("カウント：" + i);
		}
		sc.close();
	}
}