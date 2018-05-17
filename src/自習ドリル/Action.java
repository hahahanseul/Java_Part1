package 自習ドリル;

public abstract class Action {
	public void init(String action) {
		System.out.println("[" + action + "初期設定]");
	}

	public abstract void execute();
}
