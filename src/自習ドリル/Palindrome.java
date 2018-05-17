package 自習ドリル;

public class Palindrome {
	public static void main(String[] args) {
		String word1 = "go";
		String word2 = "dog";
		StringBuilder sb = new StringBuilder(word1);
		sb.append(word2);
		System.out.println("追加後："+sb);
		sb.insert(3, ",");
		System.out.println("挿入後："+sb);
		sb.reverse();
		System.out.println("反転後："+sb);
	}
}
