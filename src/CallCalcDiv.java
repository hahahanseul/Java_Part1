/*
 * @author KIM （キム）
 */
class CallCalcDiv {

	public static void main(String[] args) {
		int num1 = 9;
		int num2 = 5;
		int result;
		int remainder;
		result = calcDiv(num1, num2);
		remainder = calcRem(num1, num2);
		System.out.println(num1 + "/" + num2 + "=" + result);
		System.out.println("余り：" + remainder);
	}

	static int calcDiv(int n1, int n2) {
		int res = n1 / n2;
		return res;
	}

	static int calcRem(int n1, int n2) {
		int rem = n1 % n2;
		return rem;
	}

}
