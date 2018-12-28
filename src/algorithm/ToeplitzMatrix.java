package algorithm;


/**
 * 766. Toeplitz Matrix
 * 
 * A matrix is Toeplitz if every diagonal from top-left to bottom-right has the same element.
 * 
 * Now given an M x N matrix, return True if and only if the matrix is Toeplitz.
 * 
 * Example 1:
 * Input:
 * matrix = [
 * [1,2,3,4],
 * [5,1,2,3],
 * [9,5,1,2]
 * ]
 * Output: True
 * Explanation:
 * In the above grid, the diagonals are:
 * "[9]", "[5, 5]", "[1, 1, 1]", "[2, 2, 2]", "[3, 3]", "[4]".
 * In each diagonal all elements are the same, so the answer is True.
 * 
 * @author qiminghao
 *
 */
public class ToeplitzMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ToeplitzMatrix obj = new ToeplitzMatrix();
		int[][] matrix = new int[][] { { 1, 2, 3, 4 }, { 5, 1, 2, 3 }, { 9, 5, 1, 2 } };
		boolean res = obj.isToeplitzMatrix(matrix);
		System.out.println(res);
	}

	public boolean isToeplitzMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			int x = matrix[i][0], col = 0, row = i;
			while (row < matrix.length && col < matrix[0].length) {
				if (matrix[row][col] != x) {
					return false;
				}
				row++;
				col++;
			}
		}
		for (int j = 1; j < matrix[0].length; j++) {
			int x = matrix[0][j], row = 0, col = j;
			while (row < matrix.length && col < matrix[0].length) {
				if (matrix[row][col] != x) {
					return false;
				}
				row++;
				col++;
			}
		}
		return true;
	}

}
