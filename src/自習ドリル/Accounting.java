package 自習ドリル;

public class Accounting extends Department {
	private int cost;

	public Accounting(int deptNo, String deptName, int cost) {
		super(deptNo, deptName);
		this.cost = cost;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

}
