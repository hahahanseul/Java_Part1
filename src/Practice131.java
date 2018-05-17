import java.util.Scanner;
/*
 *@author Kim (キム)
 *
 */

class Practice131 {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			int[] ticket = new int[3];
			ticket[0] = 1800;
			ticket[1] = 1200;
			ticket[2] = 600;

			System.out.print("０：大人，１：高校生，２：中学生＞");
			int num = sc.nextInt();

			System.out.println("料金：" + ticket[num] + "円");
			sc.close();
		} catch (Exception e) {
			System.out.println("エラーが発生しました！");
		}
	}
}
