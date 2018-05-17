package 自習ドリル;

public class UseAction1 {
	public static void main(String[] args) {
		Action action = new RegisterAction();
		action.init("登録");
		action .execute();
	}
}
