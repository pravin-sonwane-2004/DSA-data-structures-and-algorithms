<<<<<<< HEAD
public class Practice {
    private static int [] Delete (int arr [] , int idx) {
        int Newarr [] = new int [arr.length-1];
        for(int i=0,j = 0;i<Newarr.length;i++) {
            if(i!=idx) {
                Newarr [j++] = arr[i];
            }
        }
        return Newarr;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        int idx = 3;
        int Newarr [] = Delete(arr, idx);
        for(int num : Newarr) {
            System.out.println(num);
        }
    }
=======
// Input: nums = [-4,-1,0,3,10]
// Output: [0,1,9,16,100]
//return if power of 4
class Practice {

	// public boolean isPowerOfFour(int n) {
	// if(n==1) {
	// return true;
	// }
	// return isPowerOfFour(n/4);
	// }

	void main() {
		// int n = 16;
		// Practice obj = new Practice();
		// IO.println(obj.isPowerOfFour(n));

		int n = 100;
		for (int i = 2; i < n; i++) {
			boolean flag = false;
			for (int j = 2; j * j < i; j++) {
				if (i % j == 0) {
					flag = false;
					break;
				} else {
					flag = true;
				}
			}
			if (flag) {
				IO.println(i);
			}
		}
	}
>>>>>>> f3503e029d0bc8e88798b8a5e58d2bd331dac72f
}