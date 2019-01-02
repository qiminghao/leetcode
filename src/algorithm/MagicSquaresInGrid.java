package algorithm;

/**
 * 840. Magic Squares In Grid
 * 
 * A 3 x 3 magic square is a 3 x 3 grid filled with distinct numbers from 1 to 9
 * such that each row, column, and both diagonals all have the same sum. Given
 * an grid of integers, how many 3 x 3 "magic square" subgrids are there? (Each
 * subgrid is contiguous).
 * 
 * Example 1: Input: [[4,3,8,4], [9,5,1,9], [2,7,6,2]] Output: 1
 * 
 * The following subgrid is a 3 x 3 magic square: 4 3 8 9 5 1 2 7 6
 * 
 * while this one is not: 3 8 4 5 1 9 7 6 2
 * 
 * In total, there is only one magic square inside the given grid.
 * 
 * @author qiminghao
 *
 */
public class MagicSquaresInGrid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MagicSquaresInGrid obj = new MagicSquaresInGrid();
		int[][] grid = new int[][] { { 4, 3, 8, 4 }, { 9, 5, 1, 9 }, { 2, 7, 6, 2 } };
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				System.out.print(grid[i][j] + " ");
			}
			System.out.println();
		}
		int res = obj.numMagicSquaresInside(grid);
		System.out.println(res);
	}

	public int numMagicSquaresInside(int[][] grid) {
		int r = grid.length, c = grid[0].length, res = 0;
		for (int i = 1; i < r - 1; i++) {
			for (int j = 1; j < c - 1; j++) {
				if (grid[i][j] != 5) {
					continue;
				}
				if (isMagicSquares(grid[i - 1][j - 1], grid[i - 1][j], grid[i - 1][j + 1], grid[i][j - 1], grid[i][j],
						grid[i][j + 1], grid[i + 1][j - 1], grid[i + 1][j], grid[i + 1][j + 1])) {
					res++;
				}
			}
		}
		return res;
	}

	public boolean isMagicSquares(int... vals) {
		boolean[] exits = new boolean[16];
		for (int x : vals) {
			exits[x] = true;
		}
		for (int i = 1; i <= 9; i++) {
			if (exits[i] == false) {
				return false;
			}
		}
		return vals[0] + vals[1] + vals[2] == 15 && vals[3] + vals[4] + vals[5] == 15
				&& vals[6] + vals[7] + vals[8] == 15 && vals[0] + vals[3] + vals[6] == 15
				&& vals[1] + vals[4] + vals[7] == 15 && vals[2] + vals[5] + vals[8] == 15
				&& vals[0] + vals[4] + vals[8] == 15 && vals[2] + vals[4] + vals[6] == 15;
	}

}
