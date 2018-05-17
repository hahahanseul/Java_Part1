/**
 * @author kim キム
 * */
public class UseOrder1 {
	public static void main(String[] args) {
		Order order = new Order();
		order.setPrice(2500);
		order.setQuantity(50);
		int payment = order.calcPayment();
		System.out.println("支払料金：" + payment + "円");
	}
}
