package sorting;
// 소량 데이터 집합에 유리함, 제자리 정렬 알고리즘
public class InsertionSort {

	public void insertionSort(int[] data) {
		for (int which = 1; which < data.length; ++which) {
			int val = data[which];

			for (int i = 0; i < which; ++i) {
				if (data[i] > val) {
					System.arraycopy(data, i, data, i + 1, which - i);
					data[i] = val;
					break;
				}
			}
		}
	}

}
