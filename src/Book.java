/**
 * @author kim キム
 * */
class Book {
	String title;
	int price;

	void setTitle(String t) {
		title = t;
	}

	void setPrice(int p) {
		price = p;
	}

	void displayBook() {
		System.out.println("書籍名：" + title);
		System.out.println("価格：" + price + "円");
	}
}
