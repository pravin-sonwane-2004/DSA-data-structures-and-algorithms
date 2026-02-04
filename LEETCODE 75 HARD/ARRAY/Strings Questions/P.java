class P {
	void main() {
		String A = "madam";
	    char [] c = A.toCharArray();
		// {m,a,d,a,m}
		 int last=c.length-1;
		 int first = 0;
		 boolean b = false;
		while(first < last) {
		if(c[first] == c[last])  {
			b = true;
		}
		else {
			b = false;
		}
		first++;
		last--;
		}
		System.out.println(b);
		// for(char ch : c) {
			// System.out.println(ch);
		// }
	}
}