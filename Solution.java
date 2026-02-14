import java.util.*;

class Solution {
	static int power (int n , int x) {
		int d = 1;
		 for(int i=0;i<x;i++) {
			d = d*n; 
		 }
		return d;
	}
	
    public static int[][] transpose(int[][] matrix) {
        int [][] arr = new int[3][3];
        for(int i=0;i<matrix.length;i++) {
            for(int j=0;j<matrix[i].length;j++) {
                arr[i][j] = matrix[j][i];
            }
        }
        return arr;
}
	void main() {
		int arr [][] = {
			{1,2,3},
				{4,5,6},
					{7,8,9}
		}
		IO.println(Arrays.toString(transpose(arr)));
	}
}