package 自習ドリル;

public class WordSearch {
	public static void main(String[] args) {
		String[] data = { "orchestrating", "baza", "a", "brighter", "goza", "world"};
		for(String msg :data) {
			if(!("baza".equals(msg))&&!("goza".equals(msg))) {
				System.out.print(msg + " ");
			}
		}
	}
}
