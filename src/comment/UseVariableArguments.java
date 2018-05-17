package comment;

class UseVariableArguments {
	public static void main(String[] args) {
		// 引数0個の場合
		int ans = calcTotal();
		// 引数3個の場合
		ans = calcTotal(1000,2000,3000);
		System.out.println(ans);
	}

	/**
	 * 合計金額計算
	 * @param data int型の可変長
	 * @return 引数リストの合計金額
	 */
	static int calcTotal(int... data) {
		// 合計金額計算用の変数total
		int total = 0;

		// 可変長引数は、受け取った引数を配列として扱う。
					// 呼び出し側で渡された引数リストが配列dataになる。
		for (int price : data) {
			// 配列を一要素ずつ取得し、totalへ加算&代入。
			total = total + price;
		}
		// 計算結果totalを返却
		return total;
	}
}
