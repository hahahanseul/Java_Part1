package comment;
class ArrayPhoneNumber {
	public static void main(String[] args) {
		// String型の配列変数telを宣言し、要素数３の一次元配列を生成して代入する
		String[] tel = new String[3];
		// 一次元配列telの各要素に文字列を代入する
		tel[0] = "03";
		tel[1] = "4567";
		tel[2] = "8912";
		System.out.print("電話番号：");
		// 一次元配列telの各要素の値をディスプレイに表示する
		System.out.println(tel[0] + "-" + tel[1] + "-" + tel[2]);
	}
}
