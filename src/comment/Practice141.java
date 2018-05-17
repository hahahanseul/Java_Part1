package comment;
import java.util.Scanner;
class Practice141 {
	public static void main(String[] args) {
		try {
			System.out.print("入力（1～10）> ");
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();

			if(num >= 1) {
				// num >= 1がtrueのときに入る
				if(num <= 10) {
					// num <= 10がtrueのときに入る
					System.out.println("入力値は範囲内です。");
				} else {
					// num <= 10がfalseのときに入る
					System.out.println("入力値は範囲外です。");
				}
			} else {
				// num >= 1がfalseのときに入る
				System.out.println("入力値は範囲外です。");
			}
			// Scannerを閉じるのは、if文の範囲外に書く。
			sc.close();
		} catch(Exception e) {
			System.out.println("入力値は不正です。");
		}
	}
}