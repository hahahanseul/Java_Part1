import java.util.Scanner;

/*
 *@author Kim (キム)
 *
 */
class Practice132 {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			int[][] price = { { 6500, 7000, 8000 },
					    	  { 7500, 8500, 9500 },
					    	  { 10000, 11500, 14000 }};
			/*			int[][] price = new int[3][3];
						price[0][0] = 6500;
						price[0][1] = 7000;
						price[0][2] = 8000;
						price[1][0] = 7500;
						price[1][1] = 8500;
						price[1][2] = 9500;
						price[2][0] = 10000;
						price[2][1] = 11500;
						price[2][2] = 14000;*/

			System.out.println("<レンタカー料金>");
			System.out.print("０：コンパクト，１：スタンダード，２：プレミアム＞");
			int num = sc.nextInt();
			System.out.print("０：6時間，１：12時間，２：24時間＞");
			int hour = sc.nextInt();
			System.out.println("料金：" + price[num][hour] + "円");
			sc.close();
		} catch (Exception e) {
			System.out.println("エラーが発生しました！");
		}

	}

}
