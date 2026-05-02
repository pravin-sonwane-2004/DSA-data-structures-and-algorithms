public class Leetcode2161 {
    
void main() {
    Solution s = new Solution();
    int [] arr = new int [] {};
}
}
class Solution {
    public int findPivot(int nums[],int  pivot) {
        int found =0;
        for(int i =0;i<nums.length;i++) {
            if(nums[i] == pivot) {
                found = i;
            }
        }
        return found;
    }
    public int[] pivotArray(int[] nums, int pivot) {
        int start = 0;
        int end = nums.length-1;
        int mid = findPivot(nums,pivot);

        while(start <= end) {
            if(nums[end]>nums[mid] && nums[start]<=nums[mid]) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
            }
           else if(nums[start] <=nums[mid]) {
            start++;
           }
           else{
            end--;
           }
        }   
        return nums;
    }
}
