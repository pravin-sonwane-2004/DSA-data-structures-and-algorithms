// 762. Prime Number of Set Bits in Binary Representation
// Given two integers left and right, return the count of numbers in the inclusive range [left, right] having a prime number of set bits in their binary representation.

// Recall that the number of set bits an integer has is the number of 1's present when written in binary.

// For example, 21 written in binary is 10101, which has 3 set bits.
// Example 1:

// Input: left = 6, right = 10
// Output: 4
// Explanation:
// 6  -> 110 (2 set bits, 2 is prime)
// 7  -> 111 (3 set bits, 3 is prime)
// 8  -> 1000 (1 set bit, 1 is not prime)
// 9  -> 1001 (2 set bits, 2 is prime)
// 10 -> 1010 (2 set bits, 2 is prime)
// 4 numbers have a prime number of set bits.
// Example 2:

// Input: left = 10, right = 15
// Output: 5
// Explanation:
// 10 -> 1010 (2 set bits, 2 is prime)
// 11 -> 1011 (3 set bits, 3 is prime)
// 12 -> 1100 (2 set bits, 2 is prime)
// 13 -> 1101 (3 set bits, 3 is prime)
// 14 -> 1110 (3 set bits, 3 is prime)
// 15 -> 1111 (4 set bits, 4 is not prime)
// 5 numbers have a prime number of set bits.

class Leetcode762 {
	// to solve this question we need to add a function called isPrime and if it is
	// so we need to add count that from 6 to 10 these much primes we got
	static boolean isPrime(int n) {
		if (n <= 1)
			return false;
		if (n == 2)
			return true;
		if (n % 2 == 0)
			return false;

		for (int i = 3; i * i <= n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	// so this upper side code took a while to work
	// i need to work on it a lot
	public int countPrimeSetBits(int left, int right) {
		int outerCount = 0;
		for(int i=left;i<=right;i++) {
			int count = 0;
			String binary = Integer.toBinaryString(i);
			for(char c : binary.toCharArray()) {
				if(c =='1') {
					++count;
				}
			}
			if(isPrime(count)) {
				++outerCount;
			}
		}
		return outerCount;
	}

	void main() {
		int left = 6;
		int right = 10;
		Leetcode762 l = new Leetcode762();
		IO.println(l.countPrimeSetBits(left,right));
	}
}