import java.util.Scanner;

/*
 * @author Kim　（キム）
 */

class Practice141 {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.print("入力１～１０＞");
			int num = sc.nextInt();
			if (num >= 1 && num <= 10) {
				System.out.println("入力値は範囲内です。");
			} else {
				System.out.println("入力値は範囲外です。");
			}
			sc.close();
		} catch (Exception e) {
			System.out.println("入力値は不正です。");
		}
	}
}
