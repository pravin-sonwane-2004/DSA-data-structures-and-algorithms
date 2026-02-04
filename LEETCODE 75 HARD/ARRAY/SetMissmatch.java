// Example 1:
// Input: nums = [1,2,2,4]
// Output: [2,3]
// Example 2:
// Input: nums = [1,1]
// Output: [1,2]

//im not able to do this problem 
import java.util.Arrays;
class SetMissmatch {
    public int[] findErrorNums(int[] nums) {
        int [] newArr = new int [nums.length];
		
        int count = 0;
        for(int i=1;i<nums.length;i++) {
            if(nums[i] == nums[i-1]) {
                newArr[count++] = nums[i-1];
                newArr[count++] = nums[i]+1;
            }
        }
        return newArr;
    }
	void main() {
		int [] nums=  {1,2,2,4};
		 SetMissmatch obj = new SetMissmatch();
		 IO.print(Arrays.toString(obj.findErrorNums(nums)) + "  ");
	}
}