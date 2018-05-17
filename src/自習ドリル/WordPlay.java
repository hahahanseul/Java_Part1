package 自習ドリル;

public class WordPlay {
	public static void main(String[] args) {
		String message = "ytpmuh";
		int msgLen = message.length();
		System.out.println("文字数：" + msgLen);
		for (int i = msgLen - 1; i >= 0; i--) {
			char c = message.charAt(i);
			System.out.print(c);
		}
	}
}
