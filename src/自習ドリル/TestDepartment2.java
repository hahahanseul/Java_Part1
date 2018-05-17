package 自習ドリル;

public class TestDepartment2 {
	public static void main(String[] args) {
		Department dept = new Department(301, "人事部");
		try {
			int no = dept.getDeptNo();
			String name = dept.getDeptName();
			System.out.println("部署番号を設定しました：" + no);
			System.out.println("部署名を設定しました：" + name);
		} catch (Exception e) {
			System.out.println("例外発生：" + e.getMessage());
		} finally {
			System.out.println("必須処理");
		}
		System.out.println("処理終了");
	}
}
