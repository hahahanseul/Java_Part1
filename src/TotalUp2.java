
class TotalUp2 {

	public static void main(String[] args) {
		int[] data = { 7300, 5400, 3100, 9700, 1800 };
		int sum = 0;

		// 拡張for文
		for (int d : data) {
			sum = sum + d;
		}

		/* for文
		for(int i=0; i<data.length; i++) {
			sum = sum + data[i];
		}
		*/

		System.out.println("合計：" + sum + "円");
		System.out.println("平均：" + (sum / data.length) + "円");
	}
}
