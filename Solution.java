import java.util.*;

class Solution {
	static int power (int n , int x) {
		int d = 1;
		 for(int i=0;i<x;i++) {
			d = d*n; 
		 }
		return d;
	}
	void main() {
		// IO.println(power(3,3));
		int a  = 10;
		int b = 5;
		a = b+a; // 15
		b = a-b;  // 10
		a = a-b;
		IO.println(b);
	}
}