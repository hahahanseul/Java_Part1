package comment;
class Divide {
	public static void main(String[] args) {
		// int型の変数num1とnum2を宣言し、値を代入する
		int num1 = 7;
		int num2 = 3;

		// int型の変数resultとremainderを宣言する
		int result;
		int remainder;

		// 変数resultに、num1をnum2で割った結果を代入する
		result = num1 / num2;

		// 変数remainderに、num1をnum2で割った余りを代入する
		remainder = num1 % num2;

		// 変数の値をディスプレイに表示する
		System.out.println(num1 + " / " + num2 + " = " + result);
		System.out.println("余り：" + remainder);
	}
}
