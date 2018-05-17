
class Example132 {

	public static void main(String[] args) {

		// String型の2次元配列型の変数userを宣言。配列を代入。
		String[][] user = new String[2][2];

		// user配列の0行目、0列目に値をセット
		user[0][0] = "P0111";
		// user配列の0行目、1列目に値をセット
		user[0][1] = "鈴木晶子";
		// user配列の1行目、0列目に値をセット
		user[1][0] = "G1010";
		// user配列の1行目、1列目に値をセット
		user[1][1] = "高橋大介";
		System.out.print("ID：" + user[0][0] + "，");
		System.out.println("氏名：" + user[0][1]);
		System.out.print("ID：" + user[1][0] + "，");
		System.out.println("氏名：" + user[1][1]);

		// 行数の表示
		System.out.println(user.length);

		// 0行目の列数を表示
		System.out.println(user[0].length);

		// String型の2次元配列型の変数userを宣言。配列を代入。
		String[][] user2 = {{"1","従業員1"},{"2","従業員2"}};

	}

}
