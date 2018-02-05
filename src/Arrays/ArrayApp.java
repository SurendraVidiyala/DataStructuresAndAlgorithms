package Arrays;

public class ArrayApp {
	
	/**
	 * Created by surendra_vidiyala on 02/05/18.
	 */


	public static void main(String[] args) {

		int[] nums = new int[10];

		for (int i = 1; i < nums.length; i++) {
			// O(1) constant time complexity...adding in the new item
			nums[i] = 2 * i;
			System.out.println(nums[i]);
		}
		// O(1) random index
		int num = nums[2];
		System.out.println("Num is:" + num);

		// O(N) Linear Search -->o(logN) binary trees -->o(1) hashtables
		for (int j = 0; j < nums.length; j++) {
			if (nums[j] == 6) {
				System.out.println("Index Found, " + j);
				break;
			}
		}

		String[] fruits = new String[5];
		fruits[0] = "Apple";
		fruits[1] = "Banana";
		fruits[2] = "Orange";
		fruits[3] = "Mango";
		fruits[4] = "PineApple";
		
		System.out.println("Fruits Array");
		for (int i = 0; i < fruits.length; i++) {
			System.out.println(fruits[i]);
		}
		
	}
}
