/*
 * @author KIM　（キム）
 */
class Practice121 {

	public static void main(String[] args) {
		int price=1800;
		int total=0;
		int count =0;
/*　	「for」を使わない場合
	 	count++;
		total=price*count;
		System.out.println(count+"人分料金："+total+"円");
		count++;
		total=price*count;
		System.out.println(count+"人分料金："+total+"円");
		count++;
		total=price*count;
		System.out.println(count+"人分料金："+total+"円");
*/
		for(count=1;count<4;count++) {
			total=price*count;
			System.out.println(count+"人分料金："+total+"円");
		}
	}
}
