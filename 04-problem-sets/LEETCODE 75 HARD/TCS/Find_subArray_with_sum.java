// Find subarray with given sum (only positive integers)
import java.util.*;
class Find_subArray_with_sum {
	static int [] retSubArr(int arr [],int target) {
		
		  int left = 0;
		  int sum =0;
		  for(int i=0;i<arr.length;i++) {
			   sum += arr[i];
			   
				  if (sum == target) {
                    return new int[]{left, i};
                }
			   while(sum > target) {
				 
				   sum -= arr[left];
				   left++;
				     if(sum == target) {
					   return new int[] {left,i}  ;
				   }
			   }
		  }
		  return new int[]{};
	}
	
	static int [] retSumWithNegativeV(int arr[],int target) {
		
		Map<Integer,Integer> map = new HashMap<>();
		int sum = 0;
		for(int i=0;i<arr.length;i++) {
			sum+= arr[i];
			
			if(map.containsKey(sum-target))   {
				return new int[]{map.get(sum - target) + 1, i};
			}
			
			map.put(sum,i);
		}
		  return new int[]{};
		
	}
	public static void main(String args []) {
		 	int arr [] = new int[]{2,4,1,4,5,1};
		System.out.println(Arrays.toString(retSubArr(arr,5)));	
	}
}