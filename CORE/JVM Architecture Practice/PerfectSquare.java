class PerfectSquare {
	 public boolean isPerfectSquare(int num) {
        for(int i=1;i<=num;i++) {
            if(i*i==num) {
                return true;
            }
        }
        return false;
    }
	
	
	void main() {
		PerfectSquare obj = new PerfectSquare();
		IO.println(obj.isPerfectSquare(16));
	}
   
}