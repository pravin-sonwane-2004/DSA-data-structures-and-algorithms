class PrintNumsFrom1ton {
	static void print1(int n) {
		 if(n==0) {
			 return;
		 }
		print1(n-1);
		System.out.println(n + " "); 
	}
	void main() {
		 print1(16);
	}
}