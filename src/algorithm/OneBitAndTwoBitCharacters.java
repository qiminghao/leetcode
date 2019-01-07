package algorithm;

/**
 * 717. 1-bit and 2-bit Characters
 * 
 * We have two special characters. The first character can be represented by one
 * bit 0. The second character can be represented by two bits (10 or 11). Now
 * given a string represented by several bits. Return whether the last character
 * must be a one-bit character or not. The given string will always end with a
 * zero.
 * 
 * Example 1: Input: bits = [1, 0, 0] Output: True
 * 
 * Example 2: Input: bits = [1, 1, 1, 0] Output: False
 * 
 * Note: 1 <= len(bits) <= 1000. bits[i] is always 0 or 1.
 * 
 * @author qiminghao
 *
 */
public class OneBitAndTwoBitCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OneBitAndTwoBitCharacters obj = new OneBitAndTwoBitCharacters();
		int[] bits = new int[] { 1, 0, 0 };
		boolean res = obj.isOneBitCharacter(bits);
		System.out.println(res);
		bits = new int[] { 1, 1, 1, 0 };
		res = obj.isOneBitCharacter(bits);
		System.out.println(res);
		bits = new int[] { 0, 0 };
		res = obj.isOneBitCharacter(bits);
		System.out.println(res);
	}

	public boolean isOneBitCharacter(int[] bits) {
		int i = 0;
		while (i < bits.length - 1) {
			i += bits[i] + 1;
		}
		return i == bits.length - 1;
	}

}
