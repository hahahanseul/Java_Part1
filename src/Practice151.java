import java.util.Scanner;
/*
 *@author Kim (キム)
 *
 */
public class Practice151 {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.print("変数を入力＞");
			int num = sc.nextInt();
			int i = 1;
			int sum = 0;
			while (i <= num) {
				sum = sum + i;
				i++;
			}
			sc.close();
			System.out.println("1から" + num + "までの合計：" + sum);
		} catch (Exception e) {
			System.out.println("入力値は不正です。");
		}

	}
}
