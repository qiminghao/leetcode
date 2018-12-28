package algorithm;

/**
 * 867. Transpose Matrix
 * 
 * Given a matrix A, return the transpose of A.
 * 
 * The transpose of a matrix is the matrix flipped over it's main diagonal,
 * switching the row and column indices of the matrix.
 * 
 * Example 1: Input: [[1,2,3],[4,5,6],[7,8,9]] Output: [[1,4,7],[2,5,8],[3,6,9]]
 * 
 * Example 2: Input: [[1,2,3],[4,5,6]] Output: [[1,4],[2,5],[3,6]]
 * 
 * Note: 1. 1 <= A.length <= 1000; 2. 1 <= A[0].length <= 1000
 * 
 * @author qiminghao
 *
 */
public class TransposeMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TransposeMatrix obj = new TransposeMatrix();
		int[][] A = new int[][] { { 1, 2, 3 }, { 4, 5, 6 } };
		int[][] res = obj.transpose(A);
		for (int i = 0; i < res.length; i++) {
			for (int j = 0; j < res[0].length; j++) {
				System.out.print(res[i][j] + " ");
			}
			System.out.println();
		}
	}

	public int[][] transpose(int[][] A) {
		int[][] res = new int[A[0].length][A.length];
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A[0].length; j++) {
				res[j][i] = A[i][j];
			}
		}
		return res;
	}

}
