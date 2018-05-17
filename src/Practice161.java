import java.util.Scanner;

class Practice161 {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.print("ユーザーID：>");
			String userId = sc.next();
			System.out.print("パスワード：");
			int password = sc.nextInt();
			String result = loginCheck(userId, password);
			System.out.println(result);
			sc.close();
		} catch (Exception e) {
			System.out.println("入力値不正です。");
		}

	}

	static String loginCheck(String id, int pass) {
		String result;
		if (id.equals("G1010") && pass == 8888) {
			result = "ログインしました。";
		} else {
			result = "IDまたはパスワードが違います。";
		}
		return result;
	}

}
