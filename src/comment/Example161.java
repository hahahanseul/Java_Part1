package comment;
import java.util.Scanner;
class Example161 {
	public static void main(String[] args) {
		System.out.print("金額 > ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		// taxメソッド(引数num)を呼び出し、その戻り値をresultに代入
		double result = Example161.tax(num);
		System.out.println("税込金額：" + result + "円");
		sc.close();
	}

	  // 戻り値の型         // 引数の型
	static double tax(int data) {
		// 引数として渡されてきた値（メソッド内ではdata）を計算してansに代入
		double ans = data * 1.08;

		// ans（double型を呼び出し元へ返却）
		return ans;
	}
}