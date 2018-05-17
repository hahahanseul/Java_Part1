import java.util.Scanner;

class Example151 {

	public static void main(String[] args) {
		System.out.print("カウント数＞");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int i = 0;
		while (i < num) {
			// 継続条件(i < num)がtrueの間のみ、｛｝内を実行する。
			System.out.println("カウント：" + i);
			// カウンタ変数をっカウントアップ(インクリメントする)
			i++;
		}
		sc.close();
	}

}
