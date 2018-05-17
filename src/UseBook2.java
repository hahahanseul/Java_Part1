/**
 * @author kim キム
 * */
public class UseBook2 {
	public static void main(String[] args) {
		Book book1 = new Book();
		book1.setTitle("Javaプログラミング");
		book1.setPrice(2500);
		book1.displayBook();

		Book book2 = new Book();
		book2.setTitle("オブジェクト指向の極意");
		book2.setPrice(5000);
		book2.displayBook();
	}
}
