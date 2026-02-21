public class Practice {
    static void main(String[] x) {
		int left = 6;
		int right = 10;
		//4 -> 
        int ans = right - left;  //10
        String binary = Integer.toBinaryString(ans);   //"10"
        int count = 0;//0
        for(int i=0;i<binary.length();i++) {  //2
            if(binary.charAt(i)=='1') {  
                ++count;
            }
        }
      IO.println(count);
    }
}
   