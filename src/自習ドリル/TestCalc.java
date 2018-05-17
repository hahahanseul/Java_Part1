package 自習ドリル;

public class TestCalc {
	public static void main(String[] args) {
		try {
			int result = Calc.div(10000, 0);
			System.out.println("割り算の結果：" + result);
		} catch (Exception e) {
			System.out.println("例外発生："+e.getMessage());
		}
		System.out.println("処理終了");
	}
}
