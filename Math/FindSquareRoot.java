class FindSquareRoot {
	void main() {
		int val = 2;
		int n = 2;
		while(n*n <= val) {
			n++;
		}
		IO.println(n-1);
	}
}