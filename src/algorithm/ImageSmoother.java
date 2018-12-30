package algorithm;

/**
 * 661. Image Smoother
 * 
 * Given a 2D integer matrix M representing the gray scale of an image, you need
 * to design a smoother to make the gray scale of each cell becomes the average
 * gray scale (rounding down) of all the 8 surrounding cells and itself. If a
 * cell has less than 8 surrounding cells, then use as many as you can.
 * 
 * Example 1: 
 * Input: [[1,1,1], [1,0,1], [1,1,1]] 
 * Output: [[0, 0, 0], [0, 0, 0], [0, 0, 0]] 
 * Explanation: 
 * For the point (0,0), (0,2), (2,0), (2,2): floor(3/4) = floor(0.75) = 0 
 * For the point (0,1), (1,0), (1,2), (2,1): floor(5/6) = floor(0.83333333) = 0 
 * For the point (1,1): floor(8/9) = floor(0.88888889) = 0
 * 
 * Note: 
 * 1. The value in the given matrix is in the range of [0, 255]. 
 * 2. The length and width of the given matrix are in the range of [1, 150].
 * 
 * @author qiminghao
 *
 */
public class ImageSmoother {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImageSmoother obj = new ImageSmoother();
		int[][] M = new int[][] { { 1, 1, 1 }, { 1, 0, 1 }, { 1, 1, 1 } };
		int[][] res = obj.imageSmoother(M);
		for (int i = 0; i < res.length; i++) {
			for (int j = 0; j < res[0].length; j++) {
				System.out.print(res[i][j] + " ");
			}
			System.out.println();
		}
	}

	public int[][] imageSmoother(int[][] M) {
		int[] x = new int[] { -1, 0, 1 };
		int[] y = new int[] { -1, 0, 1 };
		int[][] res = new int[M.length][M[0].length];
		for (int i = 0; i < M.length; i++) {
			for (int j = 0; j < M[0].length; j++) {
				int cnt = 0, sum = 0;
				for (int a : x) {
					for (int b : y) {
						if (i + a >= 0 && i + a < M.length && j + b >= 0 && j + b < M[0].length) {
							cnt++;
							sum += M[i + a][j + b];
						}
					}
				}
				res[i][j] = sum / cnt;
			}
		}
		return res;
	}

}
