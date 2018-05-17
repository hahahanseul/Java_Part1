package comment;

class SwitchSample {

	public static void main(String[] args) {

		String season = "梅雨";

		switch (season) {
		case "春":
		case "梅雨":
			System.out.println("英語でSpringです。");
			break;
		case "夏":
			System.out.println("英語でSummerです。");
			break;
		case "秋":
			System.out.println("英語でAutumnです。");
			break;
		case "冬":
			System.out.println("英語でWinterです。");
			break;
		default:
			System.out.println("季節ではありません。");
			break;
		}
	}
}
