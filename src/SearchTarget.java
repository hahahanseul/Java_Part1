
class SearchTarget {

	public static void main(String[] args) {
		int[] data = { 2, 3, 5, 8, 13 };
		int target = 8;
		int i = 0;
		while (data[i] < target) {
			i++;
		}
		System.out.println("探索値の添え字：" + i);
	}

}
