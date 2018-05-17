package 自習ドリル;

public class Pangram {
	public static void main(String[] args) {
		String pangram = "The,quick,brown,fox,jumps,over,the,lazy,dog";
		String[] aryPangram = pangram.split(",");
		for (String word : aryPangram) {
			System.out.print(word + " ");
		}
	}
}
