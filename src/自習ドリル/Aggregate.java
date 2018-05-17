package 自習ドリル;

public class Aggregate {
	public static void main(String[] args) {
		String csvData = "3900,1300,5200,2600,7700";
		String[] aryCsvData = csvData.split(",");
		int sum = 0;
		for(String data : aryCsvData) {
			int intData = Integer.parseInt(data);
			sum = sum + intData;
		}
		System.out.println("合計："+sum);
		System.out.println("平均："+sum / aryCsvData.length);
	}
}
