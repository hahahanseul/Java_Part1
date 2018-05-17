package comment;

class LogicSample {

	public static void main(String[] args) {

		int a = 10;
		int b = 10;
		int c = 10;
		int d = 10;

		// &一個のときは、左辺がfalseの場合でも、右辺も評価する
		boolean result1 = a++ > 10 & ++b > 10;
		System.out.println("result1: " + result1 + " a: " + a + " b: " + b);

		// &二個のときは、左辺がfalseの場合は、右辺は評価しない
		boolean result2 = c++ > 10 && ++d > 10;
		System.out.println("result2: " + result2 + " c: " + c + " d: " + d);
	}
}
