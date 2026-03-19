// class Solution {
//     //this is not rotation this i reverse
//     // int [] rotate (int [] arr) {
//     //     int start = 0;
//     //     int end = arr.length-1;
//     //     while(start <= end) {
//     //         int temp  = arr[start];
//     //         arr[start] = arr[end];
//     //         arr[end] = temp;
//     //         start++;
//     //         end--;
//     //     }
//     //     return arr;
//     // }
//     // public int findMin(int[] nums) {
//     //     int min = Integer.MAX_VALUE;
//     //     for(int i=0;i<nums.length;i++) {
//     //         min = Math.min(min,nums[i]);
//     //         rotate(nums);
//     //     }
//     //     return min;
//     // }
// }
//we need to use binary search over here

//mid element compared with right element
//nums[mid] > nums[right]
//     → min is in right half

// nums[mid] < nums[right]
//     → min is in left half

// class Solution {
//     public int findMin(int[] nums) {
//         int left = 0;
//         int mid = 0;
//         int right = nums.length-1;
//         while(left < right) {
//             mid = (right+left) /2;
//                 if(nums[right]>nums[mid] && nums[left]>nums[mid]) {
//                     return nums[mid];
//                 }
//                 else if(nums[left] < nums[mid]) {
//                     left++;
//                 }
//                 else {
//                     right--;
//                 }
//             }
//         return -1;
//     }
// }
class Solution {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] > nums[right]) {
                left = mid + 1;   // go right
            } else {
                right = mid;      // keep mid
            }
        }

        return nums[left];
    }
}