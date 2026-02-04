class DuckNumberChecker {
	 public static void main (String [] args) {
		
		String str = "5522";
		char [] c = str.toCharArray();
		
		boolean b = false ;
		if(c [0] == '0') {
			b = false;
		}
		else {
			
			for(int i = 1; i<c.length;i++) {
				if(c[i] == '0' ) {
					b = true;
				}
			}
		}
		System.out.println(b);
		
		
    }
}

