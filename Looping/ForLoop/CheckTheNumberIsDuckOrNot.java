public class CheckTheNumberIsDuckOrNot{
	 public static void main (String [] args) {
		String str = "1000";
		char [] c = str.toCharArray();
		boolean bl = false;
		if(c[0] == '0') {
			bl=false;
		}
		
		else {
			for(int i = 1;i<c.length;i++) {
				if(c[i] =='0')  {
				bl = true;
				break;
				}
			}
			
		}
			System.out.println(bl);
    }
}