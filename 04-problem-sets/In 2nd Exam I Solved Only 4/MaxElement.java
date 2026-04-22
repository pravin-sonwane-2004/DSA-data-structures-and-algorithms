// Q7. Write a program in java to find the maximum for each and every contigious subarray
// of size k from a given array.
// Expected Output:
// The given array is:
// 1 3 6 21 4 9 12 3 16 10
// The length of each subarray is: 4
// The contagious subarray of length 4 and their maximum value are:
// 1 3 6 21 ----> 21
// 3 6 21 4 ----> 21
// 6 21 4 9 ----> 21
// 21 4 9 12 ----> 21
// 4 9 12 3 ----> 12
// 9 12 3 16 ----> 16
// 12 3 16 10 ----> 16

class MaxElement {
    void main() {
        int[] arr = {1, 3, 6, 21, 4, 9, 12, 3, 16, 10};
		int k = 4;
		int sum =0;
		int max = 0;
		
		for(int i= k;i<arr.length;i++) {
			max = 0;
			for(int j = i-k;j<=i;j++) {
				max = Math.max(max,arr[j]);
			}
			IO.println(max);
		}
    }
}