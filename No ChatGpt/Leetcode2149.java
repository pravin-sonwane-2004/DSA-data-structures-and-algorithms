class Leetcode2149 {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int [] positiveArr = new int[n/2];
        int [] negativeArr = new int[n/2];

        int negativeI = 0;
        int positiveI = 0;

        for(int i=0;i<n;i++) {
            if(nums[i]<=0) {
                negativeArr[negativeI] = nums[i];
                negativeI++;
            }
            else {
                positiveArr[positiveI] = nums[i];
                positiveI++;
            }
        }
        int newI = nums.length-1;
        for(int i=0;i<positiveArr.length;i++) {
            negativeI--;
            nums[newI] = negativeArr[negativeI];
            newI--;

            positiveI--;        
            nums[newI] = positiveArr[positiveI];
            newI--;
        }
        return nums;
    }
}