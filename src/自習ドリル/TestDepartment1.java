package 自習ドリル;

public class TestDepartment1 {
	public static void main(String[] args) {
		//Department dept = null;
		Department dept = new Department(101, "総務管理部");
		try {
			int no = dept.getDeptNo();
			String name = dept.getDeptName();
			System.out.println("部署番号を設定しました：" + no);
			System.out.println("部署名を設定しました：" + name);

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("処理終了");
	}
}
