public class Example131 {
	public static void main(String[] args) {
		// int型の配列ticketを宣言。作成した配列のアドレスを格納
		int[] ticket = new int[3];

		// 配列ticketの各部屋に、値を代入。
		ticket[0] = 1800;
		ticket[1] = 1200;
		ticket[2] = 600;

		// 1行Ver.
		// int[] ticket = {1800,1200,600};

		// 配列の各部屋から、値を取り出して出力
		System.out.println("大　人：" + ticket[0] + "円");
		System.out.println("高校生：" + ticket[1] + "円");
		System.out.println("中学生：" + ticket[2] + "円");

		// 配列名.lengthで配列の持つ部屋数を取得
		System.out.println("配列の持つ部屋数："+ticket.length);
	}
}
