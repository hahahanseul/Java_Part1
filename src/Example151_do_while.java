import java.util.Scanner;

class Example151_do_while {
	public static void main(String[] args) {
		System.out.println("カウント数＞");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int i = 0;
		do {
			System.out.println("");
			i++;
		}while(i<num);
		sc.close();
	}
}
