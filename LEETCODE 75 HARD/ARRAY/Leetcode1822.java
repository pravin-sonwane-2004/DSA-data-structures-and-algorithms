class Leetcode1822 {
    public static int arraySign(int[] nums) {
        int neg = 0;
        for (int x : nums) {
            if (x == 0) return 0;
            if (x < 0) neg++;
        }
        // If neg count is even, return 1; if odd, return -1
        return neg % 2 == 0 ? 1 : -1; 
    }
	void main() {
		int arr [] = {2,4,-5, -3, -5, 4};
		IO.println(arraySign(arr));
	}
}