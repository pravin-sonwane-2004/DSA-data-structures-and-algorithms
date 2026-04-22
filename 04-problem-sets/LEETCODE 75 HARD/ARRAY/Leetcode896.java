class Leetcode896 {
    //this approach is not passing three test cases so i need to think differently
    // public boolean isMonotonic(int[] nums) {
    //     if(nums.length == 1) {
    //         return true;
    //     }
    //     if(nums.length > 2) {
    //     if(nums[0]==nums[1]) {
    //         if(nums[1]<nums[2]) {
    //               return increasing(nums);
    //         }
    //         else {
    //              return decreasing(nums);
    //         }
    //     }
    //     }
    //     if(nums[0]<=nums[1]) {
    //         return increasing(nums);
    //     }
    //    return decreasing(nums);
    // }
    // boolean increasing(int arr [] ) {
    //     for(int i = 1;i<arr.length;i++) {
    //         if(!(arr[i-1]<=arr[i])) {
    //             return false;
    //         }
    //     }
    //     return true;
    // }
    //  boolean decreasing(int arr [] ) {
    //     for(int i = arr.length-1;i>0;i--) {
    //         if(!(arr[i-1]>=arr[i])) {
    //             return false;
    //         }
    //     }
    //     return true;
    // }
    public boolean isMonotonic(int[] nums) {
        boolean inc = true;
        boolean dec = true;
        for(int i = 1;i<nums.length;i++) {
            if(nums[i-1]<nums[i]) {
                inc = false;
            }
            else if(nums[i-1]>nums[i]){
                dec = false;
            }
        }
        return dec || inc || false;
    }
	
}