
public class Substring {
    public static void main (String [] args) {
        String str = "HelloWorld";
//        System.out.println( returnSubstring(str,0,5));
       System.out.println(  str.substring(0,5));

    }
    public static String returnSubstring(String str , int si , int ei) {
        String substring = "";
        for(int i = si;i < ei;i++) {
            substring  += str.charAt(i);
        }
        return substring;
    }
}
