
class CheckScore2 {

	public static void main(String[] args) {
		int[] score = { 60, 80, 65 };
		int total = score[0] + score[1] + score[2];
		System.out.println("合格：" + total + "点");
		if (total >= 210) {
			System.out.println("合格");
		} else if (total >= 180 && total < 210) {
			System.out.println("補欠合格");
		} else {
			System.out.println("不合格");
		}
	}

}
