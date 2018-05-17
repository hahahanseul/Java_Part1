/*
 * @author KIM （キム）
 */
class CallPhoneNumber {

	public static void main(String[] args) {
		String tel1;
		String tel2;
		String tel3;
		tel1 = "03";
		tel2 = "4567";
		tel3 = "8912";
		phoneNumber(tel1, tel2, tel3);
	}

	static void phoneNumber(String t1, String t2, String t3) {
		System.out.print("電話番号：");
		System.out.println(t1 + "-" + t2 + "-" + t3);
	}
}
