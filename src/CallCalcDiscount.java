/*
 * @author KIM （キム）
 */
class CallCalcDiscount {

	public static void main(String[] args) {
		int fee = 17400;
		int count = 2;
		int discount;
		discount = calcDiscount(fee, count);
		System.out.println("利用料金　　：" + fee + "円");
		System.out.println("家族の人数　：" + count + "人");
		System.out.println("割引後の料金：" + discount);

	}

	static int calcDiscount(int f, int c) {
		int d = 0;
		switch (c) {
		case 2:
			d = 4000;
			break;
		case 3:
			d = 6000;
			break;
		case 4:
			d = 8000;
		}
		return f - d;
	}
}
