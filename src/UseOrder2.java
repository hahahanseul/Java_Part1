/**
 * @author kim キム
 * */
public class UseOrder2 {
	public static void main(String[] args) {
		Order order1 = new Order();
		order1.setPrice(2500);
		order1.setQuantity(50);
		int payment1 = order1.calcPayment();
		System.out.println("支払料金１：" + payment1 + "円");

		Order order2 = new Order();
		order2.setPrice(5000);
		order2.setQuantity(20);
		int payment2 = order2.calcPayment();
		System.out.println("支払料金２：" + payment2 + "円");
		System.out.println("支払料金合計：" + (payment1 + payment2) + "円");
	}
}
