
class Discount {

	public static void main(String[] args) {
		int price = 26100;
		int family = 3;
		int discount = 0;

		switch (family) {
		case 2:
			discount = 4000;
			break;
		case 3:
			discount = 4000;
			break;
		case 4:
			discount = 4000;
			break;
		}
		System.out.println("利用料金：" + price + "円");
		System.out.println("家族の人数：" + family + "人");
		System.out.println("割引後の料金：" + (price - discount) + "円");
	}

}
