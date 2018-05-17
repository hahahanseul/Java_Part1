package 自習ドリル;

public class LoginProcess extends BasicProcess {
	public void action() {
		System.out.println("[ユーザーデータ読込み]");
	}

	public void loginAction(String id, String pass) {
		System.out.println("ID" + id + ", " + "PASS：" + pass);
		System.out.println("[ログイン成功]");
	}
}
