package sorting;

public class SelectionSort {

	public static void main(String[] args) {
		int i, j, least, temp;
		int[] list = new int[] { 2, 5, 6, 1 };
		int arrLenght = list.length;

		// ������ ���ڴ� �ڵ����� ���ĵǱ� ������ (���� ����-1) ��ŭ �ݺ��Ѵ�.
		for (i = 0; i < arrLenght - 1; i++) {
			least = i;

			// �ּڰ��� Ž���Ѵ�.
			for (j = i + 1; j < arrLenght; j++) {
				if (list[j] < list[least])
					least = j;
			}

			// �ּڰ��� �ڱ� �ڽ��̸� �ڷ� �̵��� ���� �ʴ´�.
			if (i != least) {
				swap(list[i], list[least]);
			}
		}

	}
	
	public static void swapArr(int a, int b, int[] arr) {
		int temp;
		temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
	
	

}
