package comment;
import java.util.Scanner;

class Practice161 {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.print("ユーザーID：> ");

			// 入力値を文字列で受け取る。userIdにアドレスを代入。
			String userId = sc.next();
			System.out.print("パスワード：> ");
			// 入力値を整数で受け取る。passwordに値を代入。
			int password = sc.nextInt();
			// loginCheckメソッドを呼び出し、引数として、userId（String）、password（int）を渡す。
			// 戻り値を、resultへ代入
			String result = loginCheck(userId, password);
			System.out.println(result);
			sc.close();
		} catch (Exception e) {
			System.out.println("入力値は不正です。");
		}
	}

	/**
	 * ログイン判定（引数として渡されたid、passが正しいかチェック）
	 * @param id ユーザID
	 * @param pass パスワード
	 * @return 判定結果
	 */
	static String loginCheck(String id, int pass) {
		// ログイン判定
		if ("G1010".equals(id) && pass == 8888) {
			// idがG1010と等しい、かつpassが8888と等しいか判定
			return "ログインしました。";
		} else {
			return "IDまたはパスワードが違います。";
		}
	}
}
