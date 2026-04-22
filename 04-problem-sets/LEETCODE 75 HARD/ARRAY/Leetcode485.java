    // Example 1:

    // Input: nums = [1,1,0,1,1,1]
    // Output: 3
    // Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.
    // Example 2:

    // Input: nums = [1,0,1,1,0,1]
    // Output: 2
    class Leetcode485 {
        public int returnCount (int [] nums) {
            int count = 0;
            int maxCount = 0;
            for(int i =0;i<nums.length;i++) {
                if(nums[i]==1) {
                    ++count;
                    maxCount = Math.max(maxCount, count);
                }
                else {
                    count = 0;
                }
            }
            return maxCount;
        }
        void main() {
            int [] nums = { 1, 1, 0, 1, 1, 1};
            Leetcode485 obj = new Leetcode485();
            
        System.out.println(obj.returnCount(nums));
        }
    }