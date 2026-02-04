

public class MajorityElements {
    public static int majorityElement(int[] nums) {
        int votes = 1;
        int curr = nums[0];
        for(int i =0;i<nums.length;i++) {
            if (votes == 0) {
                curr = nums[i];
                votes = 1;
            }else if(curr == nums[i]) {
                votes++;

            }
            else {
                votes --;
            }
        }
        return curr;
    }
}