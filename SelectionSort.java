public class SelectionSort {
	public void sort(int vetor[]) {
		int n = vetor.length;

		for (int i = 0; i < n - 1; i++) {

			int min_idx = i;
			for (int j = i + 1; j < n; j++)
				if (vetor[j] > vetor[min_idx])
					min_idx = j;

			int temp = vetor[min_idx];
			vetor[min_idx] = vetor[i];
			vetor[i] = temp;
		}
	}

	public void printArray(int vetor[]) {
		int n = vetor.length;
		for (int i = 0; i < n; ++i)
			System.out.print(vetor[i] + " ");
		System.out.println();
	}

	public static void main(String args[]) {
		SelectionSort k = new SelectionSort();
		int vetor[] = { 5, 25, 12, 22, 91 };
		k.sort(vetor);
		System.out.println("");
		k.printArray(vetor);
	}
}
