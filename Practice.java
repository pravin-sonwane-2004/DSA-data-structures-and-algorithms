// Input: nums = [-4,-1,0,3,10]
// Output: [0,1,9,16,100]
class Practice {
	void main() {
		int arr [] = {-4,-1,0,3,10};
		int nums [] = new int [arr.length];
		 int left = 0;
		 int i = arr.length-1;
		 int right = arr.length-1;
		while(left<=right) {
			int leftIn = arr[left] * arr[left];
			int rightIn = arr[right] * arr[right];
			
			if(leftIn < rightIn) {
				 nums[i--] = rightIn;
				 right--;
			}
			else {
				nums[i--] = leftIn;
				left++;
			}
		}
		for(int n : nums) {
			IO.println(n);
		}
	}
}