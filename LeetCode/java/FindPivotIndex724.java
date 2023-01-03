public class FindPivotIndex724 {

	public static int pivotIndex(int[] nums) {
		//==== LeetCode Approach
		int total = 0, leftSum = 0;

		for (int i : nums) 
			total += i;

		for (int i=0; i<nums.length; i++) {
			if (leftSum == total - nums[i] - leftSum) return i;
			leftSum += nums[i];
		}

		return -1;

		//==== My Approach
		/*int leftSum, rightSum;
		for (int i = 0; i<nums.length; i++) {
			leftSum = rightSum = 0;

			if (i != 0) {
				for (int j=i; j>0; j--)
				leftSum += nums[j-1];
			}

			for (int k=i; k<nums.length-1; k++)
				rightSum += nums[k+1];

			if (leftSum == rightSum) return i;		
		}
		return -1;*/
    }

	public static void main(String[] args) {	
		int[] nums = new int[] {1, 7, -8, 15};
		int result = pivotIndex(nums);
		System.out.print(result);
	}
}