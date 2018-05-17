package comment;
class Example162 {
	public static void main(String[] args) {
		charge(-3); // 引数1個のほうのメソッド呼び出し
		charge(700, 3); // 引数2個のほうのメソッド呼び出し
	}

	/**
	 * 金額計算
	 * 引数として与えられた個数に600円をかけて値を出力
	 * @param count 個数
	 */
	static void charge(int count) {
		// 不正な値が引数として渡されていないかチェック
		// assertの後に、絶対trueになる条件（前提）を書く。
		// falseの場合、即エラーになる。
		assert count >= 0;

		int money = 600 * count;
		System.out.println("合計料金：" + money + "円");
	}

	/**
	 * 金額計算
	 * 引数として与えられた個数に、引数とし与えられた金額をかけて値を出力
	 * @param price 金額
	 * @param count 個数
	 */
	static void charge(int price, int count) {
		int money = price * count;
		System.out.println("合計料金：" + money + "円");
	}
}