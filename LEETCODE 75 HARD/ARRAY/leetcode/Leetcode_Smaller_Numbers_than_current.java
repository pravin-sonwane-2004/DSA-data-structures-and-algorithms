import java.util.Arrays;
//so the problem here is i was modifying same array and thhis caus that problem     //
    // Input: nums = [8,1,2,2,3]
    // Output: [4,0,1,1,3]

    //always remamber dont modefy array

public class Leetcode_Smaller_Numbers_than_current {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
               if(i!=j) {
                 if (nums[j]<nums[i]) {
                    count++;
                }
               }
            }
            nums[i] = count;
        }
        return nums;
    }
     public int[] corrected(int[] nums) {
        int [] newArr = new int[nums.length];
        for(int i=0;i<nums.length;i++) {
            int count = 0;
            for(int j=0;j<nums.length;j++) {
                 if ((nums[i] > nums[j]) && i!=j) {
                    count++;
               }
            }
            newArr[i]=count;
        }
        return newArr;
    }

    void main() {
    int nums [] = {8,1,2,2,3};
    Leetcode_Smaller_Numbers_than_current obj = new Leetcode_Smaller_Numbers_than_current();
    IO.println("Incorrect Output -> "+Arrays.toString(obj.smallerNumbersThanCurrent(nums)));
     int arr [] = {8,1,2,2,3};
    IO.println("corrected array is -> "+  Arrays.toString(obj.corrected(arr)));
    }
}
