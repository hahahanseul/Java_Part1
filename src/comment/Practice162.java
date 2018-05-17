package comment;
import java.util.Scanner;
class Practice162 {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("<ユーザー登録>");
			System.out.print("氏名（必須）> ");
			// 入力値（氏名）を変数nameに代入
			String name = sc.next();
			System.out.print("年齢（０：登録しない）> ");
			// 入力値（年齢）を変数ageに代入
			int age = sc.nextInt();
			// 取得してきた値に応じて条件分岐
			if(age != 0){
				// 年齢が0以外のとき、register(String name, int age)を呼び出す
				register(name, age);
			} else {
				// 年齢が0のとき、register(String name)を呼び出す
				register(name);
			}
			sc.close();
		} catch(Exception e) {
			System.out.println("入力値は不正です。");
		}
	}

	/**
	 * ユーザー情報登録
	 * @param name 氏名
	 */
	static void register(String name) {
		System.out.println("氏名：" + name + "を登録しました。");
	}

	/**
	 * ユーザー情報登録
	 * @param name 氏名
	 * @param age 年齢
	 */
	static void register(String name, int age) {
		System.out.println("氏名：" + name + "を登録しました。");
		System.out.println("年齢：" + age + "を登録しました。");
	}
}
