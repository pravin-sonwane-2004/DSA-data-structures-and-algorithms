// Example 1:
// Input: nums = [2,5,1,3,4,7], n = 3
// Output: [2,3,5,4,1,7] 
// Explanation: Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7].
// Example 2:
// Input: nums = [1,2,3,4,4,3,2,1], n = 4
// Output: [1,4,2,3,3,2,4,1]

class Solution11 {
    public int[] shuffle(int[] nums, int n) {
		int [] newArr = new int[nums.length];
		int j =0;
		for(int i=0;i<n;i++) {
			newArr[j++] = nums[i];
			newArr[j++] = nums[i+n];
		}
		return newArr;
		
		// this wont work for this because this is different so we need to make a new array then run it
        // for(int i=1;i<n;i++) {
           // for(int j=n+1;j<nums.length;j++) {
            // int temp = nums[j];
            // nums[j] = nums[i];
            // nums[i] = temp;
            // break;
           // } 
        // }
        // return nums;
    }
	
	void main() {
		 Solution11 obj = new Solution11();
	int [] nums = {2,5,1,3,4,7}; 
	int n = 3;
		 obj.shuffle(nums,n);
		 for(int s: nums) {
			 System.out.print(s + " ");
		 }
	}
}