package 自習ドリル;

public class UseAction2 {
	public static void main(String[] args) {
		Action[] action = new Action[2];
		String[] actMsg = { "登録", "更新" };
		action[0] = new RegisterAction();
		action[1] = new UpdateAction();
		for (int i = 0; i < action.length; i++) {
			action[i].init(actMsg[i]);
			action[i].execute();
		}
	}
}
