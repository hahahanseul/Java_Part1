
class Example162 {

	public static void main(String[] args) {
		charge(3);
		charge(700, 3);
	}
	static void charge(int count) {
		int money = 600 * count;
		System.out.println("合計料金："+ money +"円");
	}
	static void charge(int price, int count) {
		int money = price * count;
		System.out.println("合計料金："+ money +"円");
	}
}
