package spiral;

public class Spiral {

	public static int[][] createSpiral(int n) {
		if (n <= 1) {
			return null;
		}

		int[][] spiralArray = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				spiralArray[i][j] = j;
			}
		}

		return spiralArray;
	}

	public static void main(String[] args) {

	}
}
