//after a long timme i solved this so at first i was not able to solve it but with help of chatgpt i solved 
//it again but next time ill come with great logic...
class Solution {
    public int maxArea(int[] height) {
        int left =0 ;
        int right = height.length-1;
        int max = 0;
       
        while(left < right) {
           max = Math.max( max , (right-left)  * Math.min(height[left],height[right]));

           if(height[right] < height[left]) {
            right--;
           }
           else {
            left++;
           }
        }
        return max;
    }
}