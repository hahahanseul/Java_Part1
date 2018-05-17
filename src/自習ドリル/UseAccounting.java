package 自習ドリル;

public class UseAccounting {
	public static void main(String[] args) {
		Accounting dept = new Accounting(301, "経理部", 0);
		int no = dept.getDeptNo();
		String name = dept.getDeptName();
		int cost = dept.getCost();
		System.out.println("部署番号を登録しました：" + no);
		System.out.println("部署名を登録しました　：" + name);
		System.out.println("費用を登録しました　　：" + cost);
		dept.setCost(1000000);
		cost = dept.getCost();
		System.out.println("費用を更新しました　　：" + cost);
	}
}
