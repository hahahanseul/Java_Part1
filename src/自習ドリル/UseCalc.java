package 自習ドリル;

public class UseCalc {
	public static void main(String[] args) {
		int result1 = Calc.add(5000, 7000);
		System.out.println("足し算の結果" + result1);
		int result2 = Calc.multi(result1, 2);
		System.out.println("掛け算の結果" + result2);
		int result3 = Calc.sub(result2, 4000);
		System.out.println("引き算の結果" + result3);
		int result4 = Calc.div(result3, 2);
		System.out.println("割り算の結果" + result4);
	}
}
