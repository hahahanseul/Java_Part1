import java.util.Scanner;

/**
 * @author kim キム
 */
class Practice162 {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("<ユーザー登録>");
			System.out.print("氏名（必須）＞");
			String name = sc.next();
			System.out.print("年齢（０：登録しない）＞");
			int age = sc.nextInt();
			// 取得してきた値に応じて条件分岐
			if (age != 0) {
				// 年齢が０のとき、register(String name, int age)を呼び出す
				register(name, age);
			} else {
				// 年齢が０以外のとき、register(String name)を呼び出す
				register(name);
			}

			sc.close();
		} catch (Exception e) {
			System.out.println("入力値は不正です。");
		}

	}

	static void register(String name) {
		System.out.println("氏名：" + name + "登録しました。");
	}

	static void register(String name, int age) {
		System.out.println("氏名：" + name + "を登録しました。");
		System.out.println("年齢：" + age + "を登録しました。");

	}

}
