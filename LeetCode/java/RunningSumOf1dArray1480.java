public class RunningSumOf1dArray1480 {
	// 1480. Running Sum of 1d Array

    private static int[] runningSum(int[] nums) {

		//---- Approach 1
		/*int result[] = new int[nums.length];
		result[0] = nums[0];

		for(int i=1; i<nums.length; i++) {
			result[i] = result[i-1] + nums[i];	
		}
        
		return result;*/

		//---- Approach 2
		for(int i=1; i<nums.length; i++) {
			nums[i] += nums[i-1];
		}

		return nums;
    }

	public static void main(String[] args) {
		
		int[] nums = new int[] {2, 4, 3, 9};
		int[] res = runningSum(nums);

		for (int i : res)
			System.out.print(i + " ");
	}
}
