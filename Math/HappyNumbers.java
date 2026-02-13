// Input: n = 19
// Output: true
// Explanation:
// 1^2 + 9^2 = 82
// 8^2 + 2^2 = 68
// 6^2 + 8^2 = 100
// 1^2 + 0^2 + 0^2 = 1
// Example 2:

// Input: n = 2
// Output: false

class HappyNumbers {
	   boolean isHappy(int n) {
	while(n!=1) {
		int square = 0;   
			while(n>0) {      //true
			int lastD = n%10;          //1
			square += lastD*lastD;     //9*9 = 82
			n = n/10;                      //n=n/n = 0
			}
			n = square;
        if (n == 4) return false; // shortcut cycle detection
	}
	 return n==1;
}
boolean isHappy(int n) {
    if (n == 1) return true;
    if (n == 4) return false;

    int sum = 0;
    while (n > 0) {
        int d = n % 10;
        sum += d * d;
        n /= 10;
    }

    return isHappy(sum);
}

	void main() {
	int n = 99;
		IO.println(isHappy(n));
	}
}
