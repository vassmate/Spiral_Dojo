package spiral;

public class Spiral {

	public static int[][] createSpiral(int n) {
		if (n <= 1) {
			return null;
		}

		int[][] spiralArray = new int[n][n];
		int incr = 1;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				spiralArray[i][j] = incr;
				incr++;
			}
		}

		return spiralArray;
	}

	public static void main(String[] args) {
		int[][] sArray = createSpiral(5);

		for (int[] is : sArray) {
			for (int i = 0; i < is.length; i++) {
				System.out.print(is[i] + ", ");
			}
			System.out.println(" ");
		}
	}
}
