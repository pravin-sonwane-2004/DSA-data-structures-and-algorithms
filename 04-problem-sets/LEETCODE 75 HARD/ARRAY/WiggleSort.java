import java.util.*;
class WiggleSort {
	private int j;

	void main() {
		int arr [] = new int[]{1,5,1,1,6,4};
		
		int nums [] = arr.clone();
		
		int mid = nums.length-1 / 2;
		for(int i = nums.length;i>mid;i--) {
			arr[j++] = nums[i];
		}
		IO.println(Arrays.toString(arr));
	}
}