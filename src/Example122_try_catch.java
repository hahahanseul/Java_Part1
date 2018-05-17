import java.util.Scanner;

public class Example122_try_catch {
	public static void main(String[] args) {
		try {
			//例外が発生する可能性がある箇所をtry囲う。

			Scanner sc = new Scanner(System.in);
			System.out.println("チケット枚数を入力してください>");

			int count = sc.nextInt();

			//catchの所に行ってしまう場合、ここからは実行されない。
			int money = 600 * count;
			System.out.println("大人"+count+"枚の料金："+money+"円");
			sc.close();
		} catch (Exception e) {
			//例外が発生した場合の処理をcatch句に書く。
			System.out.println("例外発生");
		}
		System.out.println("終了");
	}
}
