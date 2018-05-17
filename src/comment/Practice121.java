package comment;
class Practice121 {
	public static void main(String[] args) {

		// 変数の宣言
		int price = 1800; // 1人分の価格（単価）
		int total = 0;    // 合計金額
		int count = 0;    // 人数

		// 1人分
		count++;
		total = price * count;
		System.out.println(count + "人分料金：" + total + "円");

		// 2人分
		count++;
		total = price * count;
		System.out.println(count + "人分料金：" + total + "円");

		// 3人分
		count++;
		total = price * count;
		System.out.println(count + "人分料金：" + total + "円");
	}
}
