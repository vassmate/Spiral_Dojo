package spiral;

public class Spiral {

	public static int[][] createSpiral(int n) {
		if (n <= 1) {
			return null;
		}

		int spiralArray[][] = new int[n][n];
		int k = 1, colStartInd = 0, colEndInd = n - 1, rowStartInd = 0, rowEndInd = n - 1;

		while (k <= n * n) {
			for (int i = colStartInd; i <= colEndInd; i++) {
				spiralArray[rowStartInd][i] = k++;
			}

			for (int j = rowStartInd + 1; j <= rowEndInd; j++) {
				spiralArray[j][colEndInd] = k++;
			}

			for (int i = colEndInd - 1; i >= colStartInd; i--) {
				spiralArray[rowEndInd][i] = k++;
			}

			for (int j = rowEndInd - 1; j >= rowStartInd + 1; j--) {
				spiralArray[j][colStartInd] = k++;
			}

			colStartInd++;
			colEndInd--;
			rowStartInd++;
			rowEndInd--;
		}

		return spiralArray;
	}

	public static void main(String[] args) {

		int n = 5;
		int[][] sArray = createSpiral(n);

		if (createSpiral(n) == null) {
			System.out.println("Warning! The input number can't be less than 1!");
			return;
		}

		for (int[] is : sArray) {
			for (int i = 0; i < is.length; i++) {
				System.out.print(is[i] + "  ");
			}
			System.out.println("");
		}
	}
}
