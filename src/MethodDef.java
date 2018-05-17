/*
 * @author KIM （キム）
 */
class MethodDef {

	public static void main(String[] args) {
		System.out.println("main開始");
		methodB();
		methodA();
		System.out.println("main終了");
	}

	static void methodA() {
		System.out.println("　methodA実行 ");
	}

	static void methodB() {
		System.out.println("　methodB実行 ");
	}

}
