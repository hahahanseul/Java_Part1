import java.util.Scanner;

/*
 *@author Kim (キム)
 *
 */
class Practice152 {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			int[] sales = new int[3];
			for (int i = 0; i < sales.length; i++) {
				System.out.print("データ入力" + (i + 1) + "件目＞");
				sales[i] = sc.nextInt();
			}
			int total = 0;
			for (int i = 0; i < sales.length; i++) {
				System.out.println((i + 1) + "件目：" + sales[i]);
				total = total + sales[i];
			}

			System.out.println("データ合計：" + total);
			sc.close();
		} catch (Exception e) {
			System.out.println("入力値は不正です。");
		}
	}

}
