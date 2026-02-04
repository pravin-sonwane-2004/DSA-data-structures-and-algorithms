class LeetcodeSingleN{
	public int retSingleApearElement(int [] arr) {
		int n = 0;
		for(int num : arr) {
			n ^= num;
		}
		return n;
	}
	void main() {
		int arr [] = {4,1,2,1,2};
		LeetcodeSingleN obj = new LeetcodeSingleN();
		
		IO.println(obj.retSingleApearElement(arr));
	}
}
