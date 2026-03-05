import java.util.*;

class Test {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        
        map.put(0, 1);  // base case
        
        int currentSum = 0;
        int count = 0;
        
        for (int num : nums) {
            currentSum += num;
            
            if (map.containsKey(currentSum - k)) {
                count += map.get(currentSum - k);
            }
            
            map.put(currentSum, map.getOrDefault(currentSum, 0) + 1);
        }
        
        return count;
    }
	static  public void  main(String [] args) {
		int arr [] = {1,3,-1,-3,5,3,6,7};
		int i;
		IO.println("jjjjjjjjjjjjj   " + i);
		main();
	}
	public static int main() {
		IO.println("fsfs0");
		return 1;
	}
}