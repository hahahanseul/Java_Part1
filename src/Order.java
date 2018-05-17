/**
 * @author kim キム
 * */
public class Order {
	int price, quantity;

	void setPrice(int p) {
		price = p;
	}

	void setQuantity(int q) {
		quantity = q;
	}

	int calcPayment() {
		int result = price * quantity;
		return result;
	}
}
