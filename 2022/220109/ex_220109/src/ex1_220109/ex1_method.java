package ex1_220109;

public class ex1_method {
	static void indexsearch(int[] a, int n, int key) {
		int[] index = new int[100];
		for (int i = 0; i < n; i++) {
			if (a[i] == key) {
				System.out.println(i + 1 + " ");
				index[i] = 1;
			} else {
				index[i] = 0;
			}
		}
	}

	static int seqsearch(int[] a, int n, int key) {
		int[] index = new int[100];
		for (int i = 0; i < n; i++) {
			if ((a[i]) == key) {
				index[i] = 1;
				for (int j = 0; j < n; j++) {
					if (index[j] == 1)
						System.out.println(j);
				}
				return 1;
			}

		}

		return -1;

	}
}
