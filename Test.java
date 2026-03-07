import java.util.*;

class Test {
	void main() {
		// missing number code
		int arr [] = new int[]{1,5,7,9};
		// int i =0;
		// int count = 0;
		// while(i<nums.length) {
		// if(nums[i]!=count) {
			// IO.println(count);
			// count++;
		// }
		// else {
			// count++;
			// i++;
		// }
	// }
	// }
// }
		List<Integer> list = new ArrayList<>();
		int index = 0;
		for(int i = 0;i<arr.length;i++) {
			index = Math.abs(arr[i])-1;
			if(arr[index]>0) {
				arr[index] = -arr[index];
			}
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i] > 0) {
				list.add(i+1);
			}
		}
		IO.println(list);
	}
	
}

// class Test {
    // public int subarraySum(int[] nums, int k) {
        // Map<Integer, Integer> map = new HashMap<>();
        
        // map.put(0, 1);  // base case
        
        // int currentSum = 0;
        // int count = 0;
        
        // for (int num : nums) {
            // currentSum += num;
            
            // if (map.containsKey(currentSum - k)) {
                // count += map.get(currentSum - k);
            // }
            
            // map.put(currentSum, map.getOrDefault(currentSum, 0) + 1);
        // }
        
        // return count;
    // }
	// static  public void  main(String [] args) {
		// int arr [] = {1,3,-1,-3,5,3,6,7};
		// int i;
		// IO.println("jjjjjjjjjjjjj   " + i);
		// main();
	// }
	// public static int main() {
		// IO.println("fsfs0");
		// return 1;
	// }
// }