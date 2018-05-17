
class Example152 {

	public static void main(String[] args) {
		/*		int price = 1800;
				for (int i = 1; i <= 3; i++) {
					int total = price * i;
					System.out.println(i + "人分料金" + total + "円");
				}*/

		int[] ticket = { 1800, 1200, 600 };
		//   ①カウンタ変数 ②継続条件(配列の要素数) ③ブロック処理後の処理
		for (int i = 0; i < ticket.length; i++) {
			System.out.println(ticket[i]);
		}
	}

}
